package herenciaypolimorfismo;
import static herenciaypolimorfismo.SistemaGestionEducativa.administrativoMenu;
import static herenciaypolimorfismo.SistemaGestionEducativa.docenteMenu;
import static herenciaypolimorfismo.SistemaGestionEducativa.estudianteMenu;
import static herenciaypolimorfismo.SistemaGestionEducativa.padreDeFamiliaMenu;
import java.util.HashMap; 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un sistema de gestión educativa
        SistemaGestionEducativa sistema = new SistemaGestionEducativa();

        // Crear usuarios        Estudiante estudiante1 = new Estudiante(new HashMap<>(), "estudiante1", "", "", "","");

        Estudiante estudiante1 = new Estudiante(new HashMap<>(), "estudiante1", "apellido1", "documento1", "estudiante1","2");
        Docente docente1 = new Docente("docente1", "apellido2", "documento2", "docente1", "3");
        Administrativo admin1 = new Administrativo("admin1", "apellido3","documento3" , "admin1", "1");
        PadreDeFamilia padre1 = new PadreDeFamilia("padre1", "apellido4","documento4", "padre1", "4");

        // Agregar usuarios al sistema 
        sistema.agregarUsuario(estudiante1);
        sistema.agregarUsuario(docente1);
        sistema.agregarUsuario(admin1);
        sistema.agregarUsuario(padre1);

        // Crear materias
        Materia matematicas = new Materia("Matemáticas", "101");
        Materia historia = new Materia("Historia", "102");

        // Agregar materias al sistema
        sistema.agregarMateria(matematicas);
        sistema.agregarMateria(historia);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al sistema de gestión educativa.");
            System.out.print("Ingrese su nombre de usuario: ");
            String nombreUsuario = scanner.next();
            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.next();

            Persona usuario = sistema.login(nombreUsuario, contrasena);

            if (usuario == null) {
                System.out.println(" Datos incorrectos. Inténtelo nuevamente.");
            } else {
                System.out.println("Inicio de sesión exitoso como " + usuario.getNombre());
                // Llamar al menú correspondiente según el rol del usuario
                if (usuario instanceof Administrativo) {
                    administrativoMenu((Administrativo) usuario, sistema, scanner);
                } else if (usuario instanceof Docente docente) {
                    docenteMenu(docente, sistema, scanner);
                } else if (usuario instanceof Estudiante estudiante) {
                    estudianteMenu(estudiante, sistema);
                } else if (usuario instanceof PadreDeFamilia) {
                    padreDeFamiliaMenu((PadreDeFamilia) usuario, estudiante1);
                }
                System.out.println("Cerrando sesión...");
            }
            System.out.print("¿Desea salir del programa? (S/N): ");
            String respuesta = scanner.next().toUpperCase();
            if (respuesta.equals("S")) {
                System.out.println("Saliendo del programa...");
                scanner.close();
                System.exit(0);
            }
        }
    }
}



