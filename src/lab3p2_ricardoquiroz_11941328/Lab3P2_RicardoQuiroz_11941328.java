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
                int velocidad;
                velocidad = rand.nextInt(5000*potencia);
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
                    
                }
                if (tipo==2) {
                    System.out.print("Fases: ");
                    int fases = lea.nextInt();
                    System.out.print("Motores: ");
                    int motores = lea.nextInt();
                    System.out.print("Altura: ");
                    int altura = lea.nextInt();
                    
                }
                if (tipo==3) {
                    System.out.print("Kilos combustible ");
                    int kiloscomb = lea.nextInt();
                    System.out.println("Material: ");
                    lea = new Scanner(System.in);
                    String material = lea.nextLine();
                    
                }
                
                cent=true;
            }
            if (menu==2) {
                
                
                cent=true;
            }
            if (menu==3) {
                
                
                cent=true;
            }
            if (menu==4) {
                
                
                cent=true;
            }
            if (menu==5) {
                
                
                cent=true;
            }
            if (menu==6) {
                
                
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
