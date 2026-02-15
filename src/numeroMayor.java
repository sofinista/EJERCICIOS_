import java.util.Scanner;

public class numeroMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese el primer número: ");
        int n1 = sc.nextInt();


        System.out.println("Ingrese el segundo número: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("El número mayor es: " + n1);
        } else {
            System.out.println("El número mayor es: " + n2);
        }
        sc.close();


    }
}