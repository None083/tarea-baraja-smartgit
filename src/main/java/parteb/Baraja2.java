/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteb;

import java.util.Random;
import partea.Naipe;
import partea.Palo;

/**
 *
 * @author noelia
 *
 * clase baraja: atributo array de naipes constructor: por defecto rellena el
 * array de naipe
 *
 */
public class Baraja2 {

    Random random = new Random();

    private Naipe[] BARAJA;
    final static int NUM_TOTAL_CARTAS = 40;
    final static int NUM_CARTAS_POR_PALO = 10;

    public Baraja2() {

        this.BARAJA = new Naipe[NUM_TOTAL_CARTAS];

        int cartasActuales = 0;

        for (int i = 0; i < NUM_CARTAS_POR_PALO; i++) {
            BARAJA[cartasActuales] = new Naipe(i + 1, Palo.OROS);
            cartasActuales++;
        }

        for (int i = 0; i < NUM_CARTAS_POR_PALO; i++) {
            BARAJA[cartasActuales] = new Naipe(i + 1, Palo.COPAS);
            cartasActuales++;
        }

        for (int i = 0; i < NUM_CARTAS_POR_PALO; i++) {
            BARAJA[cartasActuales] = new Naipe(i + 1, Palo.ESPADAS);
            cartasActuales++;
        }

        for (int i = 0; i < NUM_CARTAS_POR_PALO; i++) {
            BARAJA[cartasActuales] = new Naipe(i + 1, Palo.BASTOS);
            cartasActuales++;
        }
    }

    public Naipe[] getBaraja() {
        return BARAJA;
    }

    @Override
    public String toString() {
        String str = "";
        for (Naipe naipe : this.BARAJA) {
            try {
                str += naipe.toString() + "\n";
            } catch (NullPointerException npe) {
                str += "null" + "\n";
            }

        }
        return str;
    }

    public void barajar(int movimientos) {
        int n1;
        int n2;
        Naipe nAux;

        for (int i = 0; i < movimientos; i++) {
            n1 = random.nextInt(0, 40);
            n2 = random.nextInt(0, 40);
            nAux = this.BARAJA[n1];
            this.BARAJA[n1] = this.BARAJA[n2];
            this.BARAJA[n2] = nAux;
        }
    }

    public Naipe[] sacar(int numCartas) {

        if (numCartas < 1 && numCartas > 40) {
            return new Naipe[0];
        }

        Naipe[] arrayNaipes = new Naipe[numCartas];
        int nCarta;

        for (int i = 0; i < numCartas; i++) {
            nCarta = random.nextInt(0, 40);
            while (this.BARAJA[nCarta] == null) {
                nCarta = random.nextInt(0, 40);
            }
            arrayNaipes[i] = this.BARAJA[nCarta];
            this.BARAJA[nCarta] = null;

        }
        return arrayNaipes;
    }

    public Naipe[] sacarNoNull(int numCartas) {

        Naipe[] barajaNueva = new Naipe[NUM_TOTAL_CARTAS - numCartas];

        if (numCartas < 1 && numCartas > 40) {
            return new Naipe[0];
        }

        Naipe[] arrayNaipes = new Naipe[numCartas];
        int nCarta;

        for (int i = 0; i < numCartas; i++) {
            nCarta = random.nextInt(0, 40);
            while (this.BARAJA[nCarta] == null) {
                nCarta = random.nextInt(0, 40);
            }
            arrayNaipes[i] = this.BARAJA[nCarta];
            this.BARAJA[nCarta] = null;
        }

        for (int i = 0; i < this.BARAJA.length; i++) {
            for (int j = 0; j < barajaNueva.length; j++) {
                if (this.BARAJA[i] != null) {
                    barajaNueva[j] = this.BARAJA[i];
                }
            }
        }

            this.BARAJA = barajaNueva;

            return arrayNaipes;
        }

    
    }