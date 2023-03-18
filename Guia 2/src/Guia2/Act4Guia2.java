package Guia2;
/* 4 - Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5). */
import java.util.Scanner;

public class Act4Guia2 {
    /**
 *
 * @author Administrador
 */
     public static void main(String[] args) {
    System.out.println("--INGRESE GRADOS CENTIGRADOS--");
    Scanner leer = new Scanner(System.in);
    double C = leer.nextDouble();
    double F = C + (9* C / 5 );
    System.out.println("Grados Fahrenheit : "+F);
     }
}
