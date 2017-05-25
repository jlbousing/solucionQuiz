/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package solucionquiz;

/**
 *
 * @author Sony
 */
public abstract class Programador extends Personal{
   

    public Programador(String nombre, String apellido, int ci, double costo) {
        super(nombre, apellido, ci, costo);
    }
    
    public abstract void Mostrar();
    
}
