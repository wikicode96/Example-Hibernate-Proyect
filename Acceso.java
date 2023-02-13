package com.mycompany.academia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Carlos Soler
 */
public class Acceso {
    EntityManagerFactory emf;
    EntityManager em;
    
    public Acceso(){
        try{
            emf = Persistence.createEntityManagerFactory("persistencia");
            em = emf.createEntityManager();
        }catch(Exception e){
            System.out.println("Algó falló con la base de datos. ERROR: "+e);
        }
    }
    
    public void insertarAlumno(String nombre, String apellido, String curso, int asignaturas, int edad){
        try{
            Alumno nuevoAlumno = new Alumno(nombre, apellido, curso, asignaturas, edad);
            em.getTransaction().begin();
            em.persist(nuevoAlumno);
            em.getTransaction().commit();
        }catch(Exception e){
            System.out.println("Hubo un problema con tu inserción. ERROR: "+e);
        }finally{
            em.close();
            emf.close();
        }
    }
    public void listarAlumnos(){
        try{
            List<Alumno> alumnos = (List<Alumno>) em.createNativeQuery("SELECT * FROM alumnos", Alumno.class).getResultList();
            
            System.out.println("##############################################################################################################");
            for (Alumno alumno : alumnos) {
                System.out.printf(
                        "%s\t%s\t%s\t%s\t%s\t%s\t\n",
                        "ID: "+alumno.getId()+" ",
                        "Nombre: "+alumno.getNombre()+" ",
                        "Apellido: "+alumno.getApellido()+" " ,
                        "Curso: "+alumno.getCurso()+" ",
                        "Nº Asignaturas: "+alumno.getAsignaturas()+" ",
                        "Edad: "+alumno.getEdad()
                );
            }
            System.out.println("##############################################################################################################");
        }catch(Exception e){
            System.out.println("Hubo un problema con tu consulta. ERROR: "+e);
        }finally{
            em.close();
            emf.close();
        }
    }
}
