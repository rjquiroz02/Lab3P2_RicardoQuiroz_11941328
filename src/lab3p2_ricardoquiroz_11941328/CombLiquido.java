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
public class CombLiquido extends Cohetes{
    private int lgas;
    
    public CombLiquido(){
    }

    public CombLiquido(int lgas, int peso, int potencia, String nombre, String serie, int velocidad) {
        super(peso, potencia, nombre, serie, velocidad);
        this.lgas = lgas;
    }

    public int getLgas() {
        return lgas;
    }

    public void setLgas(int lgas) {
        this.lgas = lgas;
    }

    @Override
    public String toString() {
        return "CombLiquido{" + "litros gasolina=" + lgas + '}';
    }
    
    
    
    
    
}
