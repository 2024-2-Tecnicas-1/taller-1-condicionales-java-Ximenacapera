
package ejercicios;


import java.util.Scanner;


public class IMC {

     public static String evaluar(int peso, double estatura, int edad) {

        double imc = peso / (estatura * estatura);
        
        // Determinar la condición de riesgo
        if (edad > 45) {
            if (imc < 22.0) {
                return "Bajo peso";
            } else {
                return "Medio";
            }
        } else {
            if (imc < 22.0) {
                return "Medio";
            } else {
                return "Alto peso";
            }
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();
        
        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}
