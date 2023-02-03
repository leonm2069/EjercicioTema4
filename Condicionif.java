/*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/
package Ejercicios;


public class Condicionif {
    
    public static void main(String[] args) {
        
        int numero = 0;
        
        if (numero > 0){
            System.out.println("El numero es positivo");
        } else if(numero < 0) {
             System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es 0");
        }
         
    }
    
}
