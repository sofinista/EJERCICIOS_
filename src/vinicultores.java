import javax.swing.JOptionPane;
public class vinicultores {
    public static void main(String[] args) {
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de uva: ");
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la uva: "));
        Float precioInicialKilo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor inicial de las uvas por kilo: "));
        Float cantidadKilos = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de kilos del embarque: "));

        if (tipo == "A"  && tamaño == 1) {
            JOptionPane.showMessageDialog(null, "El valor final es: " + ((precioInicialKilo + 0.20)*cantidadKilos));
        } else if (tipo == "A"  && tamaño == 2) {
            JOptionPane.showMessageDialog(null, "El valor final es: " + ((precioInicialKilo + 0.30)*cantidadKilos));
        } else if (tipo == "B"  && tamaño == 1){
            JOptionPane.showMessageDialog(null, "El valor final es: " + ((precioInicialKilo - 0.30)*cantidadKilos));
        } else {
            JOptionPane.showMessageDialog(null, "El valor final es: " + ((precioInicialKilo - 0.50)*cantidadKilos));
        }

    }
}
