/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author Renato
 */
public class Docente extends Persona{
    private double sueldo;
    
    public Docente(String n, String a, int e, double sueldo) {
        super(n, a, e);
        setSueldo(sueldo);
        
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    @Override
    public String toString(){
        return String.format("%s - %f", super.toString(), getSueldo());
    }
}
