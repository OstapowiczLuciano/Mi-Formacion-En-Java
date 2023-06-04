/* Vamos a realizar un procedimiento */

public class FuncionHolaMundo {
    // Zona de los métodos, 
    // public: es un modificador de acceso
    // static: permite que el metodo se utilice efectivamente en un esp de trabajo
    // void: es el tipo en este caso nos dice que el metodo es un procedimiento, no nos devuelve algo a la memoria
    
    // Saludo hola mundo
    public static void saludo(){
        System.out.println("Hola mundo");
    }
    
    // Metodo void para saludo personalizado
    public static void saludo(String nombre){
        System.out.println("Hola "+nombre);
    }
    
    // Metodo void para saludo personalizado y DNI
    public static void saludo(String nombre, int dni){
        System.out.println("Hola "+nombre+" tu dni es "+dni);
    }
    
    // Metodo void que imprima la suma de dos numeros
    public static void sumar(int num1, int num2){
        System.out.println("La suma de los números es: "+ (num1+num2));
    }
    
    // Metodo mas facil para imprimir por consola
    public static void imprimir(String txt){
        System.out.println(txt);
    }
    
    
    
    public static void main(String[] args) {
        // Dentro del metodo main utilizamos las funciones que diseñamos
        imprimir("Este es un saludo");
        saludo();
        // Saludo personalizado
        imprimir("Este es un saludo a Julio");
        saludo("Julio");
        // Saludo con dni
        imprimir("Este es un saludos con dni");
        saludo("Julio", 1234567);
        // Suma de dos numeros
        imprimir("Este es un método que suma");
        sumar(156, 897);

    }

    
    
}