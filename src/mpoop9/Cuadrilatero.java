/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase que realiza el cálculo de perímetro y área de un Cuadrilátero
 * @author alumno
 */
public class Cuadrilatero extends Poligono{
    private int alfa, beta;
    private float a,b;
    private float base, altura;
    
    /**
     * Constructor vacío
     */

    public Cuadrilatero() {
    }

    /**
     * Método que asigna el valor de la base y altura de un cuadrilátero
     * @param base El valor de la base del cuadrilátero
     * @param altura El valor de la altura del cuadrilátero
     */
    
    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Método que calcula el valor del área del cuadrilátero
     * @return El valor del área del cuadrilátero
     */
    
    @Override
    public float area() {
        return base*altura;
    }
    
    /**
     * Método que calcula el valor del perímetro del cuadrilátero
     * @return El valor del perímetro del cuadrilátero
     */
    
    @Override
    public float perimetro() {
        return (2*a)+(2*b);
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Método que imprime "Cuadrilatero" 
     * @return (No regresa nada)
     */
    
    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{" + '}';
    }
}
