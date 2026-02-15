import javax.swing.JOptionPane;
public class edad {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
        String edad = JOptionPane.showInputDialog("¿Cúal es tu edad?");
        JOptionPane.showMessageDialog(null, "Hola, " + nombre + " tu edad en 10 años será: " + ( Integer.parseInt(edad) + 10) + "años");

    }
}