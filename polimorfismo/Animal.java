
package com.mycompany.polimorfismo;


public abstract class Animal {
       private String nombre,tipoAlimentacion;
    private int edad;

    public Animal(String nombre,String tipoAlimentacion,int edad){
        this.nombre = nombre;
        this.tipoAlimentacion = tipoAlimentacion;
        this.edad = edad;
        
    
}
 public abstract void Alimentarse();

    public void Moverse(){
        System.out.println("El animal se esta moviendo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimentacion() {
        return tipoAlimentacion;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipoAlimentacion = tipo_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 }
