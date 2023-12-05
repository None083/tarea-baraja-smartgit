/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parteb;

import parteb.Baraja;
import java.util.Scanner;
import javax.swing.JOptionPane;
import partea.Naipe;
import partea.Palo;

/**
 *
 * @author noelia
 *
 * Main: para probar lo que hemos hecho, y también crear una baraja y mostrarla
 *
 * 1. crear carta aleatoria y mostrar 
 * 2. crear baraja con constructor parametros
 * y mostrar 
 * 3. sacar cartas, mostrar hasta que salga una carta que se solicita
 * al usuario
 *
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        //Cración de un naipe aleatorio
        Naipe n1 = new Naipe();
        System.out.println(n1);
        System.out.println("--------------------------------------");

        //Creación de baraja completa
        Baraja baraja = new Baraja();
        
        for (int i = 0; i < baraja.getBaraja().length; i++) {
            System.out.println(baraja.getBaraja()[i]);
        }

//        for (Naipe naipe : baraja.getBaraja()) {
//            System.out.println(naipe);
//        }
        System.out.println("--------------------------------------");

        //Mostrar cartas hasta que salga la que yo he escogido
        //Naipe n2 = new Naipe("sota", Palo.ESPADAS);
        
        String num = JOptionPane.showInputDialog("Elige el numero de la carta");
        
        Palo[] valores = Palo.values();
        
        Palo palo = (Palo) JOptionPane.showInputDialog
        (null, "Elige una opción", 
                "Palos baraja española",JOptionPane.QUESTION_MESSAGE , 
                null, valores, Palo.OROS);
        
        Naipe n3 = new Naipe(num, palo);

        for (Naipe naipe : baraja.getBaraja()) {
            System.out.println(naipe);
            if(naipe.toString().equals(n3.toString())){
                break;
            }
        }
    }

}
