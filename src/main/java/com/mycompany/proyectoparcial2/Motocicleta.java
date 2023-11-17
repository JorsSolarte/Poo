/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoparcial2;
/**
 *
 * @author JORS EDUAR SOLARTE CASTILLO
 */
public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private int horaSalida;
    
     // Constructores, getters y setters

    public Motocicleta(int cilindrada, String marca, String modelo, String placa, int horaIngreso) {
        super(marca, modelo, placa, horaIngreso);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public int getHoraSalida() {
        return horaSalida;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada; 
    } 
    
    @Override
    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    
   // Otros métodos específicos para motocicletas

  

    
    
}
