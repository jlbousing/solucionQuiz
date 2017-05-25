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
public abstract class Personal {
    protected String nombre;
    protected String apellido;
    protected int ci;
    protected double salario;
    protected double costo_hora;
    protected double bono;

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getCosto_hora() {
        return costo_hora;
    }

    public void setCosto_hora(double costo_hora) {
        this.costo_hora = costo_hora;
    }
    
    

    public Personal(String nombre, String apellido, int ci, double costo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.salario = 0;
        this.costo_hora = costo;
    }
    
    public abstract void Mostrar();
}
