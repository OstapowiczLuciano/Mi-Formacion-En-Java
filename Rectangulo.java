/* Esta clase se encarga de los calculos del rectángulo */

public class Rectangulo {
    
    //Zona de los métodos
    // Planteamos funciones con retorno para la S=b*h
    public static double superficie(double base, double altura){
        //cuerpo
        //Variable local
        double superficie = base*altura;
        //Valor de retorno
        return superficie;
    }
    
    // Planteamos el perimetro del rectángulo p= 2*b+2*h
    public static double perimetro(double base, double altura){
        //cuerpo
        //Variable local
        double perimetro =  2*base+2*altura;
        //Valor de retorno
        return perimetro;
    }    
    
}
    