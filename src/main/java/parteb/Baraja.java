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

        int cartasActuales = 0;

        while (cartasActuales < NUM_TOTAL_CARTAS) {
            Naipe naipe = new Naipe();

            if (!naipeRepetido(naipe, cartasActuales)) {
                this.BARAJA[cartasActuales] = naipe;
                cartasActuales++;
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
    
    private boolean naipeRepetido(Naipe naipe, int cartasActuales) {
        for (int i = 0; i < cartasActuales; i++) {
            if (BARAJA[i].equals(naipe)) {
                return true;
            }
        }
        return false;
    }

}
