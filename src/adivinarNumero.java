import java.util.Random;
import java.util.Scanner;

public class adivinarNumero {
    public static void main(String[] args) {

        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1; 

        Scanner sc = new Scanner(System.in);

        int intentos = 0;

        while (intentos < 10) {

            System.out.println("Ingrese el número que cree correcto: ");
            int numero = sc.nextInt();

            intentos++;

            if (numero == numeroSecreto) {
                System.out.println("¡Correcto!");
                System.out.println("Lo acertaste en " + intentos + " intentos.");
                break; 
            } 
            else if (numero < numeroSecreto) {
                System.out.println("El número es MAYOR.");
            } 
            else {
                System.out.println("El número es MENOR.");
            }

            System.out.println("Intentos restantes: " + (10 - intentos));
        }

        if (intentos == 10) {
            System.out.println("Perdiste.");
            System.out.println("El número era: " + numeroSecreto);
        }

        sc.close();
    }
}
