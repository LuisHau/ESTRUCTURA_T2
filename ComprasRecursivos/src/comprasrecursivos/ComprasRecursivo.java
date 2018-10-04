//TEMA 2. RECURSIVIDAD
//FECHA: 02/10/2018
//NOMBRE: HAU CUPUL LUIS MIGUEL
//EJERCICIO 3. C) De acuerdo a una compra realizada permita dar el cambio correcto en monedas y/o billetes mexicanos (200,100,50,20, 10, 5, 2, 1). Ejemplo: (50 pts)

/*Suponiendo que la compra fue de $27.00 pesos y se entregó un billete $100.00 pesos el cambio debe ser $73.00 pesos. La salida debe ser:

3 monedas de 20 pesos
1 moneda de 10 pesos
1 moneda de 2 pesos
1 moneda de 1 peso*/

package comprasrecursivos;

import java.util.Scanner;

public class ComprasRecursivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nINGRESE EL TOTAL DE LA COMPRA: \n");
        double c = sc.nextDouble();
        System.out.println("\nINGRESE EL MONTO DEPOSITADO: \n");
        double m = sc.nextDouble();
        System.out.println("\nCAMBIO EN MONEDAS: \n");
        methods mt = new methods(m, c);

    }
}

