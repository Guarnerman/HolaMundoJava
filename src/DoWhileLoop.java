import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Selecciona el men´u de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0.Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response == 0) {
                System.out.println("Gracias por visitarnos");
            } else if (response == 1) {
                System.out.println("Movies");
            } else if (response == 2) {
                System.out.println("Series");
            } else {
                System.out.println("Selecciona la opción correcta");
            }
        } while (response != 0);

        System.out.println("Fin del programa.");
    }
}
