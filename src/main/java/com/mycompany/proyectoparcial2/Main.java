package com.mycompany.proyectoparcial2;
import static spark.Spark.*;
import com.google.gson.Gson;
import java.time.LocalDateTime;

import java.util.ArrayList;
/**
 *
 * @author JORS EDUAR SOLARTE CASTILLO
 */
public class Main {

    public static void main(String[] args) {
       
     /*
        * Esto nos sirve para generar un formato json para retornar la data del array
        * sin tener que acomodarla bonita de manera manual
        */
        Gson gson = new Gson();
        

        ArrayList<Vehiculo> automoviles = new ArrayList<>();
        ArrayList<Vehiculo> motos = new ArrayList<>();
       
        // Automovil creado por defecto 
        Automovil auto = new Automovil(4, "Mazda", "3", "zyx987", 12);
        automoviles.add(auto);
        
        Motocicleta moto = new Motocicleta(600, "Honda", "CBR600", "XYZ789", 11);
        motos.add(moto);
       
        // Definir endpoints
        
        // Listado de motos
        get("/motos", (req, res) -> {
            res.type("application/json");
            return gson.toJson(motos);
        });
        // Agregar una moto
        get("/agregarMoto/:marca/:modelo/:placa/:cilindrada/:horaIngreso", (req, res) -> {
            res.type("application/json");

            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            int cilindrada = Integer.parseInt(req.params(":cilindrada"));
            int horaIngreso = Integer.parseInt(":horaIngreso");

            Motocicleta nuevaMoto = new Motocicleta(cilindrada, marca, modelo, placa, horaIngreso);
            motos.add(nuevaMoto);

            return gson.toJson(nuevaMoto);
        });
        
        // Obtener lista de motos actuales
        get("/motosActuales", (req, res) -> {
            res.type("application/json");
            return gson.toJson(motos);
        });
        
        // Registrar hora de salida de una moto
        get("/registrarSalidaMoto/:placa", (req, res) -> {
            res.type("application/json");

            String placa = req.params(":placa");

            for (Vehiculo m : motos) {
                if (m.getPlaca().equals(placa)) {
                    m.setHoraSalida( obtenerHoraActual() );
                    return gson.toJson(m);
                }
            }

            return "Moto no encontrada";
        });
        
        // Reporte de ganancias para motos
        get("/motosReporte", (req, res) -> {
            res.type("application/json");
            return obtenerReporteGanancias(motos);
        });
        
        /////////////////////////////////////////////////////////////////
        
        // Listado de automoviles
        get("/automoviles", (req, res) -> {
            res.type("application/json");
            return gson.toJson(automoviles);
        });
        
        // Guardar automovil
        
        // endpoint GET para agregar un automóvil
        get("/agregarAutomovil/:marca/:modelo/:placa/:numeroPuertas/:horaIngreso", (req, res) -> {
            
            // Añadimos esto para retornar en formato Json
            res.type("application/json");

            // Obtener parámetros de la URL
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            int horaIngreso = Integer.parseInt(":horaIngreso");
            
            // No olvidar convertir en integer los string numericos que llegan por url
            int numeroPuertas = Integer.parseInt(req.params(":numeroPuertas"));

            // Crear un nuevo automóvil y agregarlo al parqueadero
            Automovil nuevoAuto = new Automovil(numeroPuertas, marca, modelo, placa, horaIngreso);
            automoviles.add(nuevoAuto);

            return gson.toJson(nuevoAuto);
        });
        
        // Obtener lista de automóviles actuales
        get("/automovilesActuales", (req, res) -> {
            res.type("application/json");
            return gson.toJson(automoviles);
        });
        
        // Registrar hora de salida de un automóvil
        get("/registrarSalidaAuto/:placa", (req, res) -> {
            res.type("application/json");

            String placa = req.params(":placa");

            for (Vehiculo v : automoviles) {
                if (v.getPlaca().equals(placa)) {
                    v.setHoraSalida(obtenerHoraActual());
                    return gson.toJson(v);
                }
            }
            return "Automóvil no encontrado";
        });
        
        // Reporte de ganancias para automóviles
        get("/automovilesReporte", (req, res) -> {
            res.type("application/json");
            return obtenerReporteGanancias(automoviles);
        });
        
    }
    
    //metodo para poder calcular el resgistro de salida de un vehiculo
    private static int obtenerHoraActual() {
    //Obtener hora actual
    LocalDateTime now = LocalDateTime.now();
    return now.getHour();
    }

    //metodo para calcular ganancias e
    private static int calcularGanancias(Vehiculo v) {
    
    int horaActual = obtenerHoraActual();
    // Calcular el tiempo que el vehículo ha estado en el parqueadero
    int tiempoEnParqueadero = horaActual - v.getHoraIngreso();

    //tarifa por hora
    int tarifaPorHora = 10000;

    // Calcular las ganancias para el vehículo
    int ganancias = tiempoEnParqueadero * tarifaPorHora;

    return ganancias;
}
    
  private static String obtenerReporteGanancias(ArrayList<Vehiculo> vehiculos) {
    int totalGanancias = 0;

    for (Vehiculo v : vehiculos) {
        totalGanancias += calcularGanancias(v);
    } return "Ganancias del día: " + totalGanancias;
}
}
     
   
