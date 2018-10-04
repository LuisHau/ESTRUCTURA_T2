//TEMA 2. RECURSIVIDAD
//FECHA: 02/10/2018
//NOMBRE: HAU CUPUL LUIS MIGUEL
//EJERCICIO 1. A) Realiza un programa para determinar si una palabra o frase es un palíndromo. (20 pts)
package ejercicio1_palindromo;

public class Palindromo {

    String cadena;
    int tamanio;

    //METODO RECURSIVO 
    public static boolean palindromo(String cadena, int a, int z) {
        if (a != cadena.length() / 2) {
            if (cadena.charAt(a) == cadena.charAt(z)) {
                return palindromo(cadena, a + 1, z - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
