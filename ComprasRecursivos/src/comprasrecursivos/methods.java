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

public final class methods {

    //CONSTANTES
    private final double m0 = 200, m1 = 100, m2 = 50, m3 = 20, m4 = 10, m5 = 5, m6 = 2, m7 = 1;

    //VARIABLES
    private double pagoCliente = 0;
    private double totalCompra = 0;
    int cantidadDeMonedas = 0;

    //CONSTRUCTOR
    public methods(double pagoClient, double totalComp) {
        this.pagoCliente = pagoClient;
        this.totalCompra = totalComp;
        method0(pagoCliente - totalCompra);
    }

    //METODOS
    public void method0(double cambio) {
        if (cambio >= m0) {
            method1(cambio, totalCompra, m0);
        } else {
            if (cambio >= m1) {
                method1(cambio, totalCompra, m1);
            } else {
                if (cambio >= m2) {
                    method1(cambio, totalCompra, m2);
                } else {
                    if (cambio >= m3) {
                        method1(cambio, totalCompra, m3);
                    } else {
                        if (cambio >= m4) {
                            method1(cambio, totalCompra, m4);
                        } else {
                            if (cambio >= m5) {
                                method1(cambio, totalCompra, m5);
                            } else {
                                if (cambio >= m6) {
                                    method1(cambio, totalCompra, m6);
                                } else {
                                    if (cambio >= m7) {
                                        method1(cambio, totalCompra, m7);
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
        if (totalCompra > pagoCliente) {
            System.out.println("EL DEPOSITO DE PAGO NO COICIDE, LE FALTA MAS RECURSOS.. \n");
        }
    }

    public void method1(double cambio, double totalCompra, double tipoMoneda) {
        cantidadDeMonedas = (int) (cambio / tipoMoneda);
        System.out.println(cantidadDeMonedas + " MONEDAS DE $" + tipoMoneda);
        method0(cambio - tipoMoneda * cantidadDeMonedas);

    }
}
