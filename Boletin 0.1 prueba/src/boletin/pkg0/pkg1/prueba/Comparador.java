
package boletin.pkg0.pkg1.prueba;

import javax.swing.JOptionPane;


public class Comparador {
    
    private double num1;
    private double num2;
    
public Comparador(double n1, double num2){
    num1= n1;
    this.num2= num2;
    
    }

public Comparador (){
    }

public double pedirDato(){
    String resposta=JOptionPane.showInputDialog("introduce dato");
    double valor=Double.parseDouble(resposta);
    return valor;
    
}

public void compararSimple(){
    if(num1>num2)
        System.out.println(num1+" é maior ");
    
}   

public void compararSimple(double n1,double n2){
    if(n1>n2)
        JOptionPane.showMessageDialog(null," O maior é " +n1);
    if(n2>n1)
        JOptionPane.showMessageDialog(null," O maior é " +n2);


}
}