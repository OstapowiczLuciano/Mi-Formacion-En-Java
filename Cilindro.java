/* Esta clase se encarga de los calculos anidados para el cilindro */

public class Cilindro {
    
    //Zona de funciones
    public static double superficie(double radio, double altura){
        //Cuerpo
        //Calculo de la superficie de tapa y piso S=2*supcirculo
        double supCirculos = 2*Circulo.superficie(radio); // aca se produce el primer anidamiento
        //Calculo de la base del rectángulo --> asociado al perim del circ
        double base = Circulo.perimetro(radio);
        //Calculo de la superficie del rectángulo
        double supRectangulo = Rectangulo.superficie(base, altura);

        //Valor de retorno
        return supCirculos+supRectangulo;
    }

    

}