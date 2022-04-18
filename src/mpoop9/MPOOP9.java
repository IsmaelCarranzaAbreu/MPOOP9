/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop9;

import actividad1.Alumno;
import actividad1.Gato;
import actividad1.Mesero;
import actividad1.Perro;
import actividad1.ProfesorAsignatura;
import actividad1.ProfesorCarrera;

/**
 *
 * @author alumno
 */
public class MPOOP9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Poligono poligono = new Poligono(); X No se puede instanciar clases abstractas
        
        Triangulo triangulo = new Triangulo();
        System.out.println(triangulo);
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        System.out.println(cuadrilatero);
        
        System.out.println(triangulo.getBase());
        Triangulo triangulo2 = triangulo;
        System.out.println(triangulo2.getBase());
        triangulo2.setBase(9);
        System.out.println(triangulo2.getBase());
        System.out.println(triangulo.getBase());
        
        triangulo2.setBase(triangulo.getBase());
        
        System.out.println("\n---------- Perro ----------");
        Perro perro = new Perro(true,"negro","Chihuahua","Amarillos","Pipo",3);
        Perro perro2= new Perro(false,"Blanco","Mestizo","Negros","Tifus",12);
        System.out.println(perro);
        
        System.out.println("\n---------- Gato ----------");
        Gato gato = new Gato("Café", "Siamés", "Azules", "Misifus", 7);
        Gato gato2= new Gato("Blanco", "Ragdoll","Negros","Pelusa", 5);
        System.out.println(gato);
       
        System.out.println("\n---------- Alumno ----------");
        Alumno alumno = new Alumno("Eléctrica Electrónica", 2022, gato, "Ismael", 19);
        System.out.println(alumno);
        
        System.out.println("\n---------- Mesero ----------");
        Mesero mesero = new Mesero("Hamburguesas","Negro con Rojo",10,5_000,8,16,gato2,"Norberto",23);
        System.out.println(mesero);
        
        System.out.println("\n---------- Profesor Asignatura ----------");
        ProfesorAsignatura asignatura = new ProfesorAsignatura ("Análisis Numérico",54,9_000,13,21,perro2,"Jorge Armando",28);
        System.out.println(asignatura);
        
        System.out.println("\n---------- Profesor Carrera ----------");
        ProfesorCarrera carrera = new ProfesorCarrera (3,5,56,8_000,7,17, perro, "Jesús", 38);
        System.out.println(carrera);
    } 
}
