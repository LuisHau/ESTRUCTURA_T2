//TEMA 2. RECURSIVIDAD
//FECHA: 02/10/2018
//NOMBRE: HAU CUPUL LUIS MIGUEL
//EJERCICIO 1. A) Realiza un programa para determinar si una palabra o frase es un palíndromo. (20 pts)
package ejercicio1_palindromo;

import java.util.Scanner;

public class Ejercicio1_Palindromo {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Palindromo palindromo1 = new Palindromo();
        System.out.println("INGRESE UNA PALABRA O FRASE (TODAS m O M POR COMPLETO): ");
        String texto = Teclado.nextLine();
        texto = texto.replaceAll(" ", "");
        palindromo1.cadena = texto;
        palindromo1.tamanio = texto.length() - 1;
        if (Palindromo.palindromo(palindromo1.cadena, 0, palindromo1.tamanio)) {
            System.out.println("ES UN PALINDROMO");
        } else {
            System.out.println("NO ES UN PALINDROMO");
        }
    }

}
