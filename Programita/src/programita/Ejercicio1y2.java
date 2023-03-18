package programita;
/* 1 - Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos
tipos de datos.
2 - ¿Recuerdas las variables que creaste en el ejercicio anterior? Ahora deberás
asignarles un valor. */
public class Ejercicio1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero = 9 ;
       String nombre = "eugelin" ;
       boolean lol = true ; 
       double decimal = 23.3 ;
       char caracter = 'X'; //variables de tipo caracter van entre  '..'
       System.out.println("el número "+numero+" es "+lol+" si lo comparamos con el número "+decimal+" esto segun la doctora "+nombre);
    }
    //BLOQUE DE DETECCION DE ERRORES 1
       /* public static void main(String[] args) {
        String nombre;
        boolean bandera;
        char caract;
    } */
    //BLOQUE DE DETECCION DE ERRORES 2
        /* public static void main(String[] args) {
        int numero = 48;
        double decimales = 3.55;
        boolean bandera = false;
    } */
}


