import java.util.Scanner;

public class MuyMalHecho {
    public static void main(String[] args) throws Exception {
        Scanner Leer = new Scanner(System.in);
        byte contador = 0;

        System.out.println("Número de usuarios a ingresar:");
        int numero = Leer.nextInt();
        Leer.nextLine();

        int edad1 = 0, edad2 = 0, edad3 = 0;
        String numero1 = "", numero2 = "", numero3 = "";

        while (contador < numero) {
            System.out.println("Nombre del usuario:");
            String u = Leer.nextLine();

            System.out.println("Edad del usuario:");
            int A = Leer.nextInt();
            Leer.nextLine();

            if (contador == 0) {
                numero1 = u;
                edad1 = A;
            } else if (contador== 1) {
                numero2 = u;
                edad2 = A;
            } else if (contador== 2) {
                numero3 = u;
                edad3 = A ;
            }

            if (A >= 18) {
                System.out.println(u + " es mayor de edad.");
            } else {
                System.out.println(u+ " es menor de edad.");
            }

            if (A > 120 || A < 1) {
                System.out.println("Edad no válida.");
            }

        }

        System.out.println("Resumen:");
        System.out.println("Usuario 1: " + numero1 + " - Edad: " + edad1);
        System.out.println("Usuario 2: " + numero2 + " - Edad: " + edad2);
        System.out.println("Usuario 3: " + numero3 + " - Edad: " + edad3);

    Leer.close();
    }
    
}
