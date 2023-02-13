/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia;

import java.util.Scanner;

/**
 *
 * @author Carlos Soler
 */
public class InputOutput {
    
    public void Principal(){
        System.out.println("\nElige una de las dos opciones:");
        System.out.println("1: Listar Alumnos.");
        System.out.println("2: Insertar un nuevo Alumno.");
        System.out.println("0: Cerrar el programa");
    }
    public void ErrorInt(){
        System.out.println("\nSolo puedes escribir un número válido.");
        System.out.println("Prueba otra vez.");
    }
    public void ErrorString(){
        System.out.println("\nEso no es un número");
        System.out.println("Prueba otra vez.");
    }
    public void InsertarNombre(){
        System.out.println("\nNuevo Alumno.");
        System.out.println("Nombre: ");
        System.out.println("Apellido: ");
        System.out.println("Curso: ");
        System.out.println("Nº Asignaturas: ");
        System.out.println("Edad: ");
        System.out.println("Inserte Nombre...");
    }
    public void InsertarApellido(String nombre){
        System.out.println("\nNuevo Alumno.");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: ");
        System.out.println("Curso: ");
        System.out.println("Nº Asignaturas: ");
        System.out.println("Edad: ");
        System.out.println("Inserte Apellido...");
    }
    public void InsertarCurso(String nombre, String apellido){
        System.out.println("\nNuevo Alumno.");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Curso: ");
        System.out.println("Nº Asignaturas: ");
        System.out.println("Edad: ");
        System.out.println("Inserte Curso...");
    }
    public void InsertarAsignaturas(String nombre, String apellido, String curso){
        System.out.println("\nNuevo Alumno.");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Curso: "+curso);
        System.out.println("Nº Asignaturas: ");
        System.out.println("Edad: ");
        System.out.println("Inserte Nº Asignaturas...");
    }
    public void InsertarEdad(String nombre, String apellido, String curso, int asignaturas){
        System.out.println("\nNuevo Alumno.");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Curso: "+curso);
        System.out.println("Nº Asignaturas: "+asignaturas);
        System.out.println("Edad: ");
        System.out.println("Inserte Edad...");
    }
    public void InsertarFinal(String nombre, String apellido, String curso, int asignaturas, int edad){
        System.out.println("\nNuevo Alumno.");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Curso: "+curso);
        System.out.println("Nº Asignaturas: "+asignaturas);
        System.out.println("Edad: "+edad);
        System.out.println("Alumno insertado CORRECTAMENTE");
    }
    
    public int InputInt(Scanner sc){
        int numero;
        
        numero = sc.nextInt();
        sc.reset();
        
        return numero;
    }
    public String InputString(Scanner sc){
        String cadena;
        
        cadena = sc.nextLine();
        sc.reset();
        
        return cadena;
    }
}
