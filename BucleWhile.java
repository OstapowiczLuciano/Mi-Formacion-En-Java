import java.util.Scanner; // importamos el objeto

/* Vamos a contar números del 0 al 100 */

public class BucleWhile {
public static void main(String[] args) {
    // Declaro una variable
    int num, contador;

    // Inicializacion de variables
    contador = 0;

    // Declaro objeto
    Scanner miTeclado;

    // Instanciación (inicializacion)
    miTeclado = new Scanner(System.in);

    // Instruccion de s-e
    System.out.println("Ingrese un número hasta donde quiera contar:");
    num = miTeclado.nextInt();

    // Bucle while
    while(contador <= num){
        //Bloque de sentencias a ejecutar
        System.out.println(contador);

        //Actualizacion de la variable de control
        ++contador;
    }

    //avisamos que todo finalizó
    System.out.println("*** El programa ha finalizado ***");

    miTeclado.close();




}
}
