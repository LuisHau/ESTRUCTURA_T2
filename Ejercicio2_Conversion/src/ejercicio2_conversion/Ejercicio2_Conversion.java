//TEMA 2. RECURSIVIDAD
//FECHA: 02/10/2018
//NOMBRE: HAU CUPUL LUIS MIGUEL
//EJERCICIO 2. B) Realice un programa que transforme un número en base 10 a binario. (30 pts) 
package ejercicio2_conversion;

import java.util.Scanner;

public class Ejercicio2_Conversion {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Conversion conversion1 = new Conversion();
        System.out.print("INGRESE UN NUMERO DE BASE 10: ");
        conversion1.Decimal = Teclado.nextInt();
        conversion1.Binario = conversion1.binario(conversion1.Decimal);
        System.out.println("EL BINARIO ES: " + conversion1.Binario);
    }

}
