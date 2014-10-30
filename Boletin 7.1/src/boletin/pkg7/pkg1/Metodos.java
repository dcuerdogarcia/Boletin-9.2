/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7.pkg1;
    
import java.util.Scanner;


public class Metodos {
    private double numero1;
    
public Metodos(double numero1){
    this.numero1=numero1;
 
   
}
public Metodos(){}

public void compararDatos(double numero1){
    if(numero1>0){
        System.out.println("Si el numero es positivo");
    }        
}
  public double pedirDato(){
      double num1;
      System.out.println("Introduzca un dato");
      Scanner dato=new Scanner(System.in);
      num1=dato.nextDouble();
      return num1;
  }
        

}

