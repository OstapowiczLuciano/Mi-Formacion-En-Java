public class MiSwitch {
    public static void main(String[] args) {
        //Declaracion de variables
        int op;

        //Inicializacion
        op = 1;

        //Estructura de switch
        // 1- Un saludo 2-Una despedida 3-Un abrazo
        switch (op) {
            case 1:
                System.out.println("Hola como estás!");
                break;
            case 2:
                System.out.println("Hasta luego!");
                break;
            case 3:
                System.out.println("Un gran abrazo!");
                break;
            default:
                System.out.println("La opcion elegida es incorrecta");
                break;
        }

        //Instruccion de salida
        System.out.println("** El programa ha finalizado **");
    }
}
