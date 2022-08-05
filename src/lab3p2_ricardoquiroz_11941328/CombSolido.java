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
public class CombSolido extends Cohetes{
    private int kiloscomb;
    private String material;
    
    public CombSolido(){
    }

    public CombSolido(int kiloscomb, String material, int peso, int potencia, String nombre, String serie, long velocidad) {
        super(peso, potencia, nombre, serie, velocidad);
        this.kiloscomb = kiloscomb;
        this.material = material;
    }

    public int getKiloscomb() {
        return kiloscomb;
    }

    public void setKiloscomb(int kiloscomb) {
        this.kiloscomb = kiloscomb;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "CombSolido{" + "kilos combustible=" + kiloscomb + ", material=" + material + '}';
    }
    
    
    
}
