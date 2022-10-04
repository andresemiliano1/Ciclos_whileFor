/*

Ciclo for


     for(inicializacion ; condicion ; aumento o decremento) {
     instruciones;
     }
    inicializacion: del iterador.... de donde parte el bucle.
    condicion: lo que rige el bucle
    aumento o decremento: del ciclo....

    ventajas:
    .- puedes hacer la inicializacion de la variable dentro del mismo bucle, a difencia de los ciclos while o do while

 */

import java.util.Scanner;

public class cicloWhileFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador; //añadimos la variable contador para luego igualarla a i con la funcion Scanner
        // le pedimos al usuario que digite la condicion; hasta donde llegaran los terminos.

        System.out.println("digite el numero hasta el cual se digitara la condicion");
        contador = entrada.nextInt();

        // contador puede ser sustituido, limitado o implementar un numero arbitrario por el programador.
        //generamos el ciclo: -->

        for(int i=0; i<=contador;  i++){ //si sustituimos ++ por +=2 nos saldran solo numero pares

            System.out.println(i);
        }
    }
}