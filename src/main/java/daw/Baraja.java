/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author noelia
 *
 * clase baraja: atributo array de naipes constructor: por defecto rellena el
 * array de naipe
 *
 */
public class Baraja {

    private Naipe[] baraja;

    public Baraja() {
        final int NUM_TOTAL_CARTAS = 40;
        this.baraja = new Naipe[NUM_TOTAL_CARTAS];

        int contadorCartas = 0;

        while (contadorCartas < NUM_TOTAL_CARTAS) {
            Naipe naipe = new Naipe();

            if (!naipeValido(naipe, contadorCartas)) {
                this.baraja[contadorCartas] = naipe;
                contadorCartas++;
            }
        }
    }

    private boolean naipeValido(Naipe naipe, int cartasActuales) {
        for (int i = 0; i < cartasActuales; i++) {
            if (baraja[i].toString().equals(naipe.toString())) {
                return true;
            }
        }
        return false;
    }

    public Naipe[] getBaraja() {
        return baraja;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Baraja{");
        sb.append("baraja=").append(baraja);
        sb.append('}');
        return sb.toString();
    }
    
    

}
