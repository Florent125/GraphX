/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.octave.pause.GraphX.Link;

import fr.octave.pause.GraphX.*;

/**
 *
 * @author flore
 */
public class Link {
    
    private final int InputLink;
    private final int OutputLink;
    
    public Link(Block b_In, Block b_Out){
        this.InputLink= b_In.getNumber();
        this.OutputLink= b_Out.getNumber();
    }

    public int getInputLink() {
        return this.InputLink;
    }

    public int getOutputLink() {
        return this.OutputLink;
    }
    
    public void set_Input_Output(Systeme sys){
        Block b;
        for(int i=0; i<sys.size(); i++){
            b= sys.getBlock(i);
            if(b instanceof Correcteur || b instanceof Gain || b instanceof Transfer_Function){
                if(b.getNumber() == this.InputLink || b.getNumber() == this.OutputLink){
                    
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Link{" + '}';
    }
    
    
    
}
