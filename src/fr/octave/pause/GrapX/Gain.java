/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.octave.pause.GrapX;

import java.util.logging.Logger;

/**
 *
 * @author flore
 */
public class Gain extends Block {
    
    private double gain;    
    
    public Gain(int x, int y, int X, int Y, String ID) {
        super(x, y, X, Y, 1, 1, ID); //1 input and 1 output
        
        this.gain= 1.0;
    }    

    public double getGain() {
        return this.gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }    
    
}
