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
public class NodoProyecto {
    
    private Proyecto data;
    private NodoProyecto prox;

    public Proyecto getData() {
        return data;
    }

    public void setData(Proyecto data) {
        this.data = data;
    }

    public NodoProyecto getProx() {
        return prox;
    }

    public void setProx(NodoProyecto prox) {
        this.prox = prox;
    }
    
    public NodoProyecto(Proyecto data){
        this.data = data;
        prox = null;
    }
    
    public void Mostrar(){
        
        System.out.println("Nombre del proyecto "+data.getNombre());
        data.getLp().Mostrar();
    }
}
