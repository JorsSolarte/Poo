package com.mycompany.sistemagestionempleados11;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
       

        empleados.add(new EmpleadoAsalariado(30000, "Juan", 500000) {
        });
        empleados.add(new EmpleadoPorHoras("Rosa", 50000, 40, 400000 ));
        System.out.println("\nEmpleados por horas:");
        for (Empleado empleado : empleados) {
            System.out.println("Nombre:"+ empleado.getNombre()+ ", Salario: "+ empleado.calcularSalario());   
        }
        
         System.out.println("\nEmpleados asalariados:");
        for (Empleado empleado : empleados) {
                System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
        }
       
        Empleado primerEmpleado = empleados.get(0);
        primerEmpleado.setNombre("David");
        primerEmpleado.setSalarioBase(400000);

        System.out.println("\nEmpleados por horas después de la modificación:");
        for (Empleado empleado : empleados) { 
                System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
            
        }
        Empleado segundoEmpleado = empleados.get(1);
        System.out.println("\nEmpleado específico - Nombre: " + segundoEmpleado.getNombre() + ", Salario: " + segundoEmpleado.calcularSalario());
    }
    } 
 


