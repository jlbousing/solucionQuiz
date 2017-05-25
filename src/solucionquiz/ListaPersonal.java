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
public class ListaPersonal {
    
    
    private NodoPersonal _cabeza;
    
    public ListaPersonal(){
        _cabeza = null;
    }

    public NodoPersonal getCabeza() {
        return _cabeza;
    }

    public void setCabeza(NodoPersonal _cabeza) {
        this._cabeza = _cabeza;
    }
    
    
    
    public void InsertaP(NodoPersonal nuevo){
        
        if(_cabeza == null){
            
            _cabeza = nuevo; 
        }
        else{
            nuevo.setProx(_cabeza);
            _cabeza = nuevo; //LA NUEVA CABEZA SERA EL NODO INSERTADO
        }
    }
    
    public void InsertaF(NodoPersonal nuevo){
        
        if(_cabeza == null){
            _cabeza = nuevo;
        }
        else{
            
            NodoPersonal aux = _cabeza;
            
            while(aux.getProx() != null){
                
                aux = aux.getProx();
            }
            
            aux.setProx(nuevo); //SE INSERTA UN NODO AL FINAL DE LA LISTA
        }
    }
    
    public NodoPersonal EliminaP(){
        
        if(_cabeza == null){
            return null;
        }
        else if(_cabeza.getProx() == null){
            NodoPersonal aux = _cabeza;
            _cabeza = null;
            return aux;
        }
        else{
            
            NodoPersonal aux = _cabeza;
            _cabeza = _cabeza.getProx();
            aux.setProx(null); //SE ELIMINA EL NODO DE LA LISTA
            return aux;
        }
    }
    
    public NodoPersonal EliminaProgramador(){
        
        if(_cabeza == null){
            return null;
        }
        else{
            
            int cont = 0;
           NodoPersonal aux = _cabeza;
           
           while(aux != null || !(aux.getData() instanceof Programador)){
               aux = aux.getProx();
           }
           
           if(aux != null){
               NodoPersonal aux2 = aux.getProx();
               aux.setProx(aux2.getProx()); //SE APUNTA AL SIGUIENTE NODO DEL NODO QUE TIENE EL PROGRAMADOR QUE SE VA A SACAR
               aux2.setProx(null); //SE SACA AL NODO DE LA LISTA
               return aux2;
           }
           else{
               return null; 
           }
        }
    }
    
    
    
    public NodoPersonal BuscarDirectivo(String nombre){
        
        if(_cabeza == null){
            return null;
        }
        else{
            
            NodoPersonal aux = _cabeza;
            
            while(aux != null){
                if(aux.getData().getNombre().equals(nombre)){
                    return aux;
                }
            }
            
            return null;
        }
    }
    
    public void Mostrar(){
        
        NodoPersonal aux = _cabeza;
        
        while(aux != null){
            
            aux.Mostrar();
            aux = aux.getProx();
        }
    }
    
    public void MostrarProyectos(){
        
        NodoPersonal aux = _cabeza;
        
        while(aux != null){
            
            if(aux.getData() instanceof JuntaDirectiva){
                
                //SE CASTEA PARA ACCEDER A LOS PROYECTOS
                JuntaDirectiva d = (JuntaDirectiva) aux.getData();
                if(d.getLp().getCabeza() != null){
                    d.getLp().Mostrar();
                }
            }
            
            aux = aux.getProx();
        }
    }
    
}
