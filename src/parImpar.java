import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número: ");
        Float numero = sc.nextFloat();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("El número " + numero + " es impar");
        }

        sc.close();
    }
    
}