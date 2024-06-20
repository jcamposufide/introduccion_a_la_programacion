/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.intro_progra.introduccion_a_la_programacion;
import javax.swing.JOptionPane;

/**
 * @author johan
 */

public class semana5_ejercicio_practico {

    public static void main(String[] args) {
       // Presento un mensaje de bienvenida al usuario
       JOptionPane.showMessageDialog(null, "Bienvenido al sistema de cálculo del Seguro de Enfermedad y Maternidad (SEM) y el Invalidez, Vejez y Muerte (IVM)\n\n"
                                    + "Considere que los montos a calcular son los siguientes:\n"
                                    + "Seguro de Enfermedad y Maternidad (SEM) al 9.25% del salario.\n"
                                    + "Invalidez, Vejez y Muerte (IVM) al 5.08% del salario.\n");


       // Inicializo variables para los totales de SEM e IVM
        double SEM = 0.0;
        double IVM = 0.0;

        // Solicito la cantidad de empleados
        int cantidadEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de empleados para calcular el SEM e IVM: "));

        // Solicitar el salario y calcular los montos de cada empleado
        for (int i = 0; i < cantidadEmpleados; i++){
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado #" + (i + 1) + ":"));

            // Se calculan el SEM y el IVM
            double totalSEM = salario * 0.0925;
            double totalIVM = salario * 0.0508;

            // Acá se suman los montos a los totales
            SEM += totalSEM;
            IVM += totalIVM;
        }

        // Se calcula el monto total a pagar de SEM + IVM
        double totalAPagar = SEM + IVM;

        // Acá se muestra el resultado que la empresa deberá abonar a la CCSS
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de " + totalAPagar + " en concepto de SEM e IVM");
        
    }
}

