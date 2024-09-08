
package ejercicios;
import java.util.Scanner;
public class LetraONumero {
    public static String evaluar(char caracter) {
        // Obtener el valor ASCII del carácter
        int ascii = (int) caracter;
        
        // Verificar si el carácter es una letra mayúscula (A-Z)
        if (ascii >= 65 && ascii <= 90) {
            return "Es letra mayúscula";
        }
        // Verificar si el carácter es una letra minúscula (a-z)
        else if (ascii >= 97 && ascii <= 122) {
            return "Es letra minúscula";
        }
        // Verificar si el carácter es un dígito (0-9)
        else if (ascii >= 48 && ascii <= 57) {
            return "Es úmero";
        }
        // Si no es letra ni número
        else {
            return "No es letra ni número";
        }
    }
    
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
