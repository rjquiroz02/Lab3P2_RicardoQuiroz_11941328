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
public class Gaseosos extends Planetas{
    private long presion;
    private int anillos;
    
    public Gaseosos(){        
    }

    public Gaseosos(long presion, int anillos, String nombre, long masa, long radio, long temperatura, long vel) {
        super(nombre, masa, radio, temperatura, vel);
        this.presion = presion;
        this.anillos = anillos;
    }

    public long getPresion() {
        return presion;
    }

    public void setPresion(long presion) {
        this.presion = presion;
    }

    public int getAnillos() {
        return anillos;
    }

    public void setAnillos(int anillos) {
        this.anillos = anillos;
    }

    @Override
    public String toString() {
        return "Gaseosos{" + "presion=" + presion + ", anillos=" + anillos + '}';
    }
    
    
    
}//public class
