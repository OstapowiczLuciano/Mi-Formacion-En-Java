import java.util.Scanner;
/* Vamos a hallar el factorial del número 5
5! = 5x4x3x2x1
 */

public class BucleDoWhile {
public static void main(String[] args) {
// Declaracion e inicialización de variables
int n = 5; // Es la variable que contiene el numero del factorial en el caso de habilitar Scanner no es necesario inicializar por hard-codeo
int acumulador = 1;
int contador = 1;

// Declaracion del objeto Scanner, para teclado virtual
Scanner miTeclado;

// (Inicializacion) Instanciación del Objeto
miTeclado = new Scanner(System.in);

//Cargamos la variable n por teclado
System.out.println("Ingrese un número para hallar su factorial:");
n = miTeclado.nextInt();

// Bucle do-while
do {
    acumulador *= contador;     //acumulador = acumulador*contador; 

    //Actualización de la variable de control

    ++contador;  //contador = contador+1;
    
} while (contador<=n);

// Resultado
System.out.println("El factorial de "+n+" es "+acumulador);
System.out.println("** El programa ha finalizado **");

miTeclado.close();

}    

} 