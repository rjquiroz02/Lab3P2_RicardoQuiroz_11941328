/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_ricardoquiroz_11941328;

/**
 *
 * @author rjqer
 */
public class Rocosos extends Planetas{
    private int densidad;
    private boolean vida;
    
    public Rocosos(){        
    }

    public Rocosos(int densidad, boolean vida, String nombre, long masa, long radio, long temperatura, double vel) {
        super(nombre, masa, radio, temperatura, vel);
        this.densidad = densidad;
        this.vida = vida;
    }

    public int getDensidad() {
        return densidad;
    }

    public void setDensidad(int densidad) {
        this.densidad = densidad;
    }

    public boolean isVida() {
        return vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return super.toString()+"Rocosos{" + "densidad=" + densidad + ", vida=" + vida + '}';
    }
    
    
    
    
}
