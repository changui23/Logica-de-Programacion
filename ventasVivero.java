import java.util.Scanner;

public class ventasVivero {
    public static void main(String[] args) {
        double[][] ventas = new double[6][5];
        double[] precios = { 45.5, 35.5, 60.0, 80.0, 95.0 };
        String[] productos = { "Cactus", "Suculenta", "Maceta", "Tierra", "Fertilizante" };
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("\nVentas del dia " + (i + 1) + ":");
            for (int j = 0; j < precios.length; j++) {
                System.out.println("" + productos[j] + ": \t\t$" + precios[j] + "\tIngrese la cantidad vendida: ");
                ventas[i][j] = Double.parseDouble(scanner.nextLine()) * precios[j];
            }
        }

        System.out.println("\nResumen de ventas:");
        for (int i = 0; i < 6; i++) {
            double totalDia = 0;
            System.out.println("\nDia " + (i+1) + ":");
            for (int j = 0; j < precios.length; j++) {
                System.out.println(productos[j] + ": \t\t$" + ventas[i][j]);
                totalDia += ventas[i][j];
            }
            System.out.println("Total del dia " + (i+1) + ": \t$" + totalDia);
        }
    }
}