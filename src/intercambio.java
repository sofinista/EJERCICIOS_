import javax.swing.JOptionPane;
public class intercambio {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Ingrese el valor a: ");
        String b = JOptionPane.showInputDialog("Ingrese el valor b: ");
        String temp;

        temp = a;
        a = b;
        b = temp;

        JOptionPane.showMessageDialog(null, "Intercambio de a= " + a + "\nIntecambio de b= " + b);


    }
}