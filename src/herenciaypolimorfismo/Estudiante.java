
package herenciaypolimorfismo;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


public class Estudiante extends Persona {

    private Map<String, List<Double>> notasPorMateria;

    public Estudiante(Map<String, List<Double>> notasPorMateria, String nombre, String apellido, String documento, String nombreUsuario, String contrasea) {
        super(nombre, apellido, documento, nombreUsuario, contrasea);
        this.notasPorMateria = notasPorMateria;
    }  

    public void verNotas() {
        System.out.println("Notas por materia: " + notasPorMateria);
    }

    public void calificarDocente(Docente docente, int calificacion) {
        docente.calificarEstudiante(this, new Materia("Calificación de Docente", "000"), calificacion, null);
    }

    public void agregarNota(Materia materia, double nota) {
        String codigoMateria = materia.getCodigo();
        if (!notasPorMateria.containsKey(codigoMateria)) {
            notasPorMateria.put(codigoMateria, new ArrayList<>());
        }
        notasPorMateria.get(codigoMateria).add(nota);
    }

    public List<Double> getNotasPorMateria(Materia materia) {
        String codigoMateria = materia.getCodigo();
        return notasPorMateria.getOrDefault(codigoMateria, new ArrayList<>());
    }

    public void setNotasPorMateria(Map<String, List<Double>> notasPorMateria) {
        this.notasPorMateria = notasPorMateria;
    }

    
}
   