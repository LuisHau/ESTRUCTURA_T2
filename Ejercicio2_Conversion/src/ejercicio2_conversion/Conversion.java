//TEMA 2. RECURSIVIDAD
//FECHA: 02/10/2018
//NOMBRE: HAU CUPUL LUIS MIGUEL
//EJERCICIO 2. B) Realice un programa que transforme un número en base 10 a binario. (30 pts)
package ejercicio2_conversion;

public class Conversion {

    int Decimal;
    long Binario;

    public long binario(int n) {
        if (n < 2) {
            return n;
        } else {
            return (n % 2) + (binario(n / 2)) * 10;
        }
    }
}
