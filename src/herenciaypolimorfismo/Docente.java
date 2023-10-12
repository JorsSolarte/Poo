package herenciaypolimorfismo;
import java.util.List;
import java.util.Map;

public class Docente extends Persona {

    public Docente(String nombre, String apellido, String documento, String nombreUsuario, String contrasea) {
        super(nombre, apellido, documento, nombreUsuario, contrasea);
    }

public void calificarEstudiante(Estudiante estudiante, Materia materia, double nota, Map<String, Estudiante> estudiantes) {
    if (estudiantes == null) {
        System.out.println("Nulo.");
        return;
    }

    
    Estudiante estudianteEnSistema = estudiantes.get(estudiante.getNombreUsuario());
    if (estudianteEnSistema != null && estudianteEnSistema instanceof Estudiante) {
        estudianteEnSistema.agregarNota(materia, nota);
        System.out.println("Calificación registrada para " + estudiante.getNombre() + " en " + materia.getNombre());
    } else {
        System.out.println("Estudiante no encontrado.");
    }
}

    public void subirNotas(Estudiante estudiante, Materia materia, Map<String, Estudiante> estudiantes) {
        if (estudiantes.containsKey(estudiante.getNombreUsuario())) {
            List<Double> notas = estudiante.getNotasPorMateria(materia);
            if (notas != null) {
                System.out.println("Notas de " + estudiante.getNombre() + " en " + materia.getNombre() + ": " + notas);
            }
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
