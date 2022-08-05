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
public class Lunas {
    private String nombre;
    private int crateres;
    
    public Lunas(){        
    }

    public Lunas(String nombre, int crateres) {
        this.nombre = nombre;
        this.crateres = crateres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCrateres() {
        return crateres;
    }

    public void setCrateres(int crateres) {
        this.crateres = crateres;
    }

    @Override
    public String toString() {
        return "Lunas{" + "nombre=" + nombre + ", crateres=" + crateres + '}';
    }
    
    
    
}//public class
