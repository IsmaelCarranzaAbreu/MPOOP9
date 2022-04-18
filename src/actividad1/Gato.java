/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que construye un Gato
 * @author alumno
 */

public class Gato extends Mascota{
    
    /**
     * Constructor vacío
     */
    
    public Gato() {
    }
    
    /**
     * Constructor que recibe color, raza, colorOjos, nombre y edad  
     * @param color El color del pelaje del gato 
     * @param raza La raza del gato 
     * @param colorOjos El color de ojos del gato
     * @param nombre El nombre del gato
     * @param edad La edad del gato 
     */
    
    public Gato(String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
    }
    
    /**
     * Método que indica que está respirando el gato
     */
    
    public void respirar(){
        System.out.println("Estoy respirando");
    }
    
    /**
     * Método que indica que está durmiendo el gato 
     */
    
    public void dormir(){
        System.out.println("ZZzzzzZZZzZzzzz");
    }
    
    /**
     * Método que indica que está saltando el gato
     */
    
    public void saltar(){
        System.out.println("Estoy saltando");
    }
    
    /**
     * Método que indica que está jugando el gato
     */
    
    public void jugar(){
        System.out.println("Estoy jugando");     
    }
    
    /**
     * Método que indica que está rasguñando el gato
     */
    
    public void rasguñar(){
        System.out.println("Estoy rasguñando");
    }
    
    /**
     * Método que indica que está trepando el gato 
     */
    
    public void trepar(){
        System.out.println("Estoy trepando");
    }
    
    /**
     * Método que imprime "Gato"  
     * @return (No regresa nada)
     */
    
    @Override
    public String toString() {
        return super.toString()+"Gato{" + '}';
    }
 }
