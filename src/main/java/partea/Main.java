/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package partea;


/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {

        Naipe n1 = new Naipe("10", Palo.OROS);
        
        Naipe naipe;
        
        do {
            naipe = new Naipe();
            System.out.println(naipe);
        } while (!naipe.toString().equals(n1.toString()));

    }

}
