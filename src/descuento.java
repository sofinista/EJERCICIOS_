import javax.swing.JOptionPane;
public class descuento {
    public static void main(String[] args) {
        String compra = JOptionPane.showInputDialog("Ingrese el valor de su compra: ");
        Double descuento = ((Double.parseDouble((compra))*0.15));
        Double compraFinal =((Double.parseDouble(compra)) - descuento);
        JOptionPane.showMessageDialog(null, "El valor de el descuento es: " + descuento + "\nEl valor total de la compra es: " + compraFinal);
    }
}
