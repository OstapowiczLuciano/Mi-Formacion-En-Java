/* Comenzamos a programar funciones con retorno */

public class MiFuncion {

    // Zona de las funciones
    public static void imprimir(String txt){
        System.out.println(txt);
    }

    // Metodos con retorno --> Hacemos una función que sume dos numeros enteros
    public static int sumar(int num1, int num2){
        // Declaracion e inicializacion de una variable local
        int resultado = num1+num2;
        // Valor de retorno
        return resultado;
    }


    public static void main(String[] args) {
        // Llamamos al metodo void
        imprimir("Esto es un método void");

        // Llamamos al metodo return
        imprimir("El resultado es "+sumar(123, 156));


    }








}