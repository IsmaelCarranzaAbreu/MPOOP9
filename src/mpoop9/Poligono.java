/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase abstracta que construye un Poligono
 * @author alumno
 */

public abstract class Poligono {
    
    /**
     * Método abstracto del área del poligono 
     * @return (No retorna ningún valor)
     */
    
    public abstract float area();
    
    /**
     * Método abstracto del perímetro del poligono 
     * @return (No retorna ningún valor)
     */
    
    public abstract float perimetro();
    
    /**
     * Método que imprime "Poligono" 
     * @return (No regresa nada)
     */
    
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
