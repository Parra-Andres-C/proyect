/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez.piezas;
import ajedrez.juego.Tablero;

/**
 *
 * @author Farid Estepa
 */
public abstract class Pieza {
    
    
    private Posicion posicion;
    private boolean equipo;
    
    public Pieza(){
        this(false);        
    }
    public Pieza(boolean equipo) {
        this.equipo = equipo;
        posicion = new Posicion();
    }
 
    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public boolean isEquipo() {
        return equipo;
    }

    public void setEquipo(boolean equipo) {
        this.equipo = equipo;
    }

    public abstract Type getType();
    
abstract boolean[][] posicionesPosibles();
abstract boolean movimientoPosible( Posicion posicionNueva, Tablero tablero);    



    
    
    
}
