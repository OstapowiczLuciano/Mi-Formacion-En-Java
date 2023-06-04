public class EstructuraIfElseIf{
    public static void main(String[] args) {
    // Declaracion de variables
    int nota;
    
    // Inicializacion de variables
    nota = 10;
    
    // Estructura if-else-if
    if (nota == 10) {
        System.out.println("La nota es cuadro de honor");
    }else if (nota >=6 && nota < 10){ // && es el equivalente a Y que utilizabamos en PseInt
        System.out.println("Alumno/a es regular");
    }else if (nota >=1 && nota <6) {
        System.out.println("Alumno/a en proceso");
    }else if (nota == 0) {
        System.out.println("Alumno/a debe recursar");
    }else {
       System.out.println("Introduzca una nota válida"); 
    }
    
    //Instruccion de salida
    System.out.println("** El programa ha finalizado **");
    
    }
    }
    
    
    
    
    
    
    
    