/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.octave.pause.GraphX;

/**
 *
 * @author flore
 */
public class Transfer_Function extends Block {
    
    private double[] numerator, denominator;
    private String InputName, OutputName;
    
    public Transfer_Function(int x, int y, int X, int Y, String ID, double[] numerator, double[] denominator, String InputName, String OutputName) {
        super(x, y, X, Y, 1, 1, "tf"+ID); // 1 input and 1 ouput
        int n= numerator.length;
        int d= denominator.length;
        this.numerator= new double[n];
        this.denominator= new double[d];
                
        System.arraycopy(numerator, 0, this.numerator, 0, n);
        System.arraycopy(denominator, 0, this.denominator, 0, d);
        
        
        this.InputName= InputName;
        this.OutputName= OutputName;        
    }
    
    public Transfer_Function(int x, int y, int X, int Y, String ID) {
        super(x, y, X, Y, 1, 1, "tf"+ID); // 1 input and 1 ouput
        
        this.numerator= new double[]{1.0};
        this.denominator= new double[]{1.0, 1.0};
        
        this.InputName= "u" + this.number;
        this.OutputName= "y" + this.number;
    }

    @Override
    public String toString() {
        int i;
        
        String num= "[";
        int n= this.numerator.length;
        for(i=0; i<n; i++){
            num= num+ " " + this.numerator[i];
        }
        num= num+ "]";
        
        String den= "[";
        n= this.denominator.length;
        for(i=0; i<n; i++){
            den= den+ " " + this.denominator[i];
        }
        den= den+ "]";
        
        String ans= this.ID + "= tf(" + num + " , " + den + ");";
        return ans;
    }
    
    

    public double[] getNumerator() {
        return this.numerator;
    }

    public double[] getDenominator() {
        return this.denominator;
    }

    public String getInputName() {
        return this.InputName;
    }

    public String getOutputName() {
        return this.OutputName;
    }

    public void setNumerator(double[] numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(double[] denominator) {
        this.denominator = denominator;
    }

    public void setInputName(String InputName) {
        this.InputName = InputName;
    }

    public void setOutputName(String OutputName) {
        this.OutputName = OutputName;
    }
    
    
    
}
