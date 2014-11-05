/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7.pkg5;
import javax.swing.JOptionPane;
/**
 *
 * @author dcuerdogarcia
 */
public class NewClass {
    private double numero1;
    private double numero2;
    private double numero3;

public NewClass(){
}

public double numeros(){
    String respuesta= JOptionPane.showInputDialog("Introducir un número: ");
    double valor= Double.parseDouble(respuesta);
    return valor;

}

public void comparar(double n1, double n2, double n3){

    numero1= n1;
    numero2= n2;
    numero3= n3;
        
    if(n1>n2&&n1>n3){
        JOptionPane.showMessageDialog(null, n1);
    }else if(n2>n1&&n2>n3){
        JOptionPane.showMessageDialog(null, n2);
    }else{
        JOptionPane.showMessageDialog(null, n3);
    }
        
}
}