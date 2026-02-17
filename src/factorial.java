import javax.swing.JOptionPane;

public class factorial {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: "));
        int factorial = 1;
        int i = 1;

        while (i <= numero) {
            factorial *= i;
            i++;
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }
}

