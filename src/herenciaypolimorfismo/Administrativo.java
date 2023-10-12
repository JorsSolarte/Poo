package herenciaypolimorfismo;
import java.util.Map;

public class Administrativo extends Persona {

    public Administrativo(String nombre, String apellido, String documento, String nombreUsuario, String contrasea) {
        super(nombre, apellido, documento, nombreUsuario, contrasea);
    }
   
    public void registrarEstudiante(Estudiante estudiante, Map<String, Estudiante> estudiantes) {
    
        estudiantes.put(estudiante.getNombreUsuario(), estudiante);
        System.out.println("Estudiante registrado: " + estudiante.getNombre());
    }

    public void actualizarDatosEstudiante(Estudiante estudiante) {
        System.out.println("Datos de estudiante actualizados: " + estudiante.getNombre());
    }

    public void subirMaterias(Materia materia, Map<String, Materia> materias) {
        materias.put(materia.getCodigo(), materia);
        System.out.println("Materia subida: " + materia.getNombre());
    }    
}
