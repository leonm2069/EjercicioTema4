/*
Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. 
También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */
package Ejercicios;

public class Switch {
    
    public static void main(String[] args) {
        
        var Estacion = "Invierno";
        
        switch (Estacion) {
        case "Verano":{
            System.out.println("Es verano");
            break;
    }  
        case "Otonio":{
            System.out.println("Es otonio");
            break;
    }
            
        case "Invierno": {
            System.out.println("Es invierno");
            break;
    }
        case "Primavera": {
            System.out.println("Es primavera");
            break;
    }
        default:{
            System.out.println("No es una estacion");
          
        }
     }
  }
    
}
