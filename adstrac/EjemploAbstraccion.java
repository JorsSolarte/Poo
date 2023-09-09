
package com.mycompany.adstrac;

public class EjemploAbstraccion {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(5.0);
        double area = circulo.calcularArea();
        System.out.println("---------------------------------");
        System.out.println("Area del cirulo:"+ area);
        System.out.println("---------------------------------");

    }
}
