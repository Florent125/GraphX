/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.octave.pause.GraphX;

import fr.octave.pause.GraphX.Link.GroupLink;
import fr.octave.pause.GraphX.Source.Source;
import java.io.*;

/**
 *
 * @author flore
 */
public class Main {
    
    public static void main(String[] args){
        Systeme sys2=  new Systeme();
        Transfer_Function tf= new Transfer_Function(0, 0, 10, 15, "1", new double[]{1.0, 2.0}, new double[]{1.0, -3.0}, "u", "y");
        sys2.addBlock(tf);
        Correcteur C= new Correcteur(0, 0, 10, 10, "1", "u", "y");
        sys2.addBlock(C);
        Gain G1= new Gain(0, 0, 10, 15, "1", "u", "y", 15.5);
        sys2.addBlock(G1);
        sys2.System2String();
        System.out.println(sys2.System2connect());
        System.out.println(G1.toString());
        SumBlock S= new SumBlock(0, 0, 10, 10, "1");
        System.out.println(S.toString());
        String Path= "C:\\Users\\flore\\Desktop\\Nouveau_dossier";
        boolean exit= false;
        int answer;
        int i=0;
        int inc= 0;
        Systeme sys=  new Systeme();
        GroupLink G_Link= new GroupLink();
        while(!exit){
            System.out.println("1- Add a Tf");
            System.out.println("2- Add a Source");
            System.out.println("3- Add a Scope");
            System.out.println("4- Add a Controller");
            System.out.println("5- Add a Gain block");
            System.out.println("6- Add a Sum Blocks");
            System.out.println("7- Display System");
            System.out.println("8- Display Connect function");
            System.out.println("9- Exit");
            answer= Lire.i();
            inc++;
            switch(answer){
                case 1:
                    System.out.println("How many coefficient for the numerator?");
                    int num= Lire.i();
                    double[] Numerator= new double[num];
                    System.out.println("Enter the numerator's coefficient:");
                    for(i=0; i<num; i++){Numerator[i]= Lire.d();}
                    System.out.println("How many coefficient for the denominator?");
                    int den= Lire.i();
                    double[] Denominator= new double[den];
                    System.out.println("Enter the denominator's coefficient:");
                    for(i=0; i<den; i++){Denominator[i]= Lire.d();}
                    System.out.println("Enter Input Name");
                    String In= Lire.S();
                    System.out.println("Enter Output Name");
                    String Out= Lire.S();
                    Transfer_Function tf1= new Transfer_Function(0, 0, 10, 15, ""+inc, Numerator, Denominator, In, Out);
                    sys.addBlock(tf1);
                    break;                            
                case 2:
                    System.out.println("Enter the period");
                    double T= Lire.d();
                    System.out.println("Enter Output Name");
                    String Outsource= Lire.S();
                    Source source= new Source(0, 0, 10, 10, 1, ""+inc, T);
                    source.setOutputName(Outsource);
                    sys.addBlock(source);
                    break;
                case 3:
                    Scope scope= new Scope(0, 0, 10, 10, ""+inc);
                    System.out.println("Enter Input Name");
                    String Inscope= Lire.S();
                    scope.setInputName(Inscope);
                    sys.addBlock(scope);
                    break;
                case 4:
                    System.out.println("Value of Kp");
                    double Kp= Lire.d();
                    System.out.println("Value of Ki");
                    double Ki= Lire.d();
                    System.out.println("Value of Kd");
                    double Kd= Lire.d();
                    System.out.println("Enter Input Name");
                    String Cin= Lire.S();
                    System.out.println("Enter Output Name");
                    String Cout= Lire.S();
                    Correcteur C1= new Correcteur(0, 0, 10, 10, ""+inc, Cin, Cout);
                    C1.setKp(Kp);
                    C1.setKd(Kd);
                    C1.setKi(Ki);
                    sys.addBlock(C1);
                    break;
                case 5:
                    System.out.println("Enter the gain's value");
                    double gain= Lire.d();
                    System.out.println("Enter Input Name");
                    String Gin= Lire.S();
                    System.out.println("Enter Output Name");
                    String Gout= Lire.S();
                    Gain G= new Gain(0, 0, 10, 10, ""+inc, Gin, Gout, gain);
                    sys.addBlock(G);
                    break;
                case 6:
                    break;
                case 7:
                    sys.System2String();
                    break;
                case 8:
                    System.out.println(sys.System2connect());
                    break;
                case 9:
                    generate_Octave_code(sys, G_Link, Path, "Test");
                    exit= true;
                    break;
            }
        }
        
    }
    
    public static void generate_Octave_code(Systeme sys, GroupLink G_link, String Path, String FileName){
        //This function will generate a .m file which corresponds to the octave code
        int n= sys.List.size();
        int i=0;
        try{
            File ff=new File(Path+ "\\" + FileName + ".m"); // définir l'arborescence
            ff.createNewFile();
            FileWriter ffw=new FileWriter(ff);
            for(i=0; i<n; i++){
                Block b= sys.List.get(i);
                if(b instanceof Correcteur || b instanceof Gain || b instanceof Transfer_Function){
                    ffw.write(b.toString());
                    ffw.write("\n");
                }
            }
            ffw.write(sys.System2connect());
            ffw.write("\n");
            ffw.write("step(GlobalSystemConnection);");
            ffw.write("\n"); // forcer le passage à la ligne
            ffw.close(); // fermer le fichier à la fin des traitements
        } catch (Exception e) {
            System.out.println("Error: " + e);
        
        }
    }
    
}
