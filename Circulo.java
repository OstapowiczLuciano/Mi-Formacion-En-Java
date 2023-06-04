/* Esta clase se encarga de los calculos del circulo */

public class Circulo {
    
    //Zona de los metodos S=PI*r^2 --> Funcion con retorno
    public static double superficie(double radio){
        //Cuerpo 
        //Declaracion e inic de un variable local 
        double superficie = Math.PI*radio*radio;
        //Valor de retorno
        return superficie;
    }

    // Método para hallar el perímetro del circulo P= 2*PI*r
    public static double perimetro(double radio){
        //Cuerpo
        //Decl e inic de la variable local
        double perimetro = 2*Math.PI*radio;
        //Valor de retorno
        return perimetro;
    }
    

}