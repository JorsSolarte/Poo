package com.mycompany.sistemagestionempleados11;

public abstract class EmpleadoAsalariado extends Empleado{
   private double decaudaciones;

    public EmpleadoAsalariado(double decaudaciones, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.decaudaciones = decaudaciones;
    }

    public void setDecaudaciones(double decaudaciones) {
        this.decaudaciones = decaudaciones;
    }

    public double getDecaudaciones() {
        return decaudaciones;
    }
    
   @Override
   public double calcularSalario(){
       return getSalarioBase() - decaudaciones;
   }
}
