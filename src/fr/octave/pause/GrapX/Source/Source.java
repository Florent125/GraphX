/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.octave.pause.GrapX.Source;

import fr.octave.pause.GrapX.Block;

/**
 *
 * @author flore
 */
public class Source extends Block{
    
    public Source(int x, int y, int X, int Y, int Nb_output, String ID) {
        super(x, y, X, Y, 0, Nb_output, ID); //Nb_input= 0
    }
    
}
