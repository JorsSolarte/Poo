/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoparcial2;
/**
 *
 * @author JORS EDUAR SOLARTE CASTILLO
 */
public class Vehiculo {
    private String marca;
    String modelo;
    String placa;
    private int horaIngreso;
    private int horaSalida = 0;

    // Constructores, getters y setters

    public Vehiculo(String marca, String modelo, String placa, int horaIngreso) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.horaIngreso = horaIngreso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public int getHoraSalida() {
        return horaSalida;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    // Otros métodos específicos si es necesario
}
