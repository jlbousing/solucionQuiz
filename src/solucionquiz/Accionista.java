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
public abstract class Accionista {
    
    protected String nombre;
    protected String apellido;
    protected double rendimiento;
    protected double pago_accion;
    protected int numAccion;

    public int getNumAccion() {
        return numAccion;
    }

    public void setNumAccion(int numAccion) {
        this.numAccion = numAccion;
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



    public double getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(double rendimiento) {
        this.rendimiento = rendimiento;
    }

    public double getPago_accion() {
        return pago_accion;
    }

    public void setPago_accion(double pago_accion) {
        this.pago_accion = pago_accion;
    }

    public Accionista(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rendimiento = rendimiento;
        this.pago_accion = pago_accion;
        this.numAccion = numAccion;
    }
    
    
    
    public abstract void ComprarAccion();
    public abstract void Mostrar();
}
