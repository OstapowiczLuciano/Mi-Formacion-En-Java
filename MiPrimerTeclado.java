import java.util.*; //El objeto que utilizaremos se llama Scanner

/*Vamos a pedir por teclado un nombre y una edad
Luego vamos a imprimir esos datos por consola */

public class MiPrimerTeclado {
public static void main(String[] args) {
    // Declaracion de las variables
    String nombre;
    int edad;

    //Declaracion de objeto
    Scanner miTeclado;

    //(Inicializacion) Instanciación del objeto
    miTeclado = new Scanner(System.in);

    // Inicializacion de las variables por instrucciones de salida-entrada
    System.out.println("Ingrese su nombre:");
    nombre = miTeclado.nextLine(); // nextLine es el método que permite que miTeclado guarde cadenas de texto

    System.out.println("Ingrese su edad:");
    edad = miTeclado.nextInt(); // nextInt es el método que permite que miTeclado guarde números enteros 

    // Resultado
    System.out.println("Hola "+nombre+" la edad que ingresaste es "+edad);

    miTeclado.close();



}
}