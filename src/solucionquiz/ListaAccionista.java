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
public class ListaAccionista {
 
    private NodoAccionista _cabeza;
    
    public ListaAccionista(){
        _cabeza = null;
    }

    public NodoAccionista getCabeza() {
        return _cabeza;
    }

    public void setCabeza(NodoAccionista _cabeza) {
        this._cabeza = _cabeza;
    }
    
    
    
    public void InsertaP(NodoAccionista nuevo){
        
        if(_cabeza == null){
            
            _cabeza = nuevo; 
        }
        else{
            nuevo.setProx(_cabeza);
            _cabeza = nuevo; //LA NUEVA CABEZA SERA EL NODO INSERTADO
        }
    }
    
    public void InsertaF(NodoAccionista nuevo){
        
        if(_cabeza == null){
            _cabeza = nuevo;
        }
        else{
            
            NodoAccionista aux = _cabeza;
            
            while(aux.getProx() != null){
                
                aux = aux.getProx();
            }
            
            aux.setProx(nuevo); //SE INSERTA UN NODO AL FINAL DE LA LISTA
        }
    }
    
    public NodoAccionista EliminaP(){
        
        if(_cabeza == null){
            return null;
        }
        else if(_cabeza.getProx() == null){
            NodoAccionista aux = _cabeza;
            _cabeza = null;
            return aux;
        }
        else{
            
            NodoAccionista aux = _cabeza;
            _cabeza = _cabeza.getProx();
            aux.setProx(null); //SE ELIMINA EL NODO DE LA LISTA
            return aux;
        }
    }
    
  
    public void Mostrar(){
        
        NodoAccionista aux = _cabeza;
        
        while(aux != null){
            aux.Mostrar();
            aux = aux.getProx();
        }
    }
    
}
