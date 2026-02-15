import javax.swing.JOptionPane;

public class calificacion {
    public static void main(String[] args) {
        String calificacion1 = JOptionPane.showInputDialog("Ingrese la primer calificación: ");
        String calificacion2 = JOptionPane.showInputDialog("Ingrese la segunda calificación: ");
        String calificacion3 = JOptionPane.showInputDialog("Ingrese la tercer calificación: ");
        String examenFinal = JOptionPane.showInputDialog("Ingrese la calificación del examen final: ");
        String trabajoFinal = JOptionPane.showInputDialog("Ingrese la calificación de el trabajo final: ");
        Double promedio = ((((Double.parseDouble(calificacion1)) + (Double.parseDouble(calificacion2)) + (Double.parseDouble(calificacion3)))/3)*0.55);
        Double examenFin = ((Double.parseDouble(examenFinal))*0.30);
        Double trabajoFin = (Double.parseDouble((trabajoFinal))*0.15);
        Double notaFinal = promedio + examenFin + trabajoFin;


        JOptionPane.showMessageDialog(null, "El 55% vale: " + promedio + "\nEl 30% vale: " + examenFin +  "\nEl 15% vale: " + trabajoFin + "\nEl total de las notas es: " + notaFinal );

    }
}