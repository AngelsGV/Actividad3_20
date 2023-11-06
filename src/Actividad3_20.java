//Dinero disponible en cada lugar.
import java.util.Scanner;
//Vamos a introducir variables, por lo que necesitamos esta libreria
public class Actividad3_20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinero; //No tiene porque tener una cantidad entera.
        double dineroBanco, dineroBolsillos, dineroCajon, dineroCF, suma;
        do {
            System.out.println("¿Cuanto dinero tienes en el banco?");
            dineroBanco = sc.nextDouble();
            System.out.println("¿Cuanto dinero tienes en los bolsillos?");
            dineroBolsillos = sc.nextDouble();
            System.out.println("¿Cuanto dinero tienes en el cajón?");
            dineroCajon = sc.nextDouble();
            System.out.println("¿Cuanto dinero tienes en la caja fuerte?");
            dineroCF = sc.nextDouble();

            suma = dineroBanco + dineroBolsillos + dineroCajon + dineroCF;

        } while ( dineroBanco != 0 && dineroBolsillos != 0 && dineroCajon != 0 && dineroCF != 0);
//La especificación para cerrar el bucle
            System.out.println("El dinero total es: " + suma);

    }
}
