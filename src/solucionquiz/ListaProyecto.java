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
public class ListaProyecto {
   
    private NodoProyecto _cabeza;
    
    public ListaProyecto(){
        _cabeza = null;
    }

    public NodoProyecto getCabeza() {
        return _cabeza;
    }

    public void setCabeza(NodoProyecto _cabeza) {
        this._cabeza = _cabeza;
    }
    
    
    
    public void InsertaP(NodoProyecto nuevo){
        
        if(_cabeza == null){
            
            _cabeza = nuevo; 
        }
        else{
            nuevo.setProx(_cabeza);
            _cabeza = nuevo; //LA NUEVA CABEZA SERA EL NODO INSERTADO
        }
    }
    
    public void InsertaF(NodoProyecto nuevo){
        
        if(_cabeza == null){
            _cabeza = nuevo;
        }
        else{
            
            NodoProyecto aux = _cabeza;
            
            while(aux.getProx() != null){
                
                aux = aux.getProx();
            }
            
            aux.setProx(nuevo); //SE INSERTA UN NODO AL FINAL DE LA LISTA
        }
    }
    
    public NodoProyecto EliminaP(){
        
        if(_cabeza == null){
            return null;
        }
        else if(_cabeza.getProx() == null){
            NodoProyecto aux = _cabeza;
            _cabeza = null;
            return aux;
        }
        else{
            
            NodoProyecto aux = _cabeza;
            _cabeza = _cabeza.getProx();
            aux.setProx(null); //SE ELIMINA EL NODO DE LA LISTA
            return aux;
        }
    }
    
    
    
    public void Mostrar(){
        
        NodoProyecto aux = _cabeza;
        
        if(aux != null){
            
            aux.Mostrar();
            aux = aux.getProx();
        }
    }
    
}
