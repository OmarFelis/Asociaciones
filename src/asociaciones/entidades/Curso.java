/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociaciones.entidades;

/**
 *
 * @author Omar_quiero_dormir_pipipi
 */
public class Curso {

    private Estudiante[] estudiantes;
    private String codigo;
    private Integer creditos;
    private Profesor[] profesores;
    private String nombre;

    public Curso( 
            String codigo, 
            Integer creditos,  
            String nombre) { 
        this.codigo = codigo;
        this.creditos = creditos; 
        this.nombre = nombre;
        this.estudiantes = new Estudiante[30];
        this.profesores = new Profesor[2];
    }
    
    
    
    public void agregarProfesor(Profesor profesor){
          
    }
    
    /**
     * @return the estudiantes
     */
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    /**
     * @param estudiantes the estudiantes to set
     */
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the creditos
     */
    public Integer getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    /**
     * @return the profesores
     */
    public Profesor[] getProfesores() {
        return profesores;
    }

    /**
     * @param profesores the profesores to set
     */
    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
 
}
