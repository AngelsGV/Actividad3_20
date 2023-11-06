//Dinero disponible en cada lugar.
import java.util.Scanner;
//Vamos a introducir variables, por lo que necesitamos esta libreria
public class Actividad3_20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinero= 0; //No tiene porque tener una cantidad entera.
        double suma = 0;
        while (dinero >= 0) {
            System.out.println("¿Cuanto dinero tienes?");
            dinero = sc.nextDouble();
            suma = suma + dinero;

            if (dinero == 0) {
                break;  // Si el usuario ingresa 0, salimos del bucle
            }
        }
        System.out.println("El dinero total es: " + suma + "€");
    }
}
