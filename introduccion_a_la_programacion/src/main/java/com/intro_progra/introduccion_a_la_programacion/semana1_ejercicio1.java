/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intro_progra.introduccion_a_la_programacion;

/**
 * Escriba un programa que calcule la suma y el promedio de cuatro
 * números de tipo entero y que posteriormente los muestre al usuario.
 */

public class semana1_ejercicio1 {

    public static void main(String[] args) {
        // Asignamos cuatro números enteros a las variables
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        
        // Hacemos la suma de los cuatro números
        int suma = num1 + num2 + num3 + num4;
        
        // Calculamos el promedio de los cuatro números
        double promedio = suma / 4.0;

        // Mostramos los 4 números que definimos      
        System.out.println("El primer número es: " + num1);
        System.out.println("El segundo número es: " + num2);
        System.out.println("El tercer número es: " + num3);
        System.out.println("El cuarto número es: " + num4);        

        
        // Mostramos los resultados de la suma y el promedio  
        System.out.println("\nLa suma de los cuatro números es: " + suma);
        System.out.println("El promedio de los cuatro números es: " + promedio);
    }

}
