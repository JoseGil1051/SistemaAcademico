package com.gilgarzonj.sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;
import com.gilgarzonj.sistemaacademico.Estudiante;

public class SistemaAcademico {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    ArrayList listaAsignaturas = new ArrayList<>();
    ArrayList listaNotas = new ArrayList<>();
    
    public static void main(String[] args) {
        
    }
    
    public void MenuPrincipal(){
        int opc;
        do{
            System.out.println("|========= MENU PRINCIPAL =========|");
            System.out.println("| 1 | MENU ESTUDIANTES             |");
            System.out.println("| 2 | MENU ASIGNATURAS             |");
            System.out.println("| 3 | MENU NOTAS                   |");
            System.out.println("| 4 | SALIR                        |");
            System.out.println("|==================================|");
            System.out.print("Ingrese una opcion (1 - 4)");
            opc = scanner.nextInt();

            switch (opc){
                //case 1 -> MenuEstudiantes();

                //case 2 -> MenuAsignaturas();

                //case 3 -> MenuNotas();

                //case 4 -> System.out.println("Gracias por utilizar el sistema academico, hasta la proxima...");

                default -> System.out.println("Opcion incorrecta, ingrese nuevamente...");
            }
        } while (opc != 4);
        
    }
    
    public void MenuEstudiantes(){
        int opc;
            
        do{
            System.out.println("|========= MENU ESTUDIANTES =========|");
            System.out.println("| 1 | REGISTRAR ESTUDIANTE           |");
            System.out.println("| 2 | LISTAR ESTUDIANTES             |");
            System.out.println("| 3 | BUSCAR ESTUDIANTE              |");
            System.out.println("| 4 | ACTUALIZAR ESTUDIANTE          |");
            System.out.println("| 5 | ELIMINAR ESTUDIANTE            |");
            System.out.println("| 6 | SALIR                          |");
            System.out.println("|====================================|");
            System.out.print("Ingrese una opcion (1 - 6)");
            opc = scanner.nextInt();
            
            switch (opc){
                case 1 -> RegistrarEstudiante();

                case 2 -> ListarEstudiantes();

                case 3 -> BuscarEstudiante();

                case 4 -> ActualizarEstudiante();
                
                case 5 -> EliminarEstudiante();

                default -> System.out.println("Opcion incorrecta, ingrese nuevamente...");
            }
        }while (opc != 6);
    }
            
    public void MenuAsignaturas(){
        int opc;
        
        do{
            System.out.println("|========= MENU ASIGNATURAS =========|");
            System.out.println("| 1 | REGISTRAR ASIGNATURA           |");
            System.out.println("| 2 | LISTAR ASIGNATURAS             |");
            System.out.println("| 3 | BUSCAR ASIGNATURA              |");
            System.out.println("| 4 | ACTUALIZAR ASIGNATURA          |");
            System.out.println("| 5 | ELIMINAR ASIGNATURA            |");
            System.out.println("| 6 | SALIR                          |");
            System.out.println("|====================================|");
            System.out.print("Ingrese una opcion (1 - 6)");
            opc = scanner.nextInt();
            
            switch (opc){
                //case 1 -> RegistrarAsignatura();

                //case 2 -> ListarAsignaturas();

                //case 3 -> BuscarAsignatura();

                //case 4 -> ActualizarAsignatura();
                
                //case 5 -> EliminarAsignatura();

                default -> System.out.println("Opcion incorrecta, ingrese nuevamente...");
            }
        }while (opc != 6);
    }  
    
    public void MenuNotas(){
        int opc;
        
        do{
            System.out.println("|========= MENU NOTAS =========|");
            System.out.println("| 1 | REGISTRAR NOTA           |");
            System.out.println("| 2 | LISTAR NOTAS             |");
            System.out.println("| 3 | BUSCAR NOTA              |");
            System.out.println("| 4 | ACTUALIZAR NOTA          |");
            System.out.println("| 5 | ELIMINAR NOTA            |");
            System.out.println("| 6 | SALIR                    |");
            System.out.println("|==============================|");
            System.out.print("Ingrese una opcion (1 - 6)");
            opc = scanner.nextInt();
            
            switch (opc){
                //case 1 -> RegistrarNota();

                //case 2 -> ListarNotas();

                //case 3 -> BuscarNota();

                //case 4 -> ActualizarNota();
                
                //case 5 -> EliminarNota();

                default -> System.out.println("Opcion incorrecta, ingrese nuevamente...");
            }
        }while (opc != 6);
    }
    
    //METODO CRUD DE ESTUDIANTE
    
    public void RegistrarEstudiante() {
        Estudiante e = new Estudiante();

        System.out.print("Codigo: ");
        String codigo = scanner.next();
        e.setCodigo(codigo);

        System.out.print("Nombre: ");
        String nombre = scanner.next();
        e.setNombre(nombre); 

        System.out.print("Apellido: ");
        String apellido = scanner.next();
        e.setApellido(apellido);

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        e.setEdad(edad);

        System.out.print("Semestre: ");
        int semestre = scanner.nextInt();
        e.setSemestre(semestre);

        listaEstudiantes.add(e);

        System.out.println("Estudiante registrado correctamente.");
    }
    
    public void ListarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        for (Estudiante e : listaEstudiantes) {
            System.out.println("Codigo: " + e.getCodigo());
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Apellido: " + e.getApellido());
            System.out.println("Edad: " + e.getEdad());
            System.out.println("Semestre: " + e.getSemestre());
            System.out.println("-----------------------------");
        }
    }

    public void BuscarEstudiante() {
        System.out.print("Ingrese codigo a buscar: ");
        String codigo = scanner.next();

        for (Estudiante e : listaEstudiantes) {
            if (e.getCodigo().equals(codigo)) {

                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Apellido: " + e.getApellido());
                System.out.println("Edad: " + e.getEdad());
                System.out.println("Semestre: " + e.getSemestre());
                return;
            }
        }

        System.out.println("Estudiante no encontrado.");
    }
    
    public void ActualizarEstudiante() {
        System.out.print("Ingrese codigo del estudiante: ");
        String codigo = scanner.next();

        for (Estudiante e : listaEstudiantes) {

            if (e.getCodigo().equals(codigo)) {

                System.out.print("Nuevo nombre: ");
                String nombre = scanner.next();
                e.setNombre(nombre);

                System.out.print("Nuevo apellido: ");
                String apellido = scanner.next();
                e.setApellido(apellido);

                System.out.print("Nueva edad: ");
                int edad = scanner.nextInt();
                e.setEdad(edad);

                System.out.print("Nuevo semestre: ");
                int semestre = scanner.nextInt();
                e.setSemestre(semestre);

                System.out.println("Estudiante actualizado.");
                return;
            }
        }

        System.out.println("Estudiante no encontrado.");
    }
    
    public void EliminarEstudiante() {
        System.out.print("Ingrese codigo del estudiante: ");
        String codigo = scanner.next();

        for (int i = 0; i < listaEstudiantes.size(); i++) {

            if (listaEstudiantes.get(i).codigo.equals(codigo)) {

                listaEstudiantes.remove(i);
                System.out.println("Estudiante eliminado.");
                return;
            }
        }

        System.out.println("Estudiante no encontrado.");
    }
    
    //METODO CRUD DE ASIGNATURAS
    
    //METODO CRUD DE ESTUDIANTES
}
