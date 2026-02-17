import java.util.Scanner;

public class numerosPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        System.out.println("Números pares entre " + menor + " y " + mayor + ":");

        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

