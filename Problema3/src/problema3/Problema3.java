/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

/**
 *
 * @author PERSONAL
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int contador = 1;
        int limite = 6;
        int numero;
        String lista = "";

        while (contador <= limite) {
            numero = (contador * contador) + 1;
            lista = String.format("%s%d\n", lista, numero);
            contador++;
        }

        System.out.printf("%s", lista);
    }
    
}
