import javax.swing.JOptionPane;
public class sueldo {
    public static void main(String[] args) {
        String sueldo = JOptionPane.showInputDialog("Ingrese su sueldo base: ");
        String venta1 = JOptionPane.showInputDialog("Ingrese su primer venta del mes: ");
        String venta2 = JOptionPane.showInputDialog("Ingrese su segunda venta del mes: ");
        String venta3 = JOptionPane.showInputDialog("Ingrese su tercer venta del mes: ");

        Double comisiones = ((Double.parseDouble(venta1) + Double.parseDouble(venta2) + Double.parseDouble(venta3))*0.10);
        JOptionPane.showMessageDialog(null, "El total de las comisiones es: " + comisiones + " Su sueldo total es: " + ((comisiones) + (Double.parseDouble(sueldo))) );
    }
}
