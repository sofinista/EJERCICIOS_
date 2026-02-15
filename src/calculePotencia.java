 import javax.swing.JOptionPane;
public class calculePotencia {
    public static void main(String[] args) {
        Double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: "));
        int exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente: "));

        if (exponente > 0) {
            JOptionPane.showMessageDialog(null, "El resultado es: " + Math.pow(base, exponente));
        } else if (exponente == 0) {
            JOptionPane.showMessageDialog(null, "El resultado es: 1");
        } else {
            int expPositivo = -exponente;
            double resultado = Math.pow(base, expPositivo);
            JOptionPane.showMessageDialog(null, "El resultado es: 1/" + resultado);
        }
    }
}

