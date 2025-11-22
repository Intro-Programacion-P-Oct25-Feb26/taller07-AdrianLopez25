/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

/**
 *
 * @author PERSONAL
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
    int limite = 15;
    int denominador = 3;
    String mensaje = "1";
    double suma = 1;

    boolean bandera = false;

    while (contador < limite) {

        if (bandera) {
            mensaje = String.format("%s + 1/%d", mensaje, denominador);
            suma = suma + (1.0 / denominador);
        } else {
            mensaje = String.format("%s - 1/%d", mensaje, denominador);
            suma = suma - (1.0 / denominador);
        }

        bandera =! bandera; 
        denominador = denominador + 2;
        contador = contador + 1;
    }

    System.out.printf("%s\nSuma de fracciones = %.5f\n", mensaje, suma);
    }
    
}
