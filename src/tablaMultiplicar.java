import javax.swing.JOptionPane;
public class tablaMultiplicar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: "));

        for (int i = 1; i <= 10; i++) {
            int tabla  = numero * i;
            JOptionPane.showMessageDialog(null, numero + " * " + i + " = " + tabla + "\n");
        }

    }
}
