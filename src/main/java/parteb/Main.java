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
        
        System.out.println("-------------Método sacar-------------------------");
        
        Naipe[] baraja2 = baraja.sacar(10);
        
        for (Naipe naipe : baraja2) {
            System.out.println(naipe);
        }
        
        System.out.println("------------Array base----------------------------");
        System.out.println(baraja);
        
        
        System.out.println("-------------Vuelvo a sacar-----------------------");
        
        baraja2 = baraja.sacar(10);
        
        for (Naipe naipe : baraja2) {
            System.out.println(naipe);
        }
        
        System.out.println("-------------Vuelvo a sacar otra vez--------------");
        
        baraja2 = baraja.sacar(21);
        
        for (Naipe naipe : baraja2) {
            System.out.println(naipe);
        }
        
        System.out.println("-------------Vuelvo a sacar otra vez más--------------");
        
        baraja2 = baraja.sacar(21);
        
        for (Naipe naipe : baraja2) {
            System.out.println(naipe);
        }
        
        
        
    }

}
