import javax.swing.JOptionPane;

public class dimensionesTriangulo {
    public static void main(String[] args) {

        double A = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el lado A:"));
        double B = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el lado B:"));
        double C = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el lado C:"));

        double mayor = A;
        double lado1 = B;
        double lado2 = C;

        if (B >= A && B >= C) {
            mayor = B;
            lado1 = A;
            lado2 = C;
        } else if (C >= A && C >= B) {
            mayor = C;
            lado1 = A;
            lado2 = B;
        }

        if (Math.pow(mayor, 2) == Math.pow(lado1, 2) + Math.pow(lado2, 2)) {

            JOptionPane.showMessageDialog(null, "Es un triángulo rectángulo");

        } else if (A == B && B == C) {

            JOptionPane.showMessageDialog(null, "Es un triángulo equilátero");

        } else if (A == B || A == C || B == C) {

            JOptionPane.showMessageDialog(null, "Es un triángulo isósceles");

        } else {

            JOptionPane.showMessageDialog(null, "Es un triángulo escaleno");
        }
    }
}
