/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package solucionquiz;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class Proyecto {
    
    private ListaProgramador lp;
    private String nombre;
    private String MetodoAgil;

    public String getMetodoAgil() {
        return MetodoAgil;
    }

    public void setMetodoAgil(String MetodoAgil) {
        this.MetodoAgil = MetodoAgil;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public ListaProgramador getLp() {
        return lp;
    }

    public void setLp(ListaProgramador lp) {
        this.lp = lp;
    }
    
    public Proyecto(String nombre, String metodoAgil){
        this.nombre = nombre;
        this.MetodoAgil = metodoAgil;
        lp = new ListaProgramador(); //SE INICIALIZA LA LISTA SIMPLE DE PROGRAMADORES
    }
    
    
    //EN ESTE MÉTODO SE PASA POR PARAMETRO LA LISTA DE PERSONAL Y SE BUSCAN PROGRAMADORES PARA EL PROYECTO
    public void AñadirProgramador(ListaPersonal lista){
        
        NodoPersonal aux = lista.EliminaProgramador();
        
        if(aux != null){
            //SE CASTEA PARA METER EL PERSONAL EN LA LISTA DE PROGRAMADORES 
            Programador p = (Programador) aux.getData();
            this.lp.InsertaF(new NodoProgramador(p)); //SE INSERTA EL PROGRAAMDOR EN LA LISTA
        }else{
            System.out.println("NO HAY PROGRAMADORES EN LA EMPRESA");
        }
    }
    
    public void MostrarProgramadores(){
        lp.Mostrar();
    }
}
