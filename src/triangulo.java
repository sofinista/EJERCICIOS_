import javax.swing.JOptionPane;

public class triangulo {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Ingrese el lado a");
        String b = JOptionPane.showInputDialog("Ingrese el lado b");

        JOptionPane.showMessageDialog(null, "Hola, la hipotenusa es; " + (Math.pow(((Math.pow((Float.parseFloat(a)), 2)) + (Math.pow((Float.parseFloat(b)), 2))), 0.5)));

    }
}