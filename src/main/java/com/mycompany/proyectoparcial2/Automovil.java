/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoparcial2;
/**
 *
 * @author JORS EDUAR SOLARTE CASTILLO
 */
public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private int horaSalida;

    // Constructores, getters y setters
    public Automovil(int numeroPuertas, String marca, String modelo, String placa, int horaIngreso) {
        super(marca, modelo, placa, horaIngreso);
        this.numeroPuertas = numeroPuertas;
    }
    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public int getHoraSalida() {
        return horaSalida;
    }
    
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    // Otros métodos específicos para automóviles



}