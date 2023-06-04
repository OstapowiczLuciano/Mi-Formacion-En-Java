/* En este ejemplo veremos el paso por valor 
* El paso por valor indica que el valor original de una
* variable no se modifica al ingresarla a un método */

public class PasoPorValor {
    //Zona de los metodos
    public static void cambio(int num){
        num = 15;
    }
    
    public static void main(String[] args) {
        // Declaracion e inicializacion de una varible
        int num = 2;
    
        // Llamamos a nuestro cambio
        cambio(num);
    
        System.out.println("El valor de num luego del método es: "+num);
    
    
    
    
    }
    
        
    
}