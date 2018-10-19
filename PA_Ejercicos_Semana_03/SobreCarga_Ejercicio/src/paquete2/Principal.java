/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();

        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();

        if (numero_nombres == 1) {
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        } else {
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);

        }

        
        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        
        System.out.print("  Agregar un sueldo mensual = 1 \n  Agregar cuatro sueldos de cada semana = 2\n  Agregar cuatro sueldos de cada semana mediante arreglo = 3\n");
        int numero_sueldos = scanner.nextInt();
        scanner.nextLine();
        
        if (numero_sueldos == 1){
            System.out.println("Ingrese el sueldo mensual: ");
            double sueldo = scanner.nextDouble();
            t.agregar_sueldo(sueldo);
        } else if (numero_sueldos == 2) {
            System.out.println("Ingrese los 4 sueldos de cada semana: ");
            double s1,s2,s3,s4;
            
            System.out.println("Ingrese el sueldo 1: ");
            s1 = scanner.nextDouble();
            
            System.out.println("Ingrese el sueldo 2: ");
            s2 = scanner.nextDouble();
            
            System.out.println("Ingrese el sueldo 3: ");
            s3 = scanner.nextDouble();
            
            System.out.println("Ingrese el sueldo 4: ");
            s4 = scanner.nextDouble();
            
            t.agregar_sueldo(s1,s2,s3,s4);
        } else {
            System.out.println("Ingrese los 4 sueldos de cada semana: ");
            double [] sueldos = new double[4];
            
            for (int i = 0; i < sueldos.length; i++){
                System.out.printf("Ingrese el sueldo %d:", i+1);
                sueldos[i] = scanner.nextDouble();
            }
            
            t.agregar_sueldo(sueldos);
        }

        
        

        System.out.printf("Los datos del trabajador son: %s\n", t);

    }
}
