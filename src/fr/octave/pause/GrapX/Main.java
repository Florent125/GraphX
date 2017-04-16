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
public class Main {
    
    public static void main(String[] args){
        Systeme sys=  new Systeme();
        Transfer_Function tf= new Transfer_Function(0, 0, 10, 15, "1", new double[]{1.0, 2.0}, new double[]{1.0, -3.0}, "u", "y");
        System.out.println(tf.toString());
        
       
    }
    
}
