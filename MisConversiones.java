import java.util.*;
/*
Hacer un programa Java que lea dos números enteros por teclado y los muestre por pantalla.
*/
public class MisConversiones {
    public static void main(String[] args) {

        //Declaracion de variables 
        int leer_numero1;
        int leer_numero2;
        //Declaracion de objeto
        Scanner numero; 
        //Inicializacion de objetos
        numero = new Scanner(System.in); 
        //Instrucciones de salida	
        System.out.println("Ingresa numero 1:");
            leer_numero1 = numero.nextInt();	
        System.out.println("Ingresa numero 2:");
            leer_numero2 = numero.nextInt();
        //Salida de resultados
        System.out.println("El primer número ingresado es "+leer_numero1);
        System.out.println("El segundo número ingresado es "+leer_numero2);  
    }
    

    

}