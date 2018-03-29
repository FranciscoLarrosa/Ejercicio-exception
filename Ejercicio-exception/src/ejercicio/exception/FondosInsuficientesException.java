/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.exception;

/**
 *
 * @author Satoru
 */
public class FondosInsuficientesException extends Exception {
    private double monto;
     
    public FondosInsuficientesException (double monto){
        this.monto = monto;
    }
    public double getMonto(){
        return monto;
    }
}
