import javax.swing.JOptionPane;

public class media {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Ingrese el primer número: ");
        String numero2 = JOptionPane.showInputDialog("Ingrese el segundo número: ");
        String numero3 = JOptionPane.showInputDialog("Ingrese el tercer número: ");

        JOptionPane.showMessageDialog(null, "La media de los tres números es: " + (((Float.parseFloat(numero1)) + (Float.parseFloat(numero2)) + (Float.parseFloat(numero3))) /3));
    }
}