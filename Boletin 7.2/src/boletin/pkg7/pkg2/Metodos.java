/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7.pkg2;
    import javax.swing.JOptionPane;
/**
 *
 * @author dcuerdogarcia
 */
public class Metodos {
    short numero1,numero2;
    

public Metodos(){
    numero1 = numero2 = 0;

}
public Metodos(short num1, short num2){
    numero1 = num1;
    numero2 = num2;
    
}

public short pedirDatos(){
    String resposta = JOptionPane.showInputDialog("Introducir número");
    short valor = Short.valueOf(resposta);
    return valor;
}

public void comparacion(short numero1, short numero2){
    if(numero1>=numero2)
        JOptionPane.showMessageDialog(null, ("A resta dos numeros " + numero1 + " e " + numero2 + " é de: " + (numero1-numero2)));
    JOptionPane.showMessageDialog(null, ("A suma dos numeros " + numero1 + " e " + numero2 + " é de: " + (numero1+numero2)));
    }

  
}