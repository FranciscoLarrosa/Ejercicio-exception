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
public class CuentaSinDescubierto {

    private double balance;
    private int nro;

    public CuentaSinDescubierto(int nro) {
        this.nro = nro;
    }

    public void depositar(double monto) {
        balance += monto;
    }

    public void extraer(double monto) throws FondosInsuficientesException {
        if (balance <= monto) {
            balance -= monto;
        } else {
            double necesita = balance - monto;
            throw new FondosInsuficientesException(necesita);
        }
    }
}
