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
public class AccionistaA extends Accionista{
     
    public AccionistaA(String nombre, String apellido) {
        super(nombre, apellido);
        pago_accion = 3000; //PAGA 10 VECES DE LO QUE GANA UN ACCIONISTA B
        rendimiento = 0;
        this.numAccion= 0;
        
    }

    public void ComprarAccion(){
        this.numAccion++;
        rendimiento = rendimiento + 3000 * 0.18;
    }
    
    public void Mostrar(){
        
        System.out.println("ACCIONISTA A");
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido "+apellido);
        System.out.println("Rendimiento "+rendimiento);
        System.out.println("Numero de acciones comprada "+this.numAccion);
    }
 
    
}
