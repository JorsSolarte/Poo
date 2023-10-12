
package herenciaypolimorfismo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 
import java.util.Scanner;
//import java.util.LinkedList;
public class SistemaGestionEducativa {

    public List<Persona> usuarios;
    public Map<String, Materia> materias;
    
    public SistemaGestionEducativa() {
        usuarios = new ArrayList<>();
        materias = new HashMap<>();
    }

    public Persona login(String nombreUsuario, String contrasena) {
    for (Persona usuario : usuarios) {
        if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasea().equals(contrasena)) {
            return usuario;
        }
    }
    return null; // Datos incorrectos
}

    public void agregarUsuario(Persona usuario) {
        usuarios.add(usuario);
    }

    public List<Persona> getUsuarios() {
        return usuarios;
    }
    
        public Map<String, Estudiante> getEstudiantes() {
    Map<String, Estudiante> estudiantes = new HashMap<>();
    for (Persona usuario : usuarios) {
        if (usuario instanceof Estudiante) {
            estudiantes.put(usuario.getNombreUsuario(), (Estudiante) usuario);
        }
    }
    return estudiantes;
}
        
    public void agregarMateria(Materia materia) {
        materias.put(materia.getCodigo(), materia);
    }

    public Map<String, Materia> getMaterias() {
        return materias;
    }
    
    public Persona buscarUsuarioPorNombreUsuario(String nombreUsuario) {
        for (Persona usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    public Materia buscarMateriaPorCodigo(String codigo) {
        return materias.get(codigo);
    }
    
        public static void administrativoMenu(Administrativo admin, SistemaGestionEducativa sistema, Scanner scanner) {
        while (true) {
            System.out.println("\nMenú Administrativo");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Actualizar datos de estudiante");
            System.out.println("3. Subir materia");
            System.out.println("4. Volver al menú principal");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    // Registrar estudiante
                    Estudiante nuevoEstudiante = crearEstudiante(scanner);
                    admin.registrarEstudiante(nuevoEstudiante, sistema.getEstudiantes());
                }
                case 2 -> {
                    // Actualizar datos de estudiante
                    System.out.print("Ingrese el nombre de usuario del estudiante a actualizar: ");
                    String nombreUsuario = scanner.next();
                    Estudiante estudianteAActualizar = sistema.getEstudiantes().get(nombreUsuario);
                    if (estudianteAActualizar != null) {
                        actualizarDatosEstudiante(estudianteAActualizar, scanner);
                        admin.actualizarDatosEstudiante(estudianteAActualizar);
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                }
                case 3 -> {
                    // Subir materia
                    System.out.print("Ingrese el código de la materia a subir: ");
                    String codigoMateria = scanner.next();
                    Materia nuevaMateria = crearMateria(scanner, codigoMateria);
                    admin.subirMaterias(nuevaMateria, sistema.getMaterias());
                }
                case 4 -> {
                    return;
                }
                default -> System.out.println("Opción no válida. Inténtelo nuevamente.");
            }
        }
    }

    public static void docenteMenu(Docente docente, SistemaGestionEducativa sistema, Scanner scanner) {
        while (true) {
            System.out.println("\nMenú de Docente");
            System.out.println("1. Calificar estudiante");
            System.out.println("2. Subir notas");
            System.out.println("3. Volver al menú principal");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    // Calificar estudiante
                    Estudiante estudiante = seleccionarEstudiante(sistema.getEstudiantes(), scanner);
                    if (estudiante != null) {
                        Materia materia = seleccionarMateria(sistema.getMaterias(), scanner);
                        if (materia != null) {
                            System.out.print("Ingrese la calificación para el estudiante: ");
                            double calificacion = scanner.nextDouble();
                            docente.calificarEstudiante(estudiante, materia, calificacion, sistema.getEstudiantes());
                        } else {
                            System.out.println("Materia no encontrada.");
                        }
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                }
                case 2 -> {
                    // Subir notas
                    Estudiante estudiante2 = seleccionarEstudiante(sistema.getEstudiantes(), scanner);
                    if (estudiante2 != null) {
                        Materia materia2 = seleccionarMateria(sistema.getMaterias(), scanner);
                        if (materia2 != null) {
                            docente.subirNotas(estudiante2, materia2, sistema.getEstudiantes());
                        } else {
                            System.out.println("Materia no encontrada.");
                        }
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                }
                case 3 -> {
                    return;
                }
                default -> System.out.println("Opción no válida. Inténtelo nuevamente.");
            }
        }
    }

    public static void estudianteMenu(Estudiante estudiante, SistemaGestionEducativa sistema) {
        while (true) {
            System.out.println("\nMenú de Estudiante");
            System.out.println("1. Ver notas");
            System.out.println("2. Calificar docente");
            System.out.println("3. Volver al menú principal");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> // Ver notas
                    estudiante.verNotas();
                case 2 -> {
                    // Calificar docente
                    Docente docente = seleccionarDocente(sistema.getUsuarios(), scanner);
                    if (docente != null) {
                        System.out.print("Ingrese la calificación para el docente: ");
                        int calificacion = scanner.nextInt();
                        estudiante.calificarDocente(docente, calificacion);
                    } else {
                        System.out.println("Docente no encontrado.");
                    }
                }
                case 3 -> {
                    return;
                }
                default -> System.out.println("Opción no válida. Inténtelo nuevamente.");
            }
        }
    }

    public static void padreDeFamiliaMenu(PadreDeFamilia padre, Estudiante estudiante) {
        while (true) {
            System.out.println("\nMenú de Padre de Familia");
            System.out.println("1. Ver notas de su hijo");
            System.out.println("2. Volver al menú principal");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> // Ver notas del hijo
                    padre.verNotasHijo(estudiante);
                case 2 -> {
                    return;
                }
                default -> System.out.println("Opción no válida. Inténtelo nuevamente.");
            }
        }
    }

    public static Estudiante crearEstudiante(Scanner scanner) {
        System.out.print("Ingrese el nombre de usuario del estudiante: ");
        String nombreUsuario = scanner.next();
        System.out.print("Ingrese la contraseña del estudiante: ");
        String contrasena = scanner.next();
        System.out.print("Ingrese la edad del estudiante: ");
        String documento = scanner.next();
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = scanner.next();
        Map<String, List<Double>> notasPorMateria = null;
        return new Estudiante(notasPorMateria, nombre, apellido, documento, nombreUsuario, contrasena);
    }

    public static void actualizarDatosEstudiante(Estudiante estudiante, Scanner scanner) {
        System.out.print("Ingrese la nueva edad del estudiante: ");
        System.out.print("Ingrese el nuevo nombre del estudiante: ");
        String nuevoNombre = scanner.next();
        estudiante.setNombre(nuevoNombre);
        System.out.print("Ingrese el nuevo apellido del estudiante: ");
        String nuevoApellido = scanner.next();
        estudiante.setApellido(nuevoApellido);
    }

    public static Materia crearMateria(Scanner scanner, String codigo) {
        System.out.print("Ingrese el nombre de la materia: ");
        String nombre = scanner.next();
        return new Materia(nombre, codigo);
    }

    public static Estudiante seleccionarEstudiante(Map<String, Estudiante> estudiantes, Scanner scanner) {
        System.out.print("Ingrese el nombre de usuario del estudiante: ");
        String nombreUsuario = scanner.next();
        return estudiantes.get(nombreUsuario);
    }

    public static Materia seleccionarMateria(Map<String, Materia> materias, Scanner scanner) {
        System.out.print("Ingrese el código de la materia: ");
        String codigoMateria = scanner.next();
        return materias.get(codigoMateria);
    }

    public static Docente seleccionarDocente(List<Persona> usuarios, Scanner scanner) {
        System.out.print("Ingrese el nombre de usuario del docente: ");
        String nombreUsuario = scanner.next();
        for (Persona usuario : usuarios) {
            if (usuario instanceof Docente && usuario.getNombreUsuario().equals(nombreUsuario)) {
                return (Docente) usuario;
            }
        }
        return null;
    }
}
