import javax.swing.JOptionPane;
public class meses {
    public static void main(String[] args) {
        String meses = JOptionPane.showInputDialog("Ingrese el mes");

        switch (meses) {
            case "Enero":
                JOptionPane.showMessageDialog(null, "Enero tiene 31 días");
                break;
            case "Febrero":
                JOptionPane.showMessageDialog(null, "Febrero tiene 28 días");
                break;
            case "Marzo":
                JOptionPane.showMessageDialog(null, "Marzo tiene 31 días");
                break;
            case "Abril":
                JOptionPane.showMessageDialog(null, "Abril tiene 30 días");
                break;
            case "Mayo":
                JOptionPane.showMessageDialog(null, "Mayo tiene 31 días");
                break;
            case "Junio":
                JOptionPane.showMessageDialog(null, "Junio tiene 30 días");
                break;
            case "Julio":
                JOptionPane.showMessageDialog(null, "Julio tiene 31 días");
                break;
            case "Agosto":
                JOptionPane.showMessageDialog(null, "Agosto tiene 31 días");
                break;
            case "Septiembre":
                JOptionPane.showMessageDialog(null, "Septiembre tiene 30 días");
                break;
            case "Octubre":
                JOptionPane.showMessageDialog(null, "Octubre tiene 31 días");
                break;
            case "Noviembre":
                JOptionPane.showMessageDialog(null, "Noviembre tiene 30 días");
                break;
            case "Diciembre":
                JOptionPane.showMessageDialog(null, "Diciembre tiene 31 días");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ese no es un mes válido");
                break;
        }
    }
}
