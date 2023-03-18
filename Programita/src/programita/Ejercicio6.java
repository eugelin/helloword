package programita;
/* 6 - Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25. */
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Ejercicio6 {
     public static void main(String[] args) {
    System.out.println("--INGRESE DOS NÚMEROS ENTEROS--");
    Scanner leer = new Scanner(System.in);
    int num1 = leer.nextInt();
    int num2 = leer.nextInt();
    if (num2>25 && num1>25) { //Condicion entre parentesis, tiene que ser verdadero para ejecutar este bloque
    System.out.println("Ambos números son mayores a 25 ");
    }
    else if (num1>25 || num2>25) {
    System.out.println("Uno de los números ingresados en mayor a 25 ");
    }
    else {
    System.out.println("Ambos números ingresados no son mayores a 25");    
    }
    }
}
