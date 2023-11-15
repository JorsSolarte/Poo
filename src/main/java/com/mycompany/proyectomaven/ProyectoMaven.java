package com.mycompany.proyectomaven;

import static spark.Spark.*;

public class ProyectoMaven {

    public static void main(String[] args) {
        get("/Cualesminombre", (req, res) -> "Jors Solarte");
        get("/Sumar/:a/:b", (req, res) -> {
            int parametroA = Integer.parseInt(req.params(":a"));
            int parametroB = Integer.parseInt(req.params(":b"));
             
            return sumar(parametroA, parametroB);
        });
    }
    
   public static int sumar(int a, int b){
        return a+b;
    }
}
 