package boletin7.pkg4;

import javax.swing.JOptionPane;

public class NewClass {
    float peso1, peso2;
    String nombre1, nombre2;
    
    public NewClass(){
        peso1 = peso2 = 0;
    }
    public NewClass(float peso1, float peso2){
        this.peso1 = peso1;
        this.peso2 = peso2;
    }
    public NewClass(String nombre1, String nombre2){
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }
    
    public float pedirDatos(){
        String resposta = JOptionPane.showInputDialog("Introducir su peso");
        float valor = Float.valueOf(resposta);
        return valor;
    }
    public String pedirNombre(){
        String nom = JOptionPane.showInputDialog("Introducir nombre");
        return nom;
    }
   
    
        //comparación
    public void comparar(float peso1, float peso2, String nombre1, String nombre2){
        if(peso1>peso2){
            JOptionPane.showMessageDialog(null, nombre1 + " es quien mas pesa: " + peso1);
        }
        if(peso2>peso1){
            JOptionPane.showMessageDialog(null, nombre2 + " es quien mas pesa: " + peso2);
        }
        if(peso1==peso2)
            JOptionPane.showMessageDialog(null, nombre1 + " y " + nombre2 + " pesan lo mismo: " + peso1);
        
    }
}
