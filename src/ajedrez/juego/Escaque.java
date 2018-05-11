/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez.juego;
import ajedrez.piezas.NoPieza;
import ajedrez.piezas.Pieza;

/**
 *
 * @author Farid Estepa
 */
public class Escaque {
     private boolean color;
    private Pieza pieza;
    
    public Escaque(){
        pieza = new NoPieza();
    }
    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }
    
}
