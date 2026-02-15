import java.util.Scanner;

public class numeroPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número: ");
        Double numero = sc.nextDouble();
        
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo");
        } if (numero < 0) {
            System.out.println("El número " + numero + " es negativo");
        } else {
            System.out.println("El número " + numero + " es 0");
        }

        sc.close();
    }
}