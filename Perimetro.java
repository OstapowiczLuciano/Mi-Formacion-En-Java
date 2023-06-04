/* Hacemos una calculadora de perímetros pero con funciones */

public class Perimetro {
    // Zona de los métodos
    
    // Planteamos el perímetro de un círculo 2.Pi.r
    public static double circulo(double radio){
        // Declaracion e inic de la VL
        double perim = 2*radio*Math.PI;
        // Valor de retorno
        return perim;
    }
    
    // Para imprimir mas fácil
    public static void imprimir(String txt){
        System.out.println(txt);
    }
    
    // Perimetro del rectángulo P=2*b+2*H;
    public static double rectangulo(double base, double altura){
        // Declaracion e inic 
        double perim = 2*base+2*altura;
        // Valor de retorno
        return perim;
    }
    
    // Perímetro de un cuadrado C=4*l
    public static double cuadrado(double lado){
        // Decl e inic de la variable
        double perim = 4*lado;
        // Valor de retorno
        return perim;
    }
    
    // Superficie del rectángulo S=b*h
    public static double srectangulo(double base, double altura){
        // Decl e inic de var
        double sup = base*altura;
        // Valor de retorno
        return sup;
    }
    
    // En otro archivo que se llame Superficies van a hacer:
    // Sup del circulo 2*Pi*radio*radio
    // Sup del cuadrado lado*lado
    // Lo llaman desde el metodo main
    
    
    
    
    
    public static void main(String[] args) {
        // El perimetro de un circulo radio 1
        imprimir("El perimetro de un circulo es "+circulo(1));
    
        // El perímetro de un rectángulo es
        System.out.println("El perímetro de un rectangulo de 1x2 es: "+rectangulo(1,2));
    
        // El perímetro de un cuadrado es
        System.out.println("El perímetro de un cuadrado es "+cuadrado(2));
    
        // La superficie de un rectángulo 2x3
        System.out.println("La superficie de un rectángulo 2x3 es "+srectangulo(2,3));
    
    
    
    }
    
    
        
    
}