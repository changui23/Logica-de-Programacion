import java.util.Scanner;

public class entradaDatos {

    public static void main(String[] args) {

        //Ingresar datos por consola
        //opcion declarar nuevo objeto tipo scanner
        Scanner scan = new Scanner(System.in);

        //Escribir por consola
        System.out.println("Escribe tu nombre: ");
        //Leer por consola
        String nombre1 = scan.nextLine();

        //Escribir por consola. Mensaje + variable
        System.out.println("Tu nombre es: " + nombre1);
        //Desechar el objeto scanner

        scan.close();

        //opcion 2
        IO.println("Hola, buen dia! ");
        String nombre2 = IO.readln("Escribe tu nombre: ");
        IO.println("Tu nombre es: " + nombre2);

        scan.close();

    }
}
