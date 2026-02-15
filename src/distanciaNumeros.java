import javax.swing.JOptionPane;

public class distanciaNumeros {
    public static void main(String[] args) {
        String x1 = JOptionPane.showInputDialog("Ingrese x1: ");
        String x2 = JOptionPane.showInputDialog("Ingrese x2: ");
        String y1 = JOptionPane.showInputDialog("Ingrese y1: ");
        String y2 = JOptionPane.showInputDialog("Ingrese y2: ");

        Double Distancia = Math.pow((Math.pow((Double.parseDouble(x2)) - (Double.parseDouble((x1))), 2)) + (Math.pow((Double.parseDouble(y2)) - (Double.parseDouble((y1))), 2)), 0.5);

        JOptionPane.showMessageDialog(null, "La distancia entre los dos puntos es: " + Distancia);
    }
}