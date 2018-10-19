/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 * @author Renato
 */


// Heredo de la calase Persona
public class Docente extends Persona{
    private double sueldo;
    
    // Creo el constructor de Docente
    public Docente(String n, String a, int e, double sueldo) {
        super(n, a, e);
        setSueldo(sueldo);
        
    }
    
    // Método set del argumento sueldo
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    // Método get del argumento sueldo
    public double getSueldo(){
        return this.sueldo;
    }
    
    // Sobrescribo el método toString de la clase padre Persona
    @Override
    public String toString(){
        return String.format("%s - %.2f", super.toString(), getSueldo());
    }
}
