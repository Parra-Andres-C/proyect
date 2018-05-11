/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez.excepciones;

/**
 *
 * @author Farid Estepa
 */
public class ExcepcionMovimientoSuicida extends RuntimeException {
   public ExcepcionMovimientoSuicida(){
       super("Movimiento suicida");
   }
}
