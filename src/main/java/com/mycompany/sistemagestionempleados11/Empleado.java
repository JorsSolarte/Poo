
package com.mycompany.sistemagestionempleados11;

public abstract class Empleado {
   private String nombre;
   private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
    
    public double getSalarioBase() {
        return salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

  
}
