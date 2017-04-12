/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.octave.pause.GrapX;

/**
 *
 * @author flore
 */
public class Scope extends Block{
    
    public Scope(int x, int y, int X, int Y, String ID) {
        super(x, y, X, Y, 1, 0, ID); //Nb_input=1, Nb_ouput= 0;
    }
    
}
