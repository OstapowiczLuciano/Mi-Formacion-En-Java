//Zona de importacion 
import java.util.*;

/*
* Para este ejercicio vamos a crear una función que es un sistema de validación de un usuario
* que recibe un usuario y una contraseña y según sean válidos o no, muestra un mensaje al usuario.
* Encapsulamos dentro de las funciones los objetos Scanner y las instrucciones System.out.print
* */

public class Validacion {
    // Zona de declaracion de los métodos
    // Realizamos un metodo procedimiento para imprimir. Es un método porque tiene void y no contiene return.
    public static void imprimir(String txt){
        System.out.println(txt);    
    }

    // Realizamos un metodo función para capturar datos por teclado. Es un MF porque tiene un tipo y contiene return.
    public static String leer(){
        // Declaracion e instanciación del objeto sc
        Scanner miTeclado = new Scanner(System.in);
        // Declaracion e inicializacion de una variables
        String dato = miTeclado.nextLine();
        //Valor de retorno
        return dato;
    }

    // Metodo (procedimiento) para validar un usuario con contraseña
    public static void verificar(String usuarioRegistro, String claveRegistro){
        //Acceso al sistema, pedimos nuevamente usuario y clave
        imprimir("** Ingreso al Sistema **");
        imprimir("Ingrese su usuario registrado en el sistema");
        String usuario = leer();
        imprimir("Ingrese su clave de validación");
        String clave = leer();

        //Validación del usuario y clave
        if (usuario.equals(usuarioRegistro) && clave.equals(claveRegistro)) {
            imprimir("Hola "+usuario+" tu ingreso fue exitoso");
            return;
        }
        // este return en particular está actuando como un break. No no devuelve nada.
        imprimir("Lo siento no pudimos validar tus datos, intentalo nuevamente");
    }

    // Método para registro de usuario, este método anida al método verifica
    public static void registro(){
        imprimir("Bienvenido/a al registro de usuario");
        imprimir("Ingrese su usuario para registrarse");
        String usuarioRegistro = leer();
        imprimir("Ingrese su clave para registrarse");
        String claveRegistro = leer();

        verificar(usuarioRegistro, claveRegistro);
    }


    public static void main(String[] args) {
    
        // El main resultará mas limpio aún
        registro();

    }
}