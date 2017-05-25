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
public class Junta {
    
    private Personal[] reunionJunta = new Personal[50];
    private AccionistaA[] reunionAccionista = new AccionistaA[50];
    
    public void CrearJunta(ListaPersonal lp, ListaAccionista la){
        VotacionDirectivos(lp);
        VotacionAccionistaA(la);
        
        for (int i = 0; i < this.reunionJunta.length; i++) {
            
            if(this.reunionJunta[i] != null){
                this.reunionJunta[i].Mostrar();
            }
        }
        
        for (int i = 0; i < this.reunionAccionista.length; i++) {
            
            if(this.reunionAccionista[i] != null){
                this.reunionAccionista[i].Mostrar();
            }
        }
    }
    
    public void VotacionDirectivos(ListaPersonal lp){
        
        int cont = 0;
        
        //SE RECORRE LA LISTA 
                NodoPersonal aux = lp.getCabeza();
                while(aux != null){
                    if(aux.getData() instanceof JuntaDirectiva && cont < this.reunionAccionista.length){
                        JuntaDirectiva A = (JuntaDirectiva) aux.getData();
                        this.reunionJunta[cont] = A;
                        cont++;
                    }
                    
                    aux = aux.getProx();
                }
    }
    
    public void VotacionAccionistaA(ListaAccionista la){
        
        int cont = 0;
        
        //SE RECORRE LA LISTA 
                NodoAccionista aux = la.getCabeza();
                while(aux != null){
                    if(aux.getData() instanceof AccionistaA && cont < this.reunionAccionista.length){
                        AccionistaA A = (AccionistaA) aux.getData();
                        this.reunionAccionista[cont] = A;
                        cont++;
                    }
                    
                    aux = aux.getProx();
                }
    }
}
