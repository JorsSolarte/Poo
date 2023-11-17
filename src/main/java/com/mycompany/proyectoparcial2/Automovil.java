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

    // Constructores, getters y setters

    public Automovil(int numeroPuertas, String marca, String modelo, String placa, int horaIngreso) {
        super(marca, modelo, placa, horaIngreso);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    // Otros métodos específicos para automóviles
}