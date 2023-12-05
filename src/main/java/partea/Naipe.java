/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Random;

/**
 *
 * @author noelia
 *
 * clase naipe con dos atributos nº carta: 1 ... 8(sota), 9(caballo), 10(rey)
 * palo: oros, bastos, espada, copas
 *
 * constructor: uno aleatorio por defecto, otro con parametros, lanzar excepcion
 * en caso de parametros erroneos
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

        try{
            this.numeroCarta = numeroCarta;
        }catch(IllegalArgumentException iae){
            this.numeroCarta = numCartaAleatorio();
        }
        this.palo = palo;
        
        if (!numeroCartaValido(numeroCarta)) {
            throw new IllegalArgumentException("El número de carta no existe, "
                    + "debe estar entre 1-10");
        }
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
        sb.append(", palo=").append(palo.getNombre());
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
