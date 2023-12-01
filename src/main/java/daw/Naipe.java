/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.Random;

/**
 *
 * @author noelia
 * 
 * clase naipe con dos atributos
 * nº carta: 1 ... sota, caballo, rey
 * palo: oros, bastos, espada, copas
 * 
 * 
 * constructor: uno aleatorio por defecto, 
 * otro con parametros, lanzar excepcion en caso de parametros erroneos
 * 

 * clase baraja: atributo array de naipes
 * constructor: por defecto rellena el array de naipe
 * 
 * 
 * Main: para probar lo que hemos hecho, y también crear una baraja y mostrarla
 * 
 * 1. crear carta aleatoria y mostrar
 * 2. crear baraja con constructor parametros y mostrar
 * 3. sacar cartas, mostrar hasta que salga una carta que se solicita al usuario
 *
 * 
 */
public class Naipe {
    
    private final int NUM_MIN = 1;
    private final int NUM_MAX = 10;
    private static Random random = new Random();

    private int numeroCarta;
    private Palo palo;

    public Naipe() {
        this.numeroCarta = random.nextInt(NUM_MIN, NUM_MAX+1);
        this.palo = paloAleatorio();
    }

    public Naipe(int numeroCarta, Palo palo) {
        
        if(numeroCarta < NUM_MIN || this.numeroCarta > NUM_MAX){
            throw new IllegalArgumentException("El número de carta no existe, debe estar entre 1-10");
        }
        
        this.numeroCarta = numeroCarta;
        this.palo = palo;
    }
    
    
    
    
    private Palo paloAleatorio() {
        Palo[] valores = Palo.values();
        return valores[random.nextInt(valores.length)];
    }
    
}
