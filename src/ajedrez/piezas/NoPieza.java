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
public class NoPieza extends Pieza{
public NoPieza(){
        this(-1,-1);
    }
public NoPieza(int x, int y){
        Posicion pos = new Posicion();
        pos.setPosicion(x, y);
        setPosicion(pos);
    }

@Override
    boolean[][] posicionesPosibles() {
        return new boolean[8][8]; 
    }
    @Override
    boolean movimientoPosible( Posicion posicionNueva, Tablero tablero){
        return false;
    }

    @Override
    public Type getType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}
