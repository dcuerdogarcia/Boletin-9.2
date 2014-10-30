/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7.pkg2;

/**
 *
 * @author dcuerdogarcia
 */
public class Boletin72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short numero1, numero2;
        Metodos obx = new Metodos();
        numero1 = obx.pedirDatos();
        numero2 = obx.pedirDatos();
        obx.comparacion(numero1, numero2);
        
    }
    
}
