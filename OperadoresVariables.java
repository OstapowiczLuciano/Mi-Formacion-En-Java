/*
Clase 17
Realizaremos operaciones aritmeticas con variables de distintos tipos
Utilizaremos operadores varios y realizaremos intrucciones de salida
*/

public class OperadoresVariables {

    public static void main(String[] args) {
        //Demostraremos la regla case sensitive

        //Declaracion de variables
        String nombre; // String es un tipo objeto que almacena cadenas de texto
        String nombrE;

        //Inicializacion de la variable
        nombre = "Fulana";
        nombrE = "Mengano";

        //Instruccion de salida 
        System.out.println("nombre es "+ nombre);
        System.out.println("nombrE es "+ nombrE);

        //Declaramos variables del tipo primitivas
        byte num1;   // enteros limitados
        int num2;    // enteros
        double num3; // decimales
        char letra;  // caracteres unitarios entre ''
        boolean condicion; // logicos

        //Inicializacion de las variables
        num1 = 127;
        num2 = 1438;
        num3 = 5.5;
        letra = 'a';
        condicion = true; 

        // Instrucciones de salida
        System.out.println("La variable lógica contiene: "+condicion);
        System.out.println("La variable Enteros Limimitados contiene: "+num1);
        System.out.println("La variable Enteros contiene: "+num2);
        System.out.println("La variable Decimales contiene: "+num3);
        System.out.println("La variable Caracteres unitarios contiene: "+letra);

        //Declaramos variables para operaciones aritméticas

        int num4, num5, suma, resta, mult, div, prom, prom1, prom2, prom3;

        //Inicializacion
        num4 = 15;
        num5 = 3;

        //Operaciones
        suma = (num4+num5);
        resta = (num4-num5);
        mult = (num4*num5);
        div = (num4/num5);

        // tarea para la casa resta mult y div
        prom = (num4+num5)/2;
        prom1 = (num4-num5)/2;
        prom2 = (num4*num5)/2;
        prom3 = (num4/num5)/2;

        //Instruccion de salida
        System.out.println("La suma vale "+suma);
        System.out.println("La resta vale "+resta);
        System.out.println("La multiplicacion vale "+mult);
        System.out.println("La division vale "+div);
        System.out.println("El promedio es "+ prom);
        System.out.println("El promedio es "+ prom1);
        System.out.println("El promedio es "+ prom2);
        System.out.println("El promedio es "+ prom3);
        System.out.println("El promedio sin guardar en variables es "+(num4+num5)/2);
        System.out.println("El promedio sin guardar en variables es "+(num4-num5)/2);
        System.out.println("El promedio sin guardar en variables es "+(num4*num5)/2);
        System.out.println("El promedio sin guardar en variables es "+(num4/num5)/2);

        // Operadores de asignacion
        // Declaracion e inicializacion
        int a = 5;
        int b = 5;
        int c = 5;

        //Autoresta
        a -= 2; //es lo mismo que a=a-5;
        b += 2; //es lo mismo que a=a+5;
        c *= 2; //es lo mismo que a=a*5;

        //I de salida
        System.out.println("el valor de a es "+a);
        System.out.println("el valor de a es "+b);
        System.out.println("el valor de a es "+c);
        // Tarea para la casa autosuma y automultiplicacion

        //Operadores incrementales
        //Declaracion e inicializacion de la variable
        int contador = 5;

        //Operador autoincremento
        System.out.println("El contador es "+ contador);
        System.out.println("El contador con incremento "+ ++contador); // contador = contador+1;
        System.out.println("El contador con incremento "+ ++contador);
        System.out.println("El contador con incremento "+ ++contador);










    }
    

}