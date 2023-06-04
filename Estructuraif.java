/**
Tema: Estructuras de seleccion. Flujos de desiciones.
@author: Ostapowicz Luciano Martin
*/

/*
Evaluaremos un número si es par o impar
*/

public class EstructuraIf{
    public static void main(String[] args) {
        // Declaracion de variables e inicializar en una linea
        int num = 101;
    
        //Estructura if
        if (num == 0) {
            System.out.println("El número es cero");
        }else if (num%2 == 0) {
         System.out.println("El número es par");
        }else {
         System.out.println("El número es impar");
        }
    
    // Instruccion de salida
    System.out.println("** El programa ha finalizado **");
    
    }
    }