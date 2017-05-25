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
public class NodoPersonal {
    
    private Personal data;
    private NodoPersonal prox;

    public Personal getData() {
        return data;
    }

    public void setData(Personal data) {
        this.data = data;
    }

    public NodoPersonal getProx() {
        return prox;
    }

    public void setProx(NodoPersonal prox) {
        this.prox = prox;
    }
    
   public NodoPersonal(Personal data){
       this.data = data;
       prox = null;
   }
   
   public void Mostrar(){
       data.Mostrar();
   }
}
