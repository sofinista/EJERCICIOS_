import javax.swing.JOptionPane;

public class compañiaTelefonica {
    public static void main(String[] args) {

        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de minutos de la llamada: "));
        String dia = JOptionPane.showInputDialog("Ingrese el día que realizó la llamada: ").toLowerCase();
        String turno = JOptionPane.showInputDialog("Ingrese el turno (mañana o tarde): ").toLowerCase();

        double subtotal = 0;

        
        if (minutos <= 5) {
            subtotal = minutos * 1.0;
        } else if (minutos <= 8) {
            subtotal = (5 * 1.0) + ((minutos - 5) * 0.80);
        } else if (minutos <= 10) {
            subtotal = (5 * 1.0) + (3 * 0.80) + ((minutos - 8) * 0.70);
        } else {
            subtotal = (5 * 1.0) + (3 * 0.80) + (2 * 0.70) + ((minutos - 10) * 0.50);
        }

        double impuesto = 0;

        
        if (dia == "domingo") {
            impuesto = subtotal * 0.03;
        } else {
            if (turno.equals("mañana")) {
                impuesto = subtotal * 0.15;
            } else if (turno.equals("tarde")) {
                impuesto = subtotal * 0.10;
            }
        }

        double total = subtotal + impuesto;

        JOptionPane.showMessageDialog(null, "Costo sin impuesto: " + subtotal + "\nImpuesto: " + impuesto +"\nTotal a pagar: " + total);
    }
}

