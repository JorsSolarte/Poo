
package exercise_class;
import call.unicauca.edu.co.ex_atrr;
        
public class Exercise_class {

  
    public static void main(String[] args) {
   
        ex_atrr atrr = new ex_atrr();
        System.out.println("Access ver:");
        System.out.println("Name import I1:"+ atrr.name);
        atrr.name= "Camilo";
        
        System.out.println("Name import I2:"+ atrr.name);

        System.out.println("Name year:"+ atrr.year_hbd);
    }
    
}
