import javax.swing.JOptionPane;

public class mayorMenor {
    public static void main(String[] args) {

        int numero1 = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el primer número: "));
        int numero2 = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el segundo número: "));
        int numero3 = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el tercer número: "));

        if (numero1 >= numero2 && numero1 >= numero3) {

            if (numero2 >= numero3) {
                JOptionPane.showMessageDialog(null,
                        "ORDEN: " + numero1 + " " + numero2 + " " + numero3);
            } else {
                JOptionPane.showMessageDialog(null,
                        "ORDEN: " + numero1 + " " + numero3 + " " + numero2);
            }

        } else if (numero2 >= numero1 && numero2 >= numero3) {

            if (numero1 >= numero3) {
                JOptionPane.showMessageDialog(null,
                        "ORDEN: " + numero2 + " " + numero1 + " " + numero3);
            } else {
                JOptionPane.showMessageDialog(null,
                        "ORDEN: " + numero2 + " " + numero3 + " " + numero1);
            }

        } else {

            if (numero1 >= numero2) {
                JOptionPane.showMessageDialog(null,
                        "ORDEN: " + numero3 + " " + numero1 + " " + numero2);
            } else {
                JOptionPane.showMessageDialog(null,
                        "ORDEN: " + numero3 + " " + numero2 + " " + numero1);
            }
        }
    }
}

