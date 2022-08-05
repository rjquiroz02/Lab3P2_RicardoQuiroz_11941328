/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_ricardoquiroz_11941328;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rjqer
 */
public class Lab3P2_RicardoQuiroz_11941328 {
static Scanner lea = new Scanner(System.in);
static Random rand = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean cent;
        int menu=1;
        ArrayList<Planetas> listaP  = new ArrayList();
        ArrayList<Cohetes> listaC = new ArrayList();
        while (menu != 0) {            
            cent=false;
            System.out.println("0. Salir");
            System.out.println("1. Crear cohete");
            System.out.println("2. Crear planeta");
            System.out.println("3. Editar cohete");
            System.out.println("4. Editar planeta");
            System.out.println("5. Listar cohetes");
            System.out.println("6. Listar planetas");
            System.out.println("7. Prueba");
            System.out.print("Ingrese la opcion que desea: ");
            menu = lea.nextInt();
            System.out.println();
            if (menu==1) {                
                System.out.print("Peso soportable: ");
                int peso = lea.nextInt();
                System.out.print("Nombre: ");
                lea = new Scanner(System.in);
                String nombre = lea.nextLine();
                System.out.print("Serie: ");
                String serie = lea.next();
                System.out.print("Potencia: ");
                int potencia = lea.nextInt();
                while (potencia > 9 && potencia < 1) {                    
                    System.out.println("Ingrese una potencia correcta[1-9]");
                    System.out.print("Potencia: ");
                    potencia = lea.nextInt();
                }
                int velocidad;
                velocidad = (5000*potencia) + (rand.nextInt(20000*potencia-5000*potencia));
                System.out.println("1. Liquido");
                System.out.println("2. de Fases");
                System.out.println("3. Solido");
                System.out.print("Tipo: ");
                int tipo = lea.nextInt();
                while (tipo > 3 && tipo < 1) {                    
                    System.out.println("Ingrese un tipo correcto");
                    System.out.print("Tipo: ");
                    tipo = lea.nextInt();
                }
                if (tipo==1) {
                    System.out.print("Litros de gasolina: ");
                    int lgas = lea.nextInt();
                    listaC.add(new CombLiquido(lgas, peso, potencia, nombre, serie, velocidad));
                }
                if (tipo==2) {
                    System.out.print("Fases: ");
                    int fases = lea.nextInt();
                    System.out.print("Motores: ");
                    int motores = lea.nextInt();
                    System.out.print("Altura: ");
                    int altura = lea.nextInt();
                    listaC.add(new DeFases(fases, motores, altura, peso, potencia, nombre, serie, velocidad));
                }
                if (tipo==3) {
                    System.out.print("Kilos combustible ");
                    int kiloscomb = lea.nextInt();
                    System.out.println("Material: ");
                    lea = new Scanner(System.in);
                    String material = lea.nextLine();
                    listaC.add(new CombSolido(kiloscomb, material, peso, potencia, nombre, serie, velocidad));
                }
                
                cent=true;
            }
            if (menu==2) {
                System.out.print("Nombre: ");
                lea = new Scanner(System.in);
                String nombre = lea.nextLine();
                System.out.print("Masa: ");
                long masa = lea.nextLong();
                System.out.print("Radio: ");
                long radio = lea.nextLong();
                System.out.print("Temperatura: ");
                long temperatura = lea.nextLong();
                double vel;
                double g;
                double num;
                double frac;
                g = 6.67*(Math.pow(10,-11));
                num = 2 * g * masa;
                frac = num/radio;
                vel = Math.sqrt(frac);
                System.out.println("1. Rocoso");
                System.out.println("2. Gaseoso");
                System.out.print("Tipo: ");
                int tipo = lea.nextInt();
                while (tipo > 2 && tipo < 1) {                    
                    System.out.println("Ingrese un tipo correcto");
                    System.out.print("Tipo: ");
                    tipo = lea.nextInt();
                }
                if (tipo==1) {
                    System.out.print("Densidad: ");
                    int densidad = lea.nextInt();
                    System.out.print("Hay vida[No=0]: ");
                    boolean vida = lea.nextInt() != 0;                 
                    listaP.add(new Rocosos(densidad, vida, nombre, masa, radio, temperatura, vel));
                }
                if (tipo==2) {
                    System.out.print("Presion: ");
                    long presion = lea.nextLong();
                    System.out.println("Anillos: ");
                    int anillos = lea.nextInt();
                    listaP.add(new Gaseosos(presion, anillos, nombre, masa, radio, temperatura, vel));
                }
                
                cent=true;
            }
            if (menu==3) {
                
                
                cent=true;
            }
            if (menu==4) {
                
                
                cent=true;
            }
            if (menu==5) {
                String out = "";
                            for (Cohetes object : listaC) {                               
                                    out+="["+listaC.indexOf(object)+"]"+" -> "+object.toString()+"\n";                               
                            }
                            System.out.println(out);
                
                cent=true;
            }
            if (menu==6) {
                String out = "";
                            for (Planetas object : listaP) {                               
                                    out+="["+listaP.indexOf(object)+"]"+" -> "+object.toString()+"\n";                               
                            }
                            System.out.println(out);
                
                cent=true;
            }
            if (menu==7) {
                
                
                cent=true;
            }
            if (!cent && menu!=0) {
                System.out.println("Ingrese una opcion correcta del menu");
                System.out.println();
            }
        }//while
    }//void main
    
}//public class
