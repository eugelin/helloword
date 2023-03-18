package Guia2;
/* 1 - Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma */
import java.util.Scanner; // Este es el importe de la clase Scanner 

public class Act1Guia2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--INGRESE DOS NÚMEROS--");
        Scanner leer = new Scanner(System.in); //SCANNER -> me permite la entrada por teclado
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma= num1+num2;
        System.out.println("La suma de los números ingresados es de : "+suma);
    }
}