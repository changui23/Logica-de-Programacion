
import java.util.Scanner;

public class CiclosAnidados {
    public static void main(String[] args) {
        String[] sabores = new String[3]; 
        sabores[0] = "fresa";
        sabores[1] = "limon";
        sabores[2] = "coco";

        int[] precio = new int[3];
        precio[0] = 15;
        precio[1] = 12;
        precio[2] = 18;

        int[] vendidos = new int[3];

        int[] totalVendidosDia = new int[2];

        int[] totalDineroDia = new int[2];

        for (int dia = 0; dia < 2; dia++) {
            System.out.println("Dia " + (dia+1));
            for (int i = 0; i < 3; i++) {
                System.out.println("Cuantas paletas de " + sabores[i] + " se vendieron?");
                vendidos[i] = Integer.parseInt(new Scanner(System.in).nextLine());
                totalVendidosDia[dia] += vendidos[i];
                totalDineroDia[dia] += vendidos[i] * precio[i];
            }
        }

        System.out.println("Total de paletas vendidas el dia 1: " + totalVendidosDia[0]);
        System.out.println("Total de dinero recaudado el dia 1: " + totalDineroDia[0]);

        System.out.println("Total de paletas vendidas el dia 2: " + totalVendidosDia[1]);
        System.out.println("Total de dinero recaudado el dia 2: " + totalDineroDia[1]);
    }
}