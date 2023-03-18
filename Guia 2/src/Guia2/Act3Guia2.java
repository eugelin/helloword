package Guia2;
/* 3 - Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java. */
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Act3Guia2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("--INGRESE UNA FRASE--");
    Scanner leer = new Scanner(System.in);
    String frase = leer.nextLine();
    System.out.println("Frase en mayuscula : "+toUpperCase(frase));
    System.out.println("Frase en mayuscula : "+toLowerCase(frase));
    }
}
