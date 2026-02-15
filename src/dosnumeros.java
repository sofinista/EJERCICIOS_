import javax.swing.JOptionPane;

public class dosnumeros {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Ingrese el primer número: ");
        String numero2 = JOptionPane.showInputDialog("Ingrese el segundo número: ");
        
        JOptionPane.showMessageDialog(null, "La suma de los dos números es: " + ((Float.parseFloat(numero1)) + (Float.parseFloat(numero2))) + 
        "\nLa resta de los dos números es: "+ ((Float.parseFloat(numero1)) - (Float.parseFloat(numero2))) + 
        "\nLa multiplicación de los dos números es: " + ((Float.parseFloat(numero1)) * (Float.parseFloat(numero2))) + 
        "\nLa división de los dos números es: " + ((Float.parseFloat(numero1)) / (Float.parseFloat(numero2))));
    }
}