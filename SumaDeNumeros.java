import java.util.Scanner; // En esta oportunidad importamos solo el objeto

public class SumaDeNumeros {
 public static void main(String[] args) {
     // Declaracion de las variables
     double num1, num2, resultado;

     // Declaracion del objeto
     Scanner miTeclado;

     // Instanciamos el objeto (inicializamos)
     miTeclado = new Scanner(System.in);

     // Instrucciones de salida-entrada
    System.out.println("Ingrese un número:");
    num1 = miTeclado.nextDouble();

    System.out.println("Ingrese otro número:");
    num2 = miTeclado.nextDouble();

    //Proceso
    resultado = num1+num2;

    // Resultado
    System.out.println("El resultado es: "+resultado);
    System.out.println("** El programa ha finalizado **");

    //Cierre del objeto teclado
    miTeclado.close(); // Con esta cláusula cerramos el teclado virtual, liberando ram.













 }
}
