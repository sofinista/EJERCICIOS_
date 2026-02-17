import javax.swing.JOptionPane;
public class viajeEscuela {
    public static void main(String[] args) {
        Double alumnos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos: "));

        if (alumnos >= 100) {
            JOptionPane.showMessageDialog(null, "Cada alumno debe pagar 65 euros");
        } else if (alumnos >= 50 && alumnos <=99 ){
            JOptionPane.showMessageDialog(null, "Cada alumno debe pagar 70 euros");
        } else if (alumnos >= 30 && alumnos <=49) {
            JOptionPane.showMessageDialog(null, "Cada alumno debe pagar 95 euros");
        } else if (alumnos < 30) {
            JOptionPane.showMessageDialog(null, "Cada alumno debe pagar " + (4000/alumnos) + " euros");
        }
    }
}
