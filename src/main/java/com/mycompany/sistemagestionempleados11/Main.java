package sistemadegestionempleados;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<EmpleadoAsalariado> empleadosAsalariados = new ArrayList<>();
        ArrayList<EmpleadoPorHoras> empleadosPorHoras = new ArrayList<>();
       
        //se utiliza '{}' en la creación de instancias de una clase abstracta 
        empleados.add(new EmpleadoAsalariado(30000, "Juan", 1160000) {} );
        empleados.add(new EmpleadoAsalariado(40000, "Antidio", 1700000) {} );
        empleados.add(new EmpleadoAsalariado(35000, "Raul", 1200000) {} );
        empleados.add(new EmpleadoAsalariado(50000, "Lupin", 2300000) {} );
        empleados.add(new EmpleadoAsalariado(20000, "Alfonso", 1170000) {} );
        
        empleados.add(new EmpleadoPorHoras("Rosa", 6350, 174, 0 ));
        empleados.add(new EmpleadoPorHoras("Jose", 6350, 180, 0 ));
        empleados.add(new EmpleadoPorHoras("Ramiro",6350 , 179, 0 ));
        empleados.add(new EmpleadoPorHoras("Santiago", 6350, 183, 0 ));
        empleados.add(new EmpleadoPorHoras("Jhon", 6350, 176, 0 ));
     
        empleados.addAll(empleadosAsalariados);
        empleados.addAll(empleadosPorHoras);
        
        System.out.println("Bienvenido al sisitema de gestion de empleados");
        
        System.out.println("-----------------------------------------------");
        System.out.println("--EMPLEADOS ASALARIADOS--");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoAsalariado) {
                System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
            }
        }
        
        System.out.println("-----------------------------------------------");
        System.out.println("--EMPLEADOS POR HORAS--");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
            }
        }
       
        Empleado sextoEmpleado =  empleados.get(5);
        sextoEmpleado.setNombre("David");

        System.out.println("-----------------------------------------------");
        System.out.println("--EMPLEADOS POR HORAS MODIFICADOS--");
        for (Empleado empleado : empleados) { 
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
            }
        }
        System.out.println("-----------------------------------------------");
        Empleado segundoEmpleado = empleados.get(1);
        System.out.println("--EMPLEADO ESPESIFICO-- ");
        System.out.println(" Nombre: " + segundoEmpleado.getNombre() + ", Salario: " + segundoEmpleado.calcularSalario());
    }
    } 
 


