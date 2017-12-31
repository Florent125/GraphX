/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.octave.pause.GraphX;

/**
 *
 * @author florent
 */
public class Block {
    
    protected int x, y, X, Y, Nb_input, Nb_output;
    protected String ID;
    protected int number;
    
    public Block(int x, int y, int X, int Y, int Nb_input, int Nb_output, String ID){
        this.x= x;
        this.y= y;
        this.X= X;
        this.Y= Y;
        this.Nb_input= Nb_input;
        this.Nb_output= Nb_output;
        this.ID= ID;
        this.number= 0;
    }

    @Override
    public String toString() {
        return "It is a Block. The ID is " + this.ID;
    }
    
    

    public int get_posX() {
        return x;
    }

    public int get_posY() {
        return y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public int getNb_input() {
        return Nb_input;
    }

    public int getNb_output() {
        return Nb_output;
    }

    public String getID() {
        return ID;
    }

    public int getNumber() {
        return this.number;
    }
   
    public void set_posX(int x) {
        this.x = x;
    }

    public void set_posY(int y) {
        this.y = y;
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public void setNb_input(int Nb_input) {
        this.Nb_input = Nb_input;
    }

    public void setNb_output(int Nb_output) {
        this.Nb_output = Nb_output;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
    
    
    
    
}
