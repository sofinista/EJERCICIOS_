import java.util.Scanner;

public class mediaNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        int i = 0;

        System.out.println("Ingrese números (0 para terminar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            suma = suma+ numero;
            i++;

            numero = sc.nextInt();
        }

        if (i > 0) {
            double media = (double) suma / i;
            System.out.println("Suma: " + suma);
            System.out.println("Media: " + media);
        } else {
            System.out.println("No se ingresaron números.");
        }

        sc.close();
    }
}
