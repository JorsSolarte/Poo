package herenciaypolimorfismo;
import java.util.ArrayList;
import java.util.List;

public class Materia {
    private  String nombre;
    private  String codigo;
    private  List<Double> notas;

    public Materia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.notas = new ArrayList<>();
    }

    public void aregarNota(double nota){
        notas.add(nota);   
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
    
    }
    

