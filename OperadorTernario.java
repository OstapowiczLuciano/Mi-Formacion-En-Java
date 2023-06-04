/**
Tema: Estructura de selección. Operador ternario.
@author: Ostapowicz Luciano Martin
*/

/*
Simplificaremos el uso de una una estructura if-else 
mediante la utilización de un operador ternario
Lo haremos con el ejemplo anterior de evaluación de números pares e impares
*/
public class OperadorTernario{
    public static void main(String[] args) {
        
        //Declaracion de variable
        int num1 = 30;
        

        /*if(num%2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }*/

        //Operador ternario
        String txt = (num1%2 == 0)? "El número es par" : "El número es impar";

        System.out.println(txt);

    }
    
}