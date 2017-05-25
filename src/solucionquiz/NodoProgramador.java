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
public class NodoProgramador {
    
    private Programador data;
    private NodoProgramador prox;
    
    public NodoProgramador(Programador data){
        this.data = data;
        prox = null;
    }

    public Programador getData() {
        return data;
    }

    public void setData(Programador data) {
        this.data = data;
    }

    public NodoProgramador getProx() {
        return prox;
    }

    public void setProx(NodoProgramador prox) {
        this.prox = prox;
    }
    
    
    public void Mostrar(){
        data.Mostrar();
    }
}
