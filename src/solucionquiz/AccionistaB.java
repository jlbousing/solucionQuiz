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
public class AccionistaB extends Accionista{
    
    
    public AccionistaB(String nombre, String apellido) {
        super(nombre, apellido);
        pago_accion = 300;
        rendimiento = 0;
        this.numAccion = 0;
    }
    
    public void ComprarAccion(){
        this.numAccion++;
        this.rendimiento = rendimiento + pago_accion * 0.07;
    }
    
    public void Mostrar(){
        
        System.out.println("ACCIONISTA B");
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido "+apellido);
        System.out.println("Rendimiento "+rendimiento);
        System.out.println("Numero de acciones comprada "+this.numAccion);
    }
    
    
    
}
