package programita;
/* 8 - Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta. */ 
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Ejercicio8 {
    public static void main (String[] args){
    int nota = 11;
    while(nota<0 || nota>10){
    System.out.println("--INGRESE UN NÚMERO ENTRE EL 0 Y 10--");
    Scanner leer = new Scanner(System.in);
    nota = leer.nextInt();
    if (nota>=0 && nota<=10){
    System.out.println("Correcto!!");
    }
    else { 
    System.out.println("El valor ingresado no está en los parámetros"); 
    }
    }
    
    }
}

