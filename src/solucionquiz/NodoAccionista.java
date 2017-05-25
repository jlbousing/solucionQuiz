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
public class NodoAccionista {
    
    private Accionista data;
    private NodoAccionista prox;

    public Accionista getData() {
        return data;
    }

    public void setData(Accionista data) {
        this.data = data;
    }

    public NodoAccionista getProx() {
        return prox;
    }

    public void setProx(NodoAccionista prox) {
        this.prox = prox;
    }
    
    public NodoAccionista(Accionista data){
        this.data = data;
        this.prox = null;
    }
    
    public void Mostrar(){
        data.Mostrar();
    }
}
