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
public class Web extends Programador{

    public Web(String nombre, String apellido, int ci, double costo) {
        super(nombre, apellido, ci, costo);
        this.costo_hora = costo; //SE INICIALIZA EL COSTO 
        this.bono = (costo_hora * 8 * 21) * 0.32;
        this.salario = (costo_hora * 8 * 21) + bono; //CALCULO DEL SALARIO 
    }
    
    public void Mostrar(){
        //OVERRIDE DEL METODO MOSTRAR
        System.out.println("Programador web");
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(ci);
        System.out.println(salario);
        System.out.println("-----------------------------------------------");
    }
    
}
