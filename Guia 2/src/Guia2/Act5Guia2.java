package Guia2;
/* 5 - Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt(). */
import java.util.Scanner;

public class Act5Guia2 {
    /**
 *
 * @author Administrador
 */
    public static void main (String[] args){
    System.out.println("--INGRESE UN NÚMERO ENTERO--");
    Scanner leer = new Scanner(System.in);
    int numero = leer.nextInt();
    System.out.println("El doble del número ingresado es de : "+(numero*2));
    System.out.println("El triple del número ingresado es de : "+(numero*3));
    System.out.println("El triple del número ingresado es de : "+Math.sqrt(numero));
    }
}
