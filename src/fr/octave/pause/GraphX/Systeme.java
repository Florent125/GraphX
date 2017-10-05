/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.octave.pause.GraphX;

import fr.octave.pause.GraphX.Source.Source;
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
    
    public Block getBlock(int n){
        return this.List.get(n);
    }
    
    public int size(){
        return this.List.size();
    }

    public void System2String() {
        for(int i=0; i<this.List.size(); i++){
            System.out.println(this.List.get(i).toString());
        }
    }
    
    public String System2connect(){
        String ans= "GlobalSystemConnection= connect(";
        int i;
        Block b;
        boolean first= false;
        for(i=0; i<this.List.size(); i++){
            b= this.List.get(i);
            if((b instanceof Transfer_Function || b instanceof Correcteur || b instanceof SumBlock) && first){
                ans=  ans + "," + this.List.get(i).getID();
            }else if((b instanceof Transfer_Function || b instanceof Correcteur || b instanceof SumBlock) && !first){
                ans=  ans + this.List.get(i).getID();
                first= true;
            }
        }
        //Faire en sorte d'avoir les accolades en entrée et en sortie
        first= false;
        ans= ans + ",{";
        for(i=0; i<this.List.size(); i++){
            b= this.List.get(i);
            if(b instanceof Source && first){
                ans= ans + "," + "'" + ((Source)b).getOutputName() + "'";
            }else if(b instanceof Source && !first){
                ans= ans + "'" + ((Source)b).getOutputName() + "'";
                first= true;
            }
        }
        first= false;
        ans= ans + "},{";
        for(i=0; i<this.List.size(); i++){
            b= this.List.get(i);
            if(b instanceof Scope && first){
                ans=  ans + ", " + "'" + ((Scope)b).getInputName() + "'";
            }else if(b instanceof Scope && !first){
                ans=  ans + "'" + ((Scope)b).getInputName() + "'";
                first= true;
            }
        }
        
        return ans + "});";
    }
    
    
    
    public void convert2XML(Systeme List, String path){
        
    }
    
    public Systeme openSysteme(String path){
        return null;
    }
}
