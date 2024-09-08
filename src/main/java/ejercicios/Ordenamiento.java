
package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Ordenamiento {
    public static String evaluar(int numero1, int numero2, int numero3, int numero4) {
       char[] numeros = {
            (char) (numero1 + '0'), // Convertir int a char representando el dígito
            (char) (numero2 + '0'),
            (char) (numero3 + '0'),
            (char) (numero4 + '0')
        };
        
        // Ordenar el array de caracteres
        Arrays.sort(numeros);
        
        // Convertir caracteres de vuelta a números y construir la respuesta
        StringBuilder respuesta = new StringBuilder("Números ordenados de menor a mayor:\n");
        for (char c : numeros) {
            respuesta.append(c - '0').append("\n"); // Convertir char a int
        }
        
        return respuesta.toString();
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1:");
        int numero1 = lector.nextInt();
        System.out.print("Número 2:");
        int numero2 = lector.nextInt();
        System.out.print("Número 3:");
        int numero3 = lector.nextInt();
        System.out.print("Número 4:");
        int numero4 = lector.nextInt();
        
        String respuesta = evaluar(numero1, numero2, numero3, numero4);
        System.out.println(respuesta);
    }
}
