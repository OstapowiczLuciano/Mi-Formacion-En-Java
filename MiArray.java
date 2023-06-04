/*
* Vamos a codificar metodos para nuestro Array
* como para que sea parecido a un arraylist
*/

public class MiArray {
    // ZONA DE LOS METODOS
    // Metodo para hallar la longitud del Array
    public static int size(int[] nombre){
        //Valor de retorno
        return nombre.length;
    }

    // Metodo para imprimir un array
    public static void imprimir(int[] nombre){
        //Planteamos un bucle for-each para imprimir
        for(int elemento:nombre){
            System.out.println(elemento);
        }
    }

    // Metodo para reemplazar valores set()
    public static void set(int[] nombre, int indice, int valor){
        nombre[indice] = valor;
    }

    // Metodos para imprimir valores varios
    public static void imprimir(String mensaje){
        System.out.println(mensaje);
    }

    // Metodo para imprimir valores numericos
    public static void imprimir(int numerico){
        System.out.println(numerico);
    }

    public static void main(String[] args) {
        // Declaracion e inicializacion de un array numerico
        int[] numeros = {123, 456, 789, 159};

        //Uso de nuestros métodos
        imprimir("La longitud del array es:");
        imprimir(size(numeros));
        imprimir("Imprimimos todo el array:");
        imprimir(numeros);
        imprimir("Seteamos el indice 1 por 753");
        set(numeros, 1, 753);
        imprimir("Imprimimos todo el array:");
        imprimir(numeros);

    }  
}