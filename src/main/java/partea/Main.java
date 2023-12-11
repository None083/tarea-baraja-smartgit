/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package partea;

import javax.swing.JOptionPane;


/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {

        Naipe n1 = new Naipe(10, Palo.OROS);
        
        Naipe n2;
        
        do {
            n2 = new Naipe();
            System.out.println(n2);
        } while (!n2.equals(n1));
        System.out.println("--------------------------------------------------");
        
        
//        Pidiendo el naipe por teclado

        int num = Integer.parseInt(JOptionPane.showInputDialog(
                "Elige el numero de la carta"));
        
        Palo[] valores = Palo.values();
        
        Palo palo = (Palo) JOptionPane.showInputDialog
        (null, "Elige una opción", 
                "Palos baraja española",JOptionPane.QUESTION_MESSAGE , 
                null, valores, Palo.OROS);
        
        Naipe n3 = new Naipe(num, palo);

        do {
            n2 = new Naipe();
            System.out.println(n2);
        } while (!n2.equals(n3));

    }

}
