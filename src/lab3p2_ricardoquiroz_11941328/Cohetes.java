/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_ricardoquiroz_11941328;

import java.util.ArrayList;

/**
 *
 * @author rjqer
 */
public class Cohetes {
    private int peso, potencia;
    private String nombre, serie;
    private long velocidad;
    ArrayList<Personas> persona = new ArrayList();
    
    public Cohetes(){       
    }

    public Cohetes(int peso, int potencia, String nombre, String serie, long velocidad) {
        this.peso = peso;
        this.potencia = potencia;
        this.nombre = nombre;
        this.serie = serie;
        this.velocidad = velocidad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public long getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(long velocidad) {
        this.velocidad = velocidad;
    }

    public ArrayList<Personas> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Personas> persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Cohetes{" + "peso=" + peso + ", potencia=" + potencia + ", nombre=" + nombre + ", serie=" + serie + ", velocidad=" + velocidad + ", personas=" + persona + '}';
    }
    
       
}
