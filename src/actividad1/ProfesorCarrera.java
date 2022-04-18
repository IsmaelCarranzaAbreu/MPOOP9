/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que construye un ProfesorCarrera
 * @author alumno
 */

public class ProfesorCarrera extends Profesor{    
    private int numAsignaturas, grupos;
    
    /**
     * Constructor vacío
     */

    public ProfesorCarrera() {
    }
    
    /**
     * Constructor que recibe nomAsignatura, grupos, numAlumnos, salario, horaEntrada, horaSalida, mascota, nombre y edad
     * @param numAsignaturas El número de asignaturas que imparte el profesor de carrera
     * @param grupos El número de grupos que imparte el profesor de carrera
     * @param numAlumnos El número de alumnos que tiene el profesor de carrera
     * @param salario El salario que recibe el profesor de carrera
     * @param horaEntrada La hora de entrada que ingresa a su trabajo el profesor de carrera
     * @param horaSalida La hora de salida que sale de su trabajo el profesor de carrera
     * @param mascota La mascota que tiene el profesor de carrera
     * @param nombre El nombre del profesor de carrera
     * @param edad La edad del profesor de carrera
     */
    
    public ProfesorCarrera(int numAsignaturas, int grupos, int numAlumnos, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.numAsignaturas = numAsignaturas;
        this.grupos = grupos;
    }

    public int getNumAsignaturas() {
        return numAsignaturas;
    }

    public void setNumAsignaturas(int numAsignaturas) {
        this.numAsignaturas = numAsignaturas;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }
    
    /**
     * Método que indica que está respirando el profesor de carrera
     */
    
    public void respirar(){
        System.out.println("Estoy respirando");
    }
    
    /**
     * Método que indica que el profesor de carrera está aclarando dudas 
     */
    
    public void aclararDudas(){
        System.out.println("Estoy aclarando dudas");
    }
    
    /**
     * Método que indica que el profesor de carrera está reprobando 
     */
    
    public void reprobar(){
        System.out.println("Estás reprobado");
    }
    
    /**
     * Método que indica que el profesor de carrera está aprobando
     */
    
    public void pasarAlumnos(){
        System.out.println("Estás aprobado");
    }
    
    /**
     * Método que indica que está explicando el profesor de carrera
     */
    
    public void explicar(){
        System.out.println("estoy explicando");
    }
    
    /**
     * Método que imprime el numAsignatura y grupos de un profesor de carrera
     * @return La cantidad del numAsignatura y la cantidad de grupos de un profesor de carrera
     */
    
    @Override
    public String toString() {
        return super.toString() +  "ProfesorCarrera{" + "numAsignaturas=" + numAsignaturas + ", grupos=" + grupos + '}';
    }
}
