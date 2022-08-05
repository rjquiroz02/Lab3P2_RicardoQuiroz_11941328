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
    String nombre;
    long masa, radio, temperatura, vel;
    ArrayList lunas = new ArrayList();
    
    public Planetas(){        
    }

    public Planetas(String nombre, long masa, long radio, long temperatura, long vel) {
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

    public long getVel() {
        return vel;
    }

    public void setVel(long vel) {
        this.vel = vel;
    }

    public ArrayList getLunas() {
        return lunas;
    }

    public void setLunas(ArrayList lunas) {
        this.lunas = lunas;
    }

    @Override
    public String toString() {
        return "Planetas{" + "nombre=" + nombre + ", masa=" + masa + ", radio=" + radio + ", temperatura=" + temperatura + ", vel=" + vel + ", lunas=" + lunas + '}';
    }
    
    
    
    
}//public class
