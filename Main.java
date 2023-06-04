public class Main {
//Zona de los metodos

    public static int factorial(int n){ // esta línea es la firma del metodo
        //cuerpo 
        if (n == 0) {
            return 1; // Esto es el caso base
        }else {
            return n*(factorial(n-1)); // Aca es donde se produce la recursividad
        }
        


    }
    
    public static void main(String[] args) {
        
        // Llamamos a nuestra función recursiva
        System.out.println("El factorial de 5 es:");
        System.out.println(factorial(5));

        

    }
    
}
