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
public class JuntaDirectiva extends Personal{
    
private ListaProyecto lp;
    
    public JuntaDirectiva(String nombre, String apellido, int ci, double salario) {
        super(nombre, apellido, ci, salario);
        this.bono = 3 * salario;
        salario = salario + bono;
        lp = new ListaProyecto();
    }

    public ListaProyecto getLp() {
        return lp;
    }

    public void setLp(ListaProyecto lp) {
        this.lp = lp;
    }
    
    
    
    public void Mostrar(){
        System.out.println("Junta directiva");
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(ci);
        System.out.println(salario);
        System.out.println("-------------------------------------------------------------");
    }
    
    public void MostrarProyecto(){
        lp.Mostrar();
    }
}
