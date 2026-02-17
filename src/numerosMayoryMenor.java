import javax.swing.JOptionPane;
import java.util.Scanner;
public class numerosMayoryMenor {
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números que quiere ingresar: "));
        int i = 1;
        int mayor = 0;
        int menor = 0;
        int igual = 0; 

        Scanner sc = new Scanner(System.in);
        while (i <= cantidad) {
            System.out.println("Ingrese el número: ");
            int numero = sc.nextInt();
            if (numero > 0) {
                mayor = mayor + 1;
            } else if (numero < 0){
                menor = menor + 1;
            } else if (numero == 0){
                igual = igual + 1;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Mayores: " + mayor + "\nMenores: " + menor + "\nIguales: " + igual);
    }
}
