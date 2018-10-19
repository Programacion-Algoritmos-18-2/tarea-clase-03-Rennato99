package paquete2;

/**
 * @author reroes
 */
public class Trabajador {
    private String nombres;
    private double sueldo_mensual;
    private String apellidos;
    
    public void agregar_nombres(String n){
        nombres = n;
    }
    
    public void agregar_nombres(String n1, String n2){
        nombres = String.format("%s-%s", n1, n2);
    }
    
    // Agregar sueldo UNICO (mensual)
    public void agregar_sueldo(double sueldo){
        sueldo_mensual = sueldo;
    }
    
    // Agregar sueldo mediante cada uno
    public void agregar_sueldo(double sueldo1, double sueldo2, double sueldo3, double sueldo4){
        sueldo_mensual = sueldo1 + sueldo2 + sueldo3 + sueldo4;
    }
    
    // Agregar sueldo mediante ARREGLO
    public void agregar_sueldo(double[] arreglo){
        sueldo_mensual = 0;
        for(int i =0; i < arreglo.length; i++){
            sueldo_mensual += arreglo[i];
        }
    }
        
    public void agregar_apellidos(String n){
        apellidos = n;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public double obtener_sueldo_mensual(){
        return sueldo_mensual;
    }
    
    public String presentar_datos(){
        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    }
    
}
