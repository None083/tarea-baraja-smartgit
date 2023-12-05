/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author noelia
 */
public enum Palo {
    
    OROS("oros"),
    COPAS("copas"),
    BASTOS("bastos"),
    ESPADAS("espadas");
    
    
    private final String nombre;

    private Palo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
