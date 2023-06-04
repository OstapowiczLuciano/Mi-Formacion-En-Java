public class EstructuraSalto {
    public static void main(String[] args) {
        // Declaracion de variables
        int nro = 5;
        int hasta = 15;
    
        //Bucle for
        for (int i = 0; i<=hasta; i++ ) {
             
            if (nro == i) {
              System.out.println("conté y corté en "+i);  
              continue;
            }
    
           System.out.println("Contando "+i);
    
        }
    
        System.out.println("**El programa ha finalizado**");
    
    
    
    
    
    
    }
    
        
    
    }