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
public class Mainexception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaSinDescubierto c = new CuentaSinDescubierto(100);
        System.out.println("Depositar 200...");
        c.depositar(200.00);
        try{
            System.out.println("Extrayendo 100...");
            c.extraer(100.00);
            System.out.println("Extrayendo 200..");
            c.extraer(200.00);
            
        }
        catch(FondosInsuficientesException e){
            System.out.println("Te faltan $ : "+e.getMonto());
            e.printStackTrace();
        }
        
    }
    
}
