
import java.util.Scanner;

public class distanciaVehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la  velocidad de el vehículo más veloz: ");
        Double v1 = sc.nextDouble();

        System.out.println("Ingrese la  velocidad de el otro vehículo: ");
        Double v2 = sc.nextDouble();

        System.out.println("Ingrese la  distancia entre los dos vehiculos: ");
        Double d = sc.nextDouble();

        double tiempoAlcance = d/(v1-v2);

        System.out.println("El tiempo que va a tardar el vehículo más veloz en alcanzar al otro es de: " + tiempoAlcance + " minutos");
        
        sc.close();
    }
    
} 


