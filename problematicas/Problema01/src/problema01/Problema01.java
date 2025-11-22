/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author PERSONAL
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String reporte = "Serie generada:\n";

        int numero = 2;      
        int incremento = 4;   
        int contador = 1;

        while (contador <= 10) {  
            reporte += numero + "\n";

            numero += incremento;  
            incremento += 2;       

            contador++;
        }

        System.out.println(reporte);
    }
        

    
}
