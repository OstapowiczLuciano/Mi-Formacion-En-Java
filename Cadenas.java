/*Vamos a entender los Strings*/

public class Cadenas {
    public static void main(String[] args) {
        
        //Declaracion e inicialización de variables de tipo String
        String txt1 = "Mi texto";
        String txt2 = "mi texto";
        String txt3 = "       mi texto con espacios      ";

        //Operaciones con Strings
        //1- Hallamos la longitud de una cadena String .length()
        System.out.println("La longitud de txt1 es :"+txt1.length());

        //2- Hallamos el elemento de un indice en particular 1 .charAt()
        System.out.println("La letra del indice 1 en txt1 es:"+txt1.charAt(1));

        //3- Comparo dos Strings txt1 con txt2
        System.out.println("El resultado de la comparacion es: "+txt1.compareTo(txt2));

        //4- Comparo dos String y el resultado es un booleano
        System.out.println("El resultado booleano de la operacion es: "+txt1.equals(txt2));

        //5- Comparo dos Strings abstrayendonos de las May y min
        System.out.println("El resultado es: "+txt1.equalsIgnoreCase(txt2)); 

        //6- Está vacía?
        System.out.println("está vacía txt3? "+ txt3.isEmpty());

        //7- Volver todo a mayúsculas es .toUpperCase()
        System.out.println("Vuelvo a mayúsculas txt2 "+ txt2.toUpperCase()); 

        //8- minusculas .toLowerCase()

        //9- Para cortar espacios en blanco .trim()






    }
    

    

}