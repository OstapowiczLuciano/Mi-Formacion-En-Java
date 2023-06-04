import java.util.*;

/* 
* Hacer una aplicación que permita ingresar 2 números *  y mostrar sus operaciones básicas.
*/

public class Desafio3 {
    public static void main(String[] args) {
        //Declaro el objeto Scanner
        Scanner miTeclado;

        //Inicializo mi objeto
        miTeclado = new Scanner(System.in);

        //Declaro variables que van a almacenar datos por teclado
        int a , b; //Esta es otro forma de inicializar todo en un mismo renglon siempre que sean el mimo tipo
        double suma,resta,multiplicacion,division;


        //Instrucciones de entrada salida
        System.out.println("Ingrese el primer numero ");
        a = miTeclado.nextInt();
        System.out.println("Ingrese el segundo numero ");
        b = miTeclado.nextInt();

        //Proceso
        suma = a+b;
        resta = a-b;
        multiplicacion = a*b;
        division = a/b;

        //Instrucciones de salida
        System.out.println("La suma de los 2 numeros ingresados es ; " + suma);
        System.out.println("La resta de los 2 numeros ingresados es ; " + resta);
        System.out.println("La multiplicacion de los 2 numeros ingresados es ; " + multiplicacion);
        System.out.println("La division de los 2 numeros ingresados es ; " + division);    

    }
}
    

