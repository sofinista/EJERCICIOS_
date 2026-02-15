import javax.swing.JOptionPane;
public class rectangulo {
    public static void main(String[] args) {
        String base = JOptionPane.showInputDialog("Ingrese el valor de la base: ");
        String altura = JOptionPane.showInputDialog("Ingrese el valor de la altura");
        JOptionPane.showMessageDialog(null, "Hola, el valor de la area es: " + ((Integer.parseInt(base))*(Integer.parseInt(altura))) + " y el valor de la perimetro es: " + ((Integer.parseInt(base) * 2 ) + (Integer.parseInt(altura) * 2)));
    }
}