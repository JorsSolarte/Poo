
package pkg060923;
import exersice.Persona;
public class Main {

    public static void main(String[] args) {
        Persona[] arrayPerson = new Persona [3];
        //Persona person = new Persona ("Jors","Solarte","1082827792");
        arrayPerson[0] = new Persona("Jors","Solarte","1083738373");
        arrayPerson[1] = new Persona("Juan","Castillo","18283933883");
        arrayPerson[2] = new Persona("David","Ramirez","1928872290");
     
         for(Persona persona : arrayPerson){
         System.out.println(persona.getFirstName());
         System.out.println(persona.getLastName());
         System.out.println(persona.getDocument());
         
     }  
        
    }  
}
