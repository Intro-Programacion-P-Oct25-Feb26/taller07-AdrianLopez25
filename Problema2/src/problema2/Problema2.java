/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author PERSONAL
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador = 1;
        int limite = 10;
        int numero;
        String lista = "";

        while (contador <= limite) {
            numero = contador * (contador + 1);
            lista = String.format("%s%d\n", lista,
                    numero);

            contador = contador + 1;
        }
        System.out.printf("%s", lista);
    
    }
    
}
