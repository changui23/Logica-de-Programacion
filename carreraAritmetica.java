import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class carreraAritmetica {
    public static void main(String[] args) {

        double[] numerosAleatorios = { 1, 0, 5, 8, 7 };
        double suma = 0;
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa el dato de entrada: ");
        double datoEntrada = Double.parseDouble(consola.nextLine());

        System.out.println("Ingresa el mes de nacimiento: ");
        int mesNacimiento = Integer.parseInt(consola.nextLine());

        for (int i = 0; i < numerosAleatorios.length; i++) {
            suma += numerosAleatorios[i];
        }

        double promedio = suma / numerosAleatorios.length;
        datoEntrada += promedio;
        System.out.println("Etapa 1: " + datoEntrada);

        datoEntrada += datoEntrada % 7;
        System.out.println("Etapa 2: " + datoEntrada);

        datoEntrada += datoEntrada * 0.12;
        System.out.println("Etapa 3: " + datoEntrada);

        ArrayList<Integer> valoresEnteros = new ArrayList<>();
        String otroNumero = "si";
        while (otroNumero.equals("si")) {
            System.out.println("Ingresa un numero: ");
            valoresEnteros.add(Integer.parseInt(consola.nextLine()));

            System.out.println("Quiere otro numero? ");
            otroNumero = consola.nextLine();
            
        }
        suma = 0;
        for (int i = 0; i < valoresEnteros.size(); i++) {
            suma += valoresEnteros.get(i);
        }
        datoEntrada += suma;
        System.out.println("Etapa 4: " + datoEntrada);

        System.out.println("Ingresa un divisor (1-9): ");
        int divisor = Integer.parseInt(consola.nextLine());
        datoEntrada = datoEntrada/divisor;
        System.out.println("Etapa 5: " + datoEntrada);
        consola.close();

        DecimalFormat par = new DecimalFormat("#");
        String datoEntradaPar = par.format(datoEntrada);

        DecimalFormat non = new DecimalFormat("#.0000");
        String datoEntradaNon = non.format(datoEntrada % 1);

        if (mesNacimiento % 2 == 0) {
            System.out.println(datoEntradaPar);
        } else {
            System.out.println(datoEntradaNon);
        }
    }
}