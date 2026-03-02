package com.gilgarzonj.sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAcademico {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
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
                //case 1 -> RegistrarEstudiante();

                //case 2 -> ListarEstudiantes();

                //case 3 -> BuscarEstudiante();

                //case 4 -> ActualizarEstudiante();
                
                //case 5 -> EliminarEstudiante();

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
        Estudiantes e = new Estudiantes();

        System.out.print("Codigo: ");
        e.codigo = scanner.next();

        System.out.print("Nombre: ");
        e.nombre = scanner.next();

        System.out.print("Apellido: ");
        e.apellido = scanner.next();

        System.out.print("Edad: ");
        e.edad = scanner.nextInt();

        System.out.print("Semestre: ");
        e.semestre = scanner.nextInt();

        listaEstudiantes.add(e);

        System.out.println("Estudiante registrado correctamente.");
    }
}
