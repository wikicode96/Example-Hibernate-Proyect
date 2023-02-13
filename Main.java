package com.mycompany.academia;

import java.util.Scanner;

/**
 *
 * @author Carlos Soler
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        InputOutput io = new InputOutput();
        
        int i = -1;
        
        while(i!=0){
            switch (i){
                case -1: {
                    io.Principal();
                    try {
                        i = io.InputInt(sc);
                    } catch (Exception e) {
                        io.ErrorString();
                    }
                }
                case 1: {
                    Acceso acc = new Acceso();
                    acc.listarAlumnos();
                    io.Principal();
                    
                    try {
                        i = io.InputInt(sc);
                    } catch (Exception e) {
                        io.ErrorString();
                    }
                }
                case 2: {
                    String nombre;
                    String apellido;
                    String curso;
                    int asignaturas;
                    int edad;
                    
                    io.InsertarNombre();
                    nombre = io.InputString(sc);
                    
                    io.InsertarApellido(nombre);
                    apellido = io.InputString(sc);
                    
                    io.InsertarCurso(nombre, apellido);
                    curso = io.InputString(sc);
                    
                    io.InsertarAsignaturas(nombre, apellido, curso);
                    asignaturas = io.InputInt(sc);
                    
                    io.InsertarEdad(nombre, apellido, curso, asignaturas);
                    edad = io.InputInt(sc);
                    
                    io.InsertarFinal(nombre, apellido, curso, asignaturas, edad);
                    Acceso acc = new Acceso();
                    acc.insertarAlumno(nombre, apellido, curso, asignaturas, edad);
                    
                    io.Principal();
                    try {
                        i = io.InputInt(sc);
                    } catch (Exception e) {
                        io.ErrorString();
                    }
                }
                default: {
                    io.ErrorInt();
                    i = io.InputInt(sc);
                }
            }
        }
    }
}
