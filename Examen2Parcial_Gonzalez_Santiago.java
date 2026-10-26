
import java.util.ArrayList;
import java.util.Scanner;

public class Examen2Parcial_Gonzalez_Santiago {

    public static void main(String[] args) {

        String[] productos = { "Chocolate", "Paleta", "Gomitas", "Galletas" };
        int[] precios = { 18, 12, 25, 15 };
        int[] cantidadVendida = {0, 0, 0, 0};

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList <Integer> totalCliente = new ArrayList<>();

        int numeroDeClientes = 0;
        int codigo;
        int cantidad;
        int precio = 0;
        int total = 0;
        double promedio;

        String otroProducto;
        String otroCliente = "si";

        Scanner consola = new Scanner(System.in);

        do {

            int totalCompra = 0;
            numeroDeClientes++;
            System.out.println("\nIngresa el cliente " + numeroDeClientes);
            nombres.add(consola.nextLine());

        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " $" + precios[i]);
        }

            do {

                do {
                    System.out.println("Ingresa el codigo del producto (1-4)");
                    codigo = Integer.parseInt(consola.nextLine());
                } while (codigo < 1 || codigo > 4);

                do {
                    System.out.println("Ingresa la cantidad que desea comprar");
                    cantidad = Integer.parseInt(consola.nextLine());
                } while (cantidad <= 0);

                switch (codigo) {
                    case 1:
                        precio = precios[0];
                        cantidadVendida[0] += cantidad;
                        break;

                    case 2:
                        precio = precios[1];
                        cantidadVendida[1] += cantidad;
                        break;

                    case 3:
                        precio = precios[2];
                        cantidadVendida[2] += cantidad;
                        break;

                    case 4:
                        precio = precios[3];
                        cantidadVendida[3] += cantidad;
                        break;
                }
            
                totalCompra += precio * cantidad;

                System.out.println("Quiere otro producto? (si/no)");
                otroProducto = consola.nextLine();

            } while (otroProducto.equalsIgnoreCase("si"));

            totalCliente.add(totalCompra);

            System.out.println("\nOtro cliente? (si/no)");
            otroCliente = consola.nextLine();

        } while (otroCliente.equalsIgnoreCase("si"));

        for (int i = 0; i < productos.length; i++) {
            System.out.println("\nProducto: " + productos[i]);
            System.out.println("Precio: " + precios[i]);
            System.out.println("Cantidad: " + cantidadVendida[i]);
            System.out.println("Importe bruto: $" + (cantidadVendida[i] * precios[i]));
        }


        System.out.println("\nCantidad de clientes atendidos: " + numeroDeClientes);
        System.out.println("\nClientes: ");
        for (int i = 0; i < numeroDeClientes; i++) {
            System.out.println(nombres.get(i));
        }
        for (int i = 0; i < productos.length; i++) {
            System.out.println("\nSe vendieron " + cantidadVendida[i] + " " + productos[i]);
        }

        for (int i = 0; i < totalCliente.size(); i++) {
            total += totalCliente.get(i);
        }

        System.out.println("\nTotal de dinero: " + total);

        promedio = (double) total / numeroDeClientes;
        System.out.println("\nPromedio de venta: " + promedio);
    }
}
