package com.mycompany.academia;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Carlos Soler
 */
@Entity
@Table(name="alumnos")
public class Alumno implements Serializable{
    //private static final long serialVersionUID = 1L;
    @Id
    @Column(name="id")
    private int id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="curso")
    private String curso;
    @Column(name="numero_asignaturas")
    private int asignaturas;
    @Column(name="edad")
    private int edad;
    
    public Alumno(String nombre, String apellido, String curso, int asignaturas, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.asignaturas = asignaturas;
        this.edad = edad;
    }
    
    public Alumno(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(int asignaturas) {
        this.asignaturas = asignaturas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
