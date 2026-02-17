import javax.swing.JOptionPane;
public class diaSemana {
    public static void main(String[] args) {
      int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de el día: "));
      
      switch (dia) {
        case 1:
            JOptionPane.showMessageDialog(null, "lunes");
            break;
        case 2:
            JOptionPane.showMessageDialog(null, "martes");
            break;
        case 3:
            JOptionPane.showMessageDialog(null, "miercoles");
            break;
        case 4:
            JOptionPane.showMessageDialog(null, "jueves");
            break;
        case 5:
            JOptionPane.showMessageDialog(null, "viernes");
            break;
        case 6:
            JOptionPane.showMessageDialog(null, "sabado");
            break;
        case 7:
            JOptionPane.showMessageDialog(null, "domingo");
            break;
      
        default:
            JOptionPane.showMessageDialog(null, "ERROR");
            break;
      }
    }
    
}
