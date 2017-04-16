import java.util.Scanner;

public class Main {

    private static double suma;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double nota1= null;
        Double nota2= null;
        Double nota3= null;
        Double nota4= null;
        Double nota5= null;
        Double nota6= null;
        Double nota7= null;
        Double nota8= null;
        Double nota9= null;
        Double nota10= null;
        Double promedio;
        System.out.println("Nota de alumno N° 1 : ");
        nota1 = scanner.nextDouble();
        System.out.println("Nota de alumno N° 2 : ");
        nota2 = scanner.nextDouble();
        System.out.println("Nota de alumno N° 3 : ");
        nota3 = scanner.nextDouble();
        System.out.println("Nota de alumno N° 4 : ");
        nota4 = scanner.nextDouble();
        System.out.println("Nota de alumno N° 5 : ");
        nota5 = scanner.nextDouble();
        System.out.println("Nota de alumno N° 6 : ");
        nota6 = scanner.nextDouble();
        System.out.println("Nota de alumno N° 7 : ");
        nota7 = scanner.nextDouble();
        System.out.println("Nota de alumno N° 8 : ");
        nota8 = scanner.nextDouble();
        System.out.println("Nota de alumno N° 9 : ");
        nota9 = scanner.nextDouble();
        System.out.println("Nota de alumno N° 10 : ");
        nota10 = scanner.nextDouble();

        suma = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8 + nota9 + nota10);
        promedio = (suma / 10) ;

        System.out.println("El promedio del curso es :" + promedio);
        //le salio guachooooooooooooooooo


    }
}
