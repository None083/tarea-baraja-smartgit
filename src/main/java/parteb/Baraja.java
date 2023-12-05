/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteb;

import partea.Naipe;

/**
 *
 * @author noelia
 *
 * clase baraja: atributo array de naipes constructor: por defecto rellena el
 * array de naipe
 *
 */
public class Baraja {

    private final Naipe[] BARAJA;
    final static int NUM_TOTAL_CARTAS = 40;

    public Baraja() {
        
        this.BARAJA = new Naipe[NUM_TOTAL_CARTAS];

        int contadorCartas = 0;

        while (contadorCartas < NUM_TOTAL_CARTAS) {
            Naipe naipe = new Naipe();

            if (!naipeValido(naipe, contadorCartas)) {
                this.BARAJA[contadorCartas] = naipe;
                contadorCartas++;
            }
        }
    }
    
    public Naipe[] getBaraja() {
        return BARAJA;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Baraja{");
        sb.append("baraja=").append(BARAJA);
        sb.append('}');
        return sb.toString();
    }
    
    private boolean naipeValido(Naipe naipe, int cartasActuales) {
        for (int i = 0; i < cartasActuales; i++) {
            if (BARAJA[i].toString().equals(naipe.toString())) {
                return true;
            }
        }
        return false;
    }

}
