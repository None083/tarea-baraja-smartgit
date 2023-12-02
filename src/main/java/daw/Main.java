/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

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

        //Cración de un naipe aleatorio
        Naipe n1 = new Naipe();
        System.out.println(n1);
        System.out.println("--------------------------------------");

        //Creación de baraja completa
        Baraja baraja = new Baraja();

        for (Naipe naipe : baraja.getBaraja()) {
            System.out.println(naipe);
        }
        System.out.println("--------------------------------------");

        //Mostrar cartas hasta que salga la que yo he escogido
        Naipe n2 = new Naipe("sota", Palo.ESPADAS);

        for (Naipe naipe : baraja.getBaraja()) {
            System.out.println(naipe);
            if(naipe.toString().equals(n2.toString())){
                break;
            }
        }
    }

}
