import java.util.ArrayList;
import java.util.Scanner;

public class ArregloNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner consola = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa un número entero:");
            int numero = consola.nextInt();
            numeros.add(numero);
        }

        int NumeroMayor = numeros.get(0);
        int NumeroMenor = numeros.get(0);
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > NumeroMayor) {
                NumeroMayor = numeros.get(i);
                posicionMayor = i;
            }
            if (numeros.get(i) < NumeroMenor) {
                NumeroMenor = numeros.get(i);
                posicionMenor = i;
            }
        }

        System.out.println("Número mayor: " + NumeroMayor + " Posicion: " + posicionMayor);
        System.out.println("Numero menor: " + NumeroMenor + " Posicion: " + posicionMenor);
    }
}
