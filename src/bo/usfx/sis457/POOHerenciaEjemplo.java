/*
 * Archivo que contiene la Clase Principal del Programa
 * - En este ejemplo se muestra el principio de Herencia
 */
package bo.usfx.sis457;

import bo.usfx.sis457.entidades.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Marcelo
 */
public class POOHerenciaEjemplo {
    public static ArrayList<Persona> personas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personas = new ArrayList<>();
        
       personas.add(new Alumno("35-1", 1));
        personas.add(new Docente("Licenciado en Informática", 1 , "222222", "Juan Perez", new GregorianCalendar(1980, 11,01)));
        personas.add(new Alumno("35-2", 1));
        personas.add(new Alumno("35-3", 1));
        personas.add(new Docente("Ingeniero de Sistemas",2));
        personas.add(new Alumno("35-4", 1));
        
        menuPrincipal();
    }
    
    public static void menuPrincipal() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Programa: Universidad                            |");
        System.out.println("| - Ejemplo de Herencia                            |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Gestión de Personas                           |");
        System.out.println("| 2) Gestión de Docentes                           |");
        System.out.println("| 3) Gestión de Alumnos                            |");
        System.out.println("| 4) Gestión de Administrativos                    |");
        System.out.println("| 0) Salir                                         |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuPersonas();
                break;
            case "2":
                menuDocentes();
                break;
            case "3":
                menuAlumnos();
                break;
            case "4":
                menuAdministrativos();
                break;
            default:
                System.out.println("Salió del Programa");
        }        
    }
    public static void menuAdministrativos(){
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Administrativo                        |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Administrativos                        |");
        System.out.println("| 2) Añadir Administrativo                         |");
        System.out.println("| 3) Modificar Administrativo                      |");
        System.out.println("| 4) Borrar Administrativo                         |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAdministrativos();
                volverMenu();
                menuAdministrativos();
                break;
            case "2":
                anadirAdministrativo();
                volverMenu();
                menuAdministrativos();
                break;
            case "3":
                modificarAdministrativo();
                volverMenu();
                menuAdministrativos();
                break;
            case "4":
                borrarAdministrativo();
                volverMenu();
                menuAdministrativos();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuPersonas() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Personas                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Personas                               |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarPersonas();
                volverMenu();
                menuPersonas();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuDocentes() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docentes                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docentes                               |");
        System.out.println("| 2) Añadir Docente                                |");
        System.out.println("| 3) Modificar Docente                             |");
        System.out.println("| 4) Borrar Docente                                |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? \n");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocentes();
                volverMenu();
                menuDocentes();
                break;
            case "2":
                anadirDocente();
                volverMenu();
                menuDocentes();
                break;
            case "3":
                modificarDocente();
                volverMenu();
                menuDocentes();
                break;
            case "4":
                borrarDocente();
                volverMenu();
                menuDocentes();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuAlumnos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Alumnos                               |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Alumnos                                |");
        System.out.println("| 2) Añadir Alumno                                 |");
        System.out.println("| 3) Modificar Alumno                              |");
        System.out.println("| 4) Borrar Alumno                                 |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAlumnos();
                volverMenu();
                menuAlumnos();
                break;
            case "2":
                anadirAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "3":
                modificarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "4":
                borrarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void volverMenu() {
        String opcion;
        Scanner entradaTeclado = new Scanner(System.in);
        while(true) {
            System.out.print("\nPresione M para continuar...");
            opcion = entradaTeclado.next();
            if (opcion.equals("M")) {
                break;
            }
        }
    }
    
    public static void listarPersonas() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Personas                              |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona persona: personas) {
            i++;
            System.out.println(i + ": " + persona);
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static int buscarPersona(int id) {
        boolean existe = false;
        int i = 0;
        for (Persona persona: personas) {
            if (persona.getId() == id) {
                existe = true;
                break;
            }
            i++;
        }
        return existe?i:-1;
    }
    
    public static void listarDocentes() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes                              |");
        System.out.println("+==================================================+");
        int i = 0;
        int c = 0;
        int a=0;
        int opc;
        try{
            BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("+==================================================+");
            System.out.println("| 1: Listado de Docentes  Titulares                |");
            System.out.println("| 2: Listado de Docentes  a Contrato               |");
            System.out.println("| 3: Listado de Todos los docentes                 |");
            System.out.println("|                                                  |");
            System.out.println("+==================================================+");
            opc=Integer.parseInt(entradaTeclado.readLine());
            
            switch(opc){
                case 1: 
                    for (Persona profesor: personas) {
                        if(profesor instanceof DocenteTitular) {
                            i++;
                            System.out.println(i + "Docente Titular:     " + profesor);
                        }
                    }
                    if (i == 0) {
                        System.out.println("No existen registros");
                    }
                    break;
                case 2:
                    for (Persona docente: personas) {
                        
                         if(docente instanceof DocenteContrato){
                            c++;
                            System.out.println(c + "Docentes A Contrato: " + docente);
                        } 
                    }if(c==0){
                           System.out.println("No ecisten Docentes a contrato");
                        }
                    break;
                case 3:
                    for (Persona docente: personas) {
                        if (docente instanceof DocenteTitular) {
                            
                            System.out.println(a + "Docentes  Titulares:  " + docente);
                        }else if(docente instanceof DocenteContrato){
                            
                            System.out.println(a + "Docentes A Contrato:  " + docente);
                        }
                    a++;
                    }
                    break;
                default: volverMenu();
            }
        }catch(Exception ex) {
            System.out.println("error: " + ex.getMessage());
        }
        
    }
    public static void listarAdministrativos(){
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Administrativos                       |");
        System.out.println("+==================================================+");
        int i=0;
        for(Persona administrativo: personas){
            if(administrativo instanceof Administrativo){
                i++;
                System.out.println(i + ": " + administrativo);
            }   
        }
        if(i== 0){
            System.out.println("No existen registros");
        }
    }
    public static void anadirDocente() {
        String carnetIdentidad;
        String fechaNacimiento;
        String nombre;
        String titulo;
        String examenCompetencia;
        String numeroContrato;
        int añosExperiencia ;
        int i,c;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente                                   |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introducir la cantidad de materias que dicta el docente: ");
            i = Integer.parseInt(entradaTeclado.readLine());
            String[] asignaturas = new String[i];
            
            for(c=0;c<i;c++){
            System.out.print("Introduzca asignatura: " );
            asignaturas[c] = entradaTeclado.readLine();
            }
            System.out.print("Introducir Años de experiencia del docente: ");
            añosExperiencia = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            int opcion;
            System.out.print("1: Docente Titular \n 2: Docente con Contrato \n elija opcion \n: ");
            opcion = Integer.parseInt(entradaTeclado.readLine());
            switch(opcion){
                case 1:
                    System.out.print("Introduzca examen de competencia: ");
                    examenCompetencia = entradaTeclado.readLine();
                    personas.add(new DocenteTitular( examenCompetencia, titulo, añosExperiencia, asignaturas, carnetIdentidad, nombre, fechaNacimientoCalendario));
                    break;
                    
                case 2:
                    System.out.print("Introduzca numero de contrato: ");
                    numeroContrato = entradaTeclado.readLine();
                    personas.add(new DocenteContrato(numeroContrato, titulo, añosExperiencia, asignaturas, carnetIdentidad, nombre, fechaNacimientoCalendario));
                    break;
            }
            System.out.println("Registro de Docente correcto");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void modificarDocente() {
        int id;
        Docente docente;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente                                |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docente = (Docente)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + docente.getCarnetIdentidad()+ "': ");
                docente.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + docente.getNombre() + "': ");
                docente.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docente.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docente.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar Asignaturas '" + Arrays.toString(docente.getAsignaturas())+ "': ");
                docente.setAsignaturas(insertar());
                System.out.print("Introduzca el Título Universitario: ");
                docente.setTitulo(entradaTeclado.readLine());
                personas.set(id, docente);
                
                System.out.println("Registro de Docente actualizado");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void modificarAdministrativo() {
        int id;
        Administrativo administrativo;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Administrativo                         |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Administrativo a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                administrativo = (Administrativo)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + administrativo.getCarnetIdentidad()+ "': ");
                administrativo.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + administrativo.getNombre() + "': ");
                administrativo.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(administrativo.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                administrativo.setFechaNacimiento(fechaNacimientoCalendario);
                
                System.out.print("Modificar la Fecha de Ingreso '" + Utilitarios.getFechaCalendario(administrativo.getFechaIngreso()) + "': ");
                Date fechaIngresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaIngresoCalendario = Calendar.getInstance();
                fechaIngresoCalendario.setTime(fechaIngresoDate);
                administrativo.setFechaIngreso(fechaIngresoCalendario);
                
                System.out.print("Modificar el Cargo '" + administrativo.getCargo()+ "': ");
                administrativo.setCargo(entradaTeclado.readLine());
                System.out.print("Introduzca el Lugar de trabajo: ");
                administrativo.setLugarTrabajo(entradaTeclado.readLine());
                personas.set(id, administrativo);
                System.out.println("Registro de Administrativo actualizado");
            } else {
                System.out.println("El Registro de administrativo no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocente() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente                                   |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente borrado");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void borrarAdministrativo() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Administrativo                            |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Administrativo a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Administrativo borrado");
            } else {
                System.out.println("El Registro de Administrativo no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void listarAlumnos() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Alumnos                               |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona alumno: personas) {
            if (alumno instanceof Alumno) {
                i++;
                System.out.println(i + ": " + alumno);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirAlumno() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String carnetUniversitario;
        int semestre;
        
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Alumno                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el CU: ");
            carnetUniversitario = entradaTeclado.readLine();
            System.out.print("Introduzca el Semestre: ");
            semestre = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introducir la cantidad de materias que cursa el alumno: ");
            int c;
            int i = Integer.parseInt(entradaTeclado.readLine());
            String[] asignaturas = new String[i];
            
            for(c=0;c<i;c++){
                System.out.print("Introduzca asignatura: " );
                asignaturas[c] = entradaTeclado.readLine();
            }
            
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Alumno(carnetUniversitario, semestre, asignaturas, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Alumno completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void anadirAdministrativo(){
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;

        String cargo, lugarTrabajo;
        String fechaIngreso;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Administrativo                                   |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el Lugar de trabajo: ");
            lugarTrabajo = entradaTeclado.readLine();
            System.out.print("Introduzca el Cargo: ");
            cargo = entradaTeclado.readLine();
            System.out.println("Introduzca la Fecha de ingreso (ejemplo; 2000-01-01): ");
            fechaIngreso = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            
            Date fechaIngresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaIngreso);
            Calendar fechaIngresoCalendario = Calendar.getInstance();
            fechaIngresoCalendario.setTime(fechaIngresoDate);
            
            personas.add(new Administrativo(cargo, lugarTrabajo, fechaIngresoCalendario, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Administrativo completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAlumno() {
        int id;
        Alumno alumno;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Alumno                                 |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                alumno = (Alumno)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + alumno.getCarnetIdentidad()+ "': ");
                alumno.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + alumno.getNombre() + "': ");
                alumno.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(alumno.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                alumno.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el CU '" + alumno.getCarnetUniversitario() + "': ");
                alumno.setCarnetUniversitario(entradaTeclado.readLine());
                System.out.print("Introduzca el Semestre: ");
                alumno.setSemestre(Integer.parseInt(entradaTeclado.readLine()));
                
                System.out.print("Introduzca asignaturas: ");
                alumno.setAsignatura(insertar());
                
                
                personas.set(id, alumno);
                System.out.println("Registro de Alumno actualizado");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAlumno() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Alumno                                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Alumno borrado");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static String[] insertar() throws IOException {
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        int c;
        System.out.print("Introducir la cantidad de materias dictadas por el docente: ");
        int i = Integer.parseInt(entradaTeclado.readLine());
        String[] asignaturas = new String[i];
            
        for(c=0;c<i;c++){
            System.out.print("Introduzca asignaturas: " );
            asignaturas[c] = entradaTeclado.readLine();
            }
        return asignaturas;
    }
}
