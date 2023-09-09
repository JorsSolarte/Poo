
package emcapsulamiento;
public class Main {

    public static void main(String[] args) {
     
       Persona persona = new Persona("Jors", 19);
       
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        
        persona.setEdad(21);
        System.out.println("Nueva Edad: " + persona.getEdad());
        
        persona.setEdad(-5);
    }
}
