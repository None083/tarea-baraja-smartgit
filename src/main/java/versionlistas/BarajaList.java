/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package versionlistas;

import java.util.ArrayList;
import java.util.Random;
import partea.Naipe;
import partea.Palo;

/**
 *
 * @author FX506
 */
public class BarajaList {
    
    Random random = new Random();
    
    private ArrayList<Naipe> barajaList;
    final static int NUM_CARTAS_POR_PALO = 10;

    public BarajaList() {
        
        this.barajaList = new ArrayList<>();
        
        Palo[] palos = Palo.values();

        for (Palo palo : palos) {
            for (int i = 0; i < NUM_CARTAS_POR_PALO; i++) {
                this.barajaList.add(new Naipe(i + 1, palo));
            }
        }
    }

    public ArrayList<Naipe> getBarajaList() {
        return barajaList;
    }
    
    @Override
    public String toString() {
        String str = "";
        for (Naipe naipe : this.barajaList) {
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
            n1 = random.nextInt(this.barajaList.size());
            n2 = random.nextInt(this.barajaList.size());
            
            nAux = this.barajaList.get(n1);
            this.barajaList.set(n1, this.barajaList.get(n2));
            this.barajaList.set(n2, nAux);
        }
    }
    
    public ArrayList<Naipe> sacar(int numCartas) {
        if (numCartas < 1 || numCartas > this.barajaList.size()) {
            numCartas = this.barajaList.size();
        }

        if (this.barajaList.isEmpty()) {
            System.out.println("Ya se han sacado todas las cartas");
            return new ArrayList<>();
        }

        ArrayList<Naipe> cartasSacadas = new ArrayList<>();

        for (int i = 0; i < numCartas; i++) {
            int nCarta = random.nextInt(this.barajaList.size());
            cartasSacadas.add(this.barajaList.remove(nCarta));
        }

        return cartasSacadas;
    }
    
}
