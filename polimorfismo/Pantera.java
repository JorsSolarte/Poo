
package com.mycompany.polimorfismo;


public class Pantera extends Animal{
    String raza;

    public Pantera(String nombre, String tipoAlimentacion, int edad, String raza) {
        super(nombre,tipoAlimentacion,edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void mostrar(){
        System.out.println(getNombre() + "-"+getTipo_alimentacion()+"-"+getEdad()+"-"+getRaza());
    }

    @Override
    public void Alimentarse() {
        System.out.println("Me alimento de carnes");
    }    
    
}
