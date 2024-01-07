/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package versionlistas;

import java.util.ArrayList;
import java.util.Scanner;
import partea.Naipe;

/**
 *
 * @author FX506
 */
public class MainList {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("-------------Crear una baraja---------------------");
        BarajaList baraja = new BarajaList();
        System.out.println(baraja);
        
        System.out.println("-------------Barajar------------------------------");

        baraja.barajar(4);
        System.out.println(baraja);
        
        System.out.println("-------------Método sacar-------------------------");
        
        ArrayList<Naipe> barajaSacada = baraja.sacar(10);
        
        for (Naipe naipe : barajaSacada) {
            System.out.println(naipe);
        }
        
        System.out.println("------------ArrayList base----------------------------");
        System.out.println(baraja);
        
        
        System.out.println("-------------Vuelvo a sacar-----------------------");
        
        barajaSacada = baraja.sacar(10);
        
        for (Naipe naipe : barajaSacada) {
            System.out.println(naipe);
        }
        
        System.out.println("-------------Vuelvo a sacar otra vez--------------");
        
        barajaSacada = baraja.sacar(21);
        
        for (Naipe naipe : barajaSacada) {
            System.out.println(naipe);
        }
        
        System.out.println("-------------Vuelvo a sacar otra vez más--------------");
        
        barajaSacada = baraja.sacar(21);
        
        for (Naipe naipe : barajaSacada) {
            System.out.println(naipe);
        }
        
    }
    
}
