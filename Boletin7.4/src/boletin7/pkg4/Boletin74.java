
package boletin7.pkg4;

public class Boletin74 {

    public static void main(String[] args) {
        float peso1, peso2;
        String nombre1, nombre2;
        
        NewClass obx = new NewClass();
        nombre1 = obx.pedirNombre();
        peso1 = obx.pedirDatos();
        nombre2 = obx.pedirNombre();
        peso2 = obx.pedirDatos();
        obx.comparar(peso1, peso2, nombre1, nombre2);
    }
}
