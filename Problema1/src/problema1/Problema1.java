/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author PERSONAL
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador = 1;
        double promedad = 0;
        double promesta = 0;
        int edad;
        double estatura;
        boolean bandera = true;
        String salida;
        String posicion;
        String nombre;
        String mensaje = "";
        String lista = "";

        while (bandera) {

            System.out.println("Ingrese nombre de jugador:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese posicion de jugador:");
            posicion = entrada.nextLine();

            System.out.println("Ingrese edad:");
            edad = entrada.nextInt();

            System.out.println("Ingrese estatura:");
            estatura = entrada.nextDouble();

            promedad += edad;
            promesta += estatura;

            mensaje += String.format("%s. %s - %s, edad %d, estatura %.2f\n",
                    contador, nombre, posicion, edad, estatura);

            lista += String.format("%d\n", edad);

            entrada.nextLine(); // Limpia buffer

            System.out.println("Escriba 'si' para terminar o ENTER para continuar:");
            salida = entrada.nextLine();

            if (salida.equalsIgnoreCase("si")) {
                bandera = false;
            }

            contador++;
            if (salida.equals("si")) {
                bandera = false;
            }
            contador = contador + 1;

        }

        int totalJugadores = contador - 1;

        promedad /= totalJugadores;
        promesta /= totalJugadores;

        System.out.printf("\n--- RESULTADOS ---\n" +
                "Lista de jugadores:\n%s\n" +
                "Lista de edades:\n%s\n" +
                "Promedio edad: %.2f\n" +
                "Promedio estatura: %.2f\n",
                mensaje, lista, promedad, promesta);
    
    }
    
}
