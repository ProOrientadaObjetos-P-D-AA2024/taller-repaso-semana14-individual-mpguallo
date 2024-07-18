package VIEW;

import MODEL.Estudiante;
import CONTROLER.ProcesarEstudiantes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> lstEst = new ArrayList<>();

        ProcesarEstudiantes procesarEstudiantes = new ProcesarEstudiantes(lstEst);
        procesarEstudiantes.calculoPromedios();
        procesarEstudiantes.calculoEstados();
        for (Estudiante est : lstEst)
            procesarEstudiantes.insertarEstudiante(est);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Insertar estudiante");
            System.out.println("2. Actualizar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Listar estudiantes");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese cédula:");
                    String cedula = scanner.nextLine();
                    System.out.println("Ingrese nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese nota 1:");
                    double nota1 = scanner.nextDouble();
                    System.out.println("Ingrese nota 2:");
                    double nota2 = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea

                    Estudiante nuevoEstudiante = new Estudiante(cedula, nombre, nota1, nota2);
                    
                    nuevoEstudiante.getNombreEst();
                    
                    procesarEstudiantes.getLstEstudiantes().add(nuevoEstudiante);
                    procesarEstudiantes.calculoPromedios();
                    procesarEstudiantes.calculoEstados();
                    
                    procesarEstudiantes.getLstEstudiantes().get(0).getNombreEst();
                    procesarEstudiantes.insertarEstudiante(nuevoEstudiante);
                    break;
                case 2:
                    System.out.println("Ingrese cédula del estudiante a actualizar:");
                    cedula = scanner.nextLine();
                    System.out.println("Ingrese nuevo nombre:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese nueva nota 1:");
                    nota1 = scanner.nextDouble();
                    System.out.println("Ingrese nueva nota 2:");
                    nota2 = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea

                    Estudiante estudianteActualizado = new Estudiante(cedula, nombre, nota1, nota2);
                    procesarEstudiantes.calculoPromedios();
                    procesarEstudiantes.calculoEstados();
                    procesarEstudiantes.actualizarEstudiante(estudianteActualizado);
                    break;
                case 3:
                    System.out.println("Ingrese cédula del estudiante a eliminar:");
                    cedula = scanner.nextLine();
                    procesarEstudiantes.eliminarEstudiante(cedula);
                    break;
                case 4:
                    ArrayList<Estudiante> lstEstudiantes = procesarEstudiantes.getLstEstudiantes();
                    for (Estudiante est : lstEstudiantes)
                        System.out.println(est);
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo");
                    break;
            }
        }
    }
}
