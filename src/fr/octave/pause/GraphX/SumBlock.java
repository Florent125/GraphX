/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.octave.pause.GraphX;

import java.util.ArrayList;

/**
 *
 * @author flore
 */
public class SumBlock extends Block {
    
    private boolean[] Sign;
    private String[] InputName;
    private String OutputName;

    public SumBlock(int x, int y, int X, int Y, int Nb_input, String ID, boolean[] sign, String[] InputName, String OutputName) {
        super(x, y, X, Y, Nb_input, 1, "Sumblock"+ID); //1 Output
        
        int length_sign= sign.length;
        this.Sign= new boolean[length_sign];        
        System.arraycopy(sign, 0, this.Sign, 0, length_sign); //The sign of each input in the sum
        
        int length_InputName= InputName.length;
        this.InputName=  new String[length_InputName];
        System.arraycopy(InputName, 0, this.InputName, 0, length_InputName);
        
        this.OutputName= OutputName;
    }
    public SumBlock(int x, int y, int X, int Y, String ID) {
        super(x, y, X, Y, 2, 1, "Sumblock"+ID); //2 Input & 1 Output
        
        this.Sign= new boolean[]{true, false};
        this.InputName= new String[]{"r", "y"};
        this.OutputName= "e";
    }
    

    @Override
    public String toString() {
        String ans= "'" + this.OutputName + "=";
        for(int i=0; i<this.Sign.length; i++){
            if(this.Sign[i]){
                ans= ans + "+" + this.InputName[i];
            }else{
                ans= ans + "-" + this.InputName[i];
            }
        }
        ans= ans + "'";
        return this.ID+ "= sumblk(" + ans + ");";
    }
    
}
