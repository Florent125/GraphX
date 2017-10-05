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
public class Gain extends Transfer_Function {
      
    
    public Gain(int x, int y, int X, int Y, String ID, String InputName, String OutputName, double gain) {
        super(x, y, X, Y, "Gain"+ID, new double[]{gain}, new double[]{1.0}, InputName, OutputName);
    }    

}
