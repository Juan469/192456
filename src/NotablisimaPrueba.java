import java.util.Scanner;
public class NotablisimaPrueba {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        int estudiantesAprobados = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("ingrese las notas" + i + ":");

            System.out.println(" ingrese la nota 1");
            float nota1 = Leer.nextFloat();

            System.out.println("ingrese la nota 2");
            float nota2 = Leer.nextFloat();

            System.out.println("ingrese nota 3");
            float nota3 = Leer.nextFloat();

            float promedio = (nota1 + nota2 + nota3 )/3;
            System.out.printf(" el promedio es :"  + promedio);

            if (promedio>=3.0) {
                System.out.println(" Aprobado");
                estudiantesAprobados ++;
                
            }else{
                System.out.println(" Reprobado ");

            }



        }

        System.out.println("total de estudiantes aprobados" + estudiantesAprobados);

        Leer.close();

        
    }
    
}
