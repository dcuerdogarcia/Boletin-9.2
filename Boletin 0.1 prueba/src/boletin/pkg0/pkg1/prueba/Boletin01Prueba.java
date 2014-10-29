
package boletin.pkg0.pkg1.prueba;



public class Boletin01Prueba {

    
    
    public static void main(String[] args) {
     double numero1,numero2;
        Comparador obx= new Comparador();
        numero1=obx.pedirDato();
        numero2=obx.pedirDato();
        obx.compararSimple(numero1, numero2);
        
        
    }
    
}
