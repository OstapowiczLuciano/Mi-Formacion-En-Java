import java.util.ArrayList;

/*Utilizamos ArrayList para cargar marcas de automoviles*/

public class MiArrayList {
public static void main(String[] args) {
    // Declaracion del Arraylist
    ArrayList<String> autos; //<> estos son brackets

    // Inicializacion (Instanciación) del AL
    autos = new ArrayList<String>();

    // Metodos
    //1- Carga de los AL .add() volvo, bmw, ford, mazda
    autos.add("volvo");
    autos.add("bmw");
    autos.add("ford");
    autos.add("mazda");

    //2- Imprimimos el arrayList completo
    System.out.println("El AL de autos es: "+autos);

    //3- Obtenemos la longitud del AL metodo .size()
    System.out.println("La long del AL es: "+ autos.size());

    //4- Cargamos otro auto torino
    autos.add("torino");
    System.out.println("El nuevo AL es: "+ autos);

    // 5- Consulta de elementos de un indice particular .get()
    System.out.println("El elemento del indice 2 es:"+ autos.get(2));

    // 6- Vamos a cambiar ford por fitito
    autos.set(2, "fitito");

    System.out.println("El nuevo elemento de indice 2 es: "+ autos.get(2));
    System.out.println("El nuevo AL es: "+ autos);









}

    

}