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
public class Planetas {
    private String nombre;
    private long masa, radio, temperatura;
    private double vel;
    private ArrayList<Lunas> luna = new ArrayList();
    
    public Planetas(){        
    }

    public Planetas(String nombre, long masa, long radio, long temperatura, double vel) {
        this.nombre = nombre;
        this.masa = masa;
        this.radio = radio;
        this.temperatura = temperatura;
        this.vel = vel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getMasa() {
        return masa;
    }

    public void setMasa(long masa) {
        this.masa = masa;
    }

    public long getRadio() {
        return radio;
    }

    public void setRadio(long radio) {
        this.radio = radio;
    }

    public long getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(long temperatura) {
        this.temperatura = temperatura;
    }

    public double getVel() {
        return vel;
    }

    public void setVel(double vel) {
        this.vel = vel;
    }

    public ArrayList<Lunas> getLuna() {
        return luna;
    }

    public void setLuna(ArrayList<Lunas> luna) {
        this.luna = luna;
    }

    @Override
    public String toString() {
        return "Planeta{" + "nombre=" + nombre + ", masa=" + masa + ", radio=" + radio + ", temperatura=" + temperatura + ", velocidad de escape=" + vel + ", lunas=" + luna + '}';
    }

    
}//public class
