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
public class Correcteur extends Block{
    
    private String InputName, OutputName;
    private double Kp, Ki, Kd, Tf;
    //private double Ks; //for discrete system
    
    public Correcteur(int x, int y, int X, int Y, String ID, String InputName, String OutputName) {
        super(x, y, X, Y, 1, 1, "Controller"+ID); //1 input and 1 output
        
        this.InputName= InputName;
        this.OutputName= OutputName;
        
        //Default values of the controller
        this.Kp= 1.0;
        this.Ki= 0.0;
        this.Kd= 0.0;
        this.Tf= 0.0;
    }

    @Override
    public String toString() {
        String ans= this.ID + "=" + "pid("+ this.Kp+ "," + this.Ki + "," + this.Kd + "," + this.Tf + ")";
        return ans;
    }
    
    

    public String getInputName() {
        return this.InputName;
    }

    public String getOutputName() {
        return this.OutputName;
    }

    public void setInputName(String InputName) {
        this.InputName = InputName;
    }

    public void setOutputName(String OutputName) {
        this.OutputName = OutputName;
    }

    public void setKp(double Kp) {
        this.Kp = Kp;
    }

    public void setKi(double Ki) {
        this.Ki = Ki;
    }

    public void setKd(double Kd) {
        this.Kd = Kd;
    }

    public void setTf(double Tf) {
        this.Tf = Tf;
    }
    
    
    
}
