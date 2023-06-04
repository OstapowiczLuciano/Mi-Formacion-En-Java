import java.util.ArrayList;

/* DESAFIO DE CLASE 2: Realizaremos una aplicacion que nos permita 
* cargar una lista de super en un objeto ArrayList
* Programaremos un servicio de buscador
*/

public class Buscador {
    public static void main(String[] args) {
        // Declaracion del objeto ArrayList
        ArrayList<String> productos;

        // Instanciación del objeto 
        productos = new ArrayList<String>();

        // Agregamos productos a nuestro listado .add()
        productos.add("pan");
        productos.add("1k de tomates");
        productos.add("leche");
        productos.add("cafe");
        productos.add("galletitas");

        // Buscamos en el arraylist
        String buscador = "pan";

        // Procedimiento
        for( String producto: productos){

            if (producto.equalsIgnoreCase(buscador)) { //utilizando .contains nos busca alguna similitud y nos devuelve el primer valor similar esto es en el caso de tener cargadas oraciones por ejemplo tomates en "1k de tomates".
                System.out.println("Tenés que comprar este producto: "+producto);
            }

        }






    }
    

    

}