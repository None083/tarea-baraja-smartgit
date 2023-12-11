/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parteb;


import java.util.Scanner;
import partea.Naipe;


/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("-------------Crear una baraja---------------------");
        Baraja2 baraja = new Baraja2();
        System.out.println(baraja);
        
        System.out.println("-------------Barajar------------------------------");

        baraja.barajar(4);
        System.out.println(baraja);
//        System.out.println("------------Sacar naipes y mostrar nuevo array----");
//        
//        Naipe[] baraja2 = baraja.sacar(39);
//        
//        for (Naipe naipe : baraja2) {
//            System.out.println(naipe);
//        }
//        
//        System.out.println("------------Array base----------------------------");
//        System.out.println(baraja);
        
        
        System.out.println("-------------Método sacar sin null----------------");
        
        Naipe[] baraja2 = baraja.sacarNoNull(24);
        
        for (Naipe naipe : baraja2) {
            System.out.println(naipe);
        }
        
        System.out.println("------------Array base no null----------------------------");
        System.out.println(baraja);
        
    }

}
