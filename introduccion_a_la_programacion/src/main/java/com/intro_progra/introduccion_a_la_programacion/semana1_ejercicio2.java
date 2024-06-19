/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intro_progra.introduccion_a_la_programacion;
import javax.swing.JOptionPane;

/**
 * Modifique el programa anterior, de manera que los valores con los que va
 * a trabajar sean ingresados por el usuario
 */

public class semana1_ejercicio2 {
   
    public static void main(String[] args) {
        // Solicitamos al usuario que ingrese los 4 números
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        String input3 = JOptionPane.showInputDialog("Ingrese el tercer número:");
        String input4 = JOptionPane.showInputDialog("Ingrese el cuarto número:");        
        
        // Convertimos los inputs a enteros
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int num3 = Integer.parseInt(input3);
        int num4 = Integer.parseInt(input4);
        
        // Hacemos la suma de los cuatro números
        int suma = num1 + num2 + num3 + num4;
        
        // Calculamos el promedio de los cuatro números
        double promedio = suma / 4.0;

        // Mostramos los 4 números ingresados y los resultados de la suma y el promedio      
        JOptionPane.showMessageDialog(null, "El primer número es: " + num1 + "\n" +
                                            "El segundo número es: " + num2 + "\n" +
                                            "El tercer número es: " + num3 + "\n" +
                                            "El cuarto número es: " + num4 + "\n\n" +
                                            "La suma de los cuatro números es: " + suma + "\n" +
                                            "El promedio de los cuatro números es: " + promedio);
    }    

} 

