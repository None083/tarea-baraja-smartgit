/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package partea;

import java.util.Objects;
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

    private final static int NUM_CARTA_MIN = 1;
    private final static int NUM_CARTA_MAX = 10;
    private static Random random = new Random();

    private int numeroCarta;
    private Palo palo;

    public Naipe() {
        this.numeroCarta = random.nextInt(NUM_CARTA_MIN, NUM_CARTA_MAX+1);//Le sumo 1 porque el random excluye el último número
        this.palo = paloAleatorio();
    }

    public Naipe(int numeroCarta, Palo palo) {
        
        this.palo = palo;
        
        if (!numeroCartaValido(numeroCarta)) {
            throw new IllegalArgumentException("El número de carta no existe, "
                    + "debe estar entre 1-10");
        }
        this.numeroCarta = numeroCarta;
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setNumeroCarta(int numeroCarta) {
        
        if (numeroCartaValido(numeroCarta)) {
            this.numeroCarta = numeroCarta;
        }else{
            System.out.println("El valor introducido no es válido, no se ha cambiado");
        }
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.numeroCarta);
        hash = 79 * hash + Objects.hashCode(this.palo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Naipe other = (Naipe) obj;
        if (!Objects.equals(this.numeroCarta, other.numeroCarta)) {
            return false;
        }
        return this.palo == other.palo;
    }
    
    

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Naipe{");
        
        switch(this.numeroCarta){
            case 8 ->{
                sb.append("numeroCarta=").append("sota");
            }
            case 9 ->{
                sb.append("numeroCarta=").append("caballo");
            }
            case 10 ->{
                sb.append("numeroCarta=").append("rey");
            }
            default ->{
                sb.append("numeroCarta=").append(numeroCarta);
            }
        }
        sb.append(", palo=").append(palo);
        sb.append('}');
        return sb.toString();
    }
    

    private Palo paloAleatorio() {
        Palo[] valores = Palo.values();
        return valores[random.nextInt(valores.length)];
    }

    private boolean numeroCartaValido(int numCarta) {
        boolean valida = false;
        
        if(numCarta >= NUM_CARTA_MIN && numCarta <= NUM_CARTA_MAX){
            valida = true;
        }
        return valida;
    }

}
