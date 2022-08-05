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
public class DeFases extends Cohetes{
    private int fases, motores, altura;

    public DeFases() {
    }

    public DeFases(int fases, int motores, int altura, int peso, int potencia, String nombre, String serie, long velocidad) {
        super(peso, potencia, nombre, serie, velocidad);
        this.fases = fases;
        this.motores = motores;
        this.altura = altura;
    }

    public int getFases() {
        return fases;
    }

    public void setFases(int fases) {
        this.fases = fases;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "DeFases{" + "fases=" + fases + ", motores=" + motores + ", altura=" + altura + '}';
    }
    
    
    
    
}
