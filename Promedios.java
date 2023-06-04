/*Desafio 1 de clase- hallamos promedio de notas cargadas en un array*/

public class Promedios {
    public static void main(String[] args) {
    
        // Declaracion inst. e inicializacion o carga del array
        double[] notas = {8,3,6,7,4,2,9,10,5,7};
        
        // Declaracion de las variables e inicializacion
        double suma = 0; // suma es un acumulador
        double promedio = 0;
        
        // Planteo del for-each
        for (double nota : notas ) {
            suma += nota;   //suma = suma + nota;    
        }
        
        // Procesos
        promedio = suma / notas.length;
        
        // Instruccion de salida, resultados
        System.out.println("El promedio total es: "+promedio);
        
    
    }  
    
}