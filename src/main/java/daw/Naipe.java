/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author noelia
 *
 * clase naipe con dos atributos nº carta: 1 ... 8(sota), 9(caballo), 10(rey)
 * palo: oros, bastos, espada, copas
 *
 *
 * constructor: uno aleatorio por defecto, otro con parametros, lanzar excepcion
 * en caso de parametros erroneos
 *
 *
 * clase baraja: atributo array de naipes constructor: por defecto rellena el
 * array de naipe
 *
 *
 * Main: para probar lo que hemos hecho, y también crear una baraja y mostrarla
 *
 * 1. crear carta aleatoria y mostrar 2. crear baraja con constructor parametros
 * y mostrar 3. sacar cartas, mostrar hasta que salga una carta que se solicita
 * al usuario
 *
 *
 */
public class Naipe {

    private final static String[] opcionesNumCarta = {"1", "2", "3", "4", "5",
        "6", "7", "sota", "caballo", "rey"};
    private static Random random = new Random();

    private String numeroCarta;
    private Palo palo;

    public Naipe() {
        this.numeroCarta = numCartaAleatorio();
        this.palo = paloAleatorio();
    }

    public Naipe(String numeroCarta, Palo palo) {

        if (!numeroCartaValido(numeroCarta)) {
            throw new IllegalArgumentException("El número de carta no existe, "
                    + "debe estar entre 1-10");
        }

        this.numeroCarta = numeroCarta;
        this.palo = palo;
    }

    public String getNumeroCarta() {
        return numeroCarta;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setNumeroCarta(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naipe{");
        sb.append("numeroCarta=").append(numeroCarta);
        sb.append(", palo=").append(palo);
        sb.append('}');
        return sb.toString();
    }
    

    private Palo paloAleatorio() {
        Palo[] valores = Palo.values();
        return valores[random.nextInt(valores.length)];
    }

    private String numCartaAleatorio() {
        //int aleatorio = random.nextInt(opcionesNumCarta.length);
        return opcionesNumCarta[random.nextInt(opcionesNumCarta.length)];
    }

    private boolean numeroCartaValido(String numCarta) {
        boolean valida = false;

        for (String s : opcionesNumCarta) {
            if (numCarta.equalsIgnoreCase(s)) {
                valida = true;
            }
        }
        return valida;
    }

}
