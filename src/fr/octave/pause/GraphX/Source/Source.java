/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.octave.pause.GraphX.Source;

import fr.octave.pause.GraphX.Block;

/**
 *
 * @author flore
 */
public class Source extends Block{
    
    protected String OutputName;
    protected double period;
    
    public Source(int x, int y, int X, int Y, int Nb_output, String ID, double period) {
        super(x, y, X, Y, 0, Nb_output, ID); //Nb_input= 0
        this.period= period;
    }

    public String getOutputName() {
        return this.OutputName;
    }

    public void setOutputName(String OutputName) {
        this.OutputName = OutputName;
    }
    
    public void setPeriod(double period) {
        this.period = period;
    }

    public double getPeriod() {
        return this.period;
    }
    
    
}
