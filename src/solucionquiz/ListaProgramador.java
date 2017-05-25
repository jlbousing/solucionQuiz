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
public class ListaProgramador {
    
    private NodoProgramador _cabeza;
    
    public ListaProgramador(){
        _cabeza = null;
    }

    public NodoProgramador getCabeza() {
        return _cabeza;
    }

    public void setCabeza(NodoProgramador _cabeza) {
        this._cabeza = _cabeza;
    }
    
    
    
    public void InsertaP(NodoProgramador nuevo){
        
        if(_cabeza == null){
            
            _cabeza = nuevo; 
        }
        else{
            nuevo.setProx(_cabeza);
            _cabeza = nuevo; //LA NUEVA CABEZA SERA EL NODO INSERTADO
        }
    }
    
    public void InsertaF(NodoProgramador nuevo){
        
        if(_cabeza == null){
            _cabeza = nuevo;
        }
        else{
            
            NodoProgramador aux = _cabeza;
            
            while(aux.getProx() != null){
                
                aux = aux.getProx();
            }
            
            aux.setProx(nuevo); //SE INSERTA UN NODO AL FINAL DE LA LISTA
        }
    }
    
    public void Mostrar(){
        
        NodoProgramador aux = _cabeza;
        if(aux != null){
            
            aux.Mostrar();
            aux = aux.getProx();
        }
    }
}
