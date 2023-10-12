
package herenciaypolimorfismo;
public class Persona {

    String nombre,apellido,documento;
    private String nombreUsuario;
    private String contrasea;

    public Persona(String nombre, String apellido, String documento, String nombreUsuario, String contrasea) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.nombreUsuario = nombreUsuario;
        this.contrasea = contrasea;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasea() {
        return contrasea;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasea(String contrasea) {
        this.contrasea = contrasea;
    }
    
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    }
    

