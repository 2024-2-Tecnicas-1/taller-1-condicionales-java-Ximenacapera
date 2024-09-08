
package ejercicios;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Clase para calcular la edad del usuario basado en la fecha de nacimiento.
 */
public class Edad {
    
    public static String evaluar(int dia, int mes, int anno) {
        // Obtener la fecha actual
        LocalDate today = LocalDate.now();
        
        // Crear la fecha de nacimiento
        LocalDate birthDate = LocalDate.of(anno, mes, dia);
        
        // Calcular la edad
        int edad = today.getYear() - birthDate.getYear();
        
        // Ajustar la edad si el cumpleaños no ha ocurrido aún este año
        if (today.getMonthValue() < birthDate.getMonthValue() || 
           (today.getMonthValue() == birthDate.getMonthValue() && today.getDayOfMonth() < birthDate.getDayOfMonth())) {
            edad--;
        }
        
        // Crear una respuesta
        return "Usted tiene " + edad + " años.";
    }
    
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
