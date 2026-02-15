import javax.swing.JOptionPane;
import java.util.Scanner;

public class usuarioContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario = JOptionPane.showInputDialog("Registre su usuario: ");
        String contraseña = JOptionPane.showInputDialog("Registre su contraseña: ");

        System.out.println("Ingrese su usuario: ");
        String intentoU = sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String intentoC = sc.nextLine();

        if ((usuario == intentoU) && (contraseña == intentoC)){
            System.out.println("Has entrado al sistema");
        } else {
            System.out.println("ERROR");
        }

        sc.close();

    }
}