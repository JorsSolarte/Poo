package herenciaypolimorfismo;
public class PadreDeFamilia extends Persona{

    public PadreDeFamilia(String nombre, String apellido, String documento, String nombreUsuario, String contrasea) {
        super(nombre, apellido, documento, nombreUsuario, contrasea);
    }
    
    public void verNotasHijo(Estudiante estudiante) {
    System.out.println("Notas del hijo " + estudiante.getNombre() + ": ");
    estudiante.verNotas();
    } 
    
}
