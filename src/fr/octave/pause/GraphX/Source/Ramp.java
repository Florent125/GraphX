/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.octave.pause.GraphX.Source;

/**
 *
 * @author flore
 */
public class Ramp extends Source{
    
    public Ramp(int x, int y, int X, int Y, int Nb_output, String ID, double period) {
        super(x, y, X, Y, Nb_output, ID, period);
    }

    @Override
    public String toString() {
        return "ramp(";
    }
    
    
    
}
