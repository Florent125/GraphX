/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.octave.pause.GrapX;

import java.util.ArrayList;

/**
 *
 * @author flore
 */
public class Systeme {
    
    protected ArrayList<Block> List;
    public int increment= 0;    
    
    public Systeme(){
        this.List= new ArrayList<Block>();
    }
    
    public void addBlock(Block b){
        this.List.add(b);
        this.increment++;
        b.setNumber(this.increment);
    }
    
    public void removeBlock(Block b){
        this.List.remove(b);
    }
    
    public void convert2XML(Systeme List, String path){
        
    }
    
    public Systeme openSysteme(String path){
        return null;
    }
}
