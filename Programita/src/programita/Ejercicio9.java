package programita;

import java.util.Scanner;

/* 9 - Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break */
/**
 *
 * @author Administrador
 */
public class Ejercicio9 {
    public static void main (String[] args){
        int cont = 0;
        int numero;
        int suma = 0;
        System.out.println("--INGRESE NÚMEROS--");
        do {
        cont = cont + 1;
        Scanner leer = new Scanner(System.in);
        numero = leer.nextInt();
        if (numero>0){
            suma = suma + numero;
        } 
        if (numero == 0) {
        break; //SALE DEL BUCLE
        }
        }while (cont!=20);
        if (numero == 0) {
        System.out.println("Se capturó el numero cero");
        System.out.println("La suma de los números ingresados es de : "+suma);
        }
    }
    
}
