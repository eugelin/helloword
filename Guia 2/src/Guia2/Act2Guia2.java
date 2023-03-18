package Guia2;
   /* 2 - Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla. */
import java.util.Scanner; 

public class Act2Guia2 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--INGRESE SU NOMBRE--");
        Scanner leer = new Scanner(System.in); 
        String nombre = leer.nextLine();//PARA VARIABLES DE TIPO STRING VA LINE
        System.out.println("Su nombre es "+nombre);
    }
}