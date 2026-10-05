public class EjercicioExamen {
    public static void main(String[] args) {
        double porcentajeBono = 0.15;
        double porcentajeSancion = 0.10;
        int horasMinimas = 40;
        int diasRequeridos = 6;

        double horas, sueldoBruto, sueldoNeto, bono, sancion;
        int dia, diasTotales;

        dia = 0;
        diasTotales = 0;
        horas = 0;

        String nombre = IO.readln("Escribe tu nombre: ");
        double pago = Double.parseDouble(IO.readln("Ingresa el pago por hora: "));

        while (dia < diasRequeridos) {
            dia++;

            double horasDia = Double.parseDouble(
                IO.readln("Ingresa las horas del dia " + dia + ": ")
            );

            horas += horasDia;

            if (horasDia > 0) {
                diasTotales++;
            }
        }

        sueldoBruto = horas * pago;

        bono = 0;
        sancion = 0;

        if (diasTotales == diasRequeridos) {
            if (horas > horasMinimas) {
                bono = sueldoBruto * porcentajeBono;
            }
        } else {
            sancion = sueldoBruto * porcentajeSancion;
        }

        sueldoNeto = sueldoBruto - sancion + bono;

        IO.println("Tu nombre es: " + nombre);
        IO.println("La cantidad de horas trabajadas fue: " + horas);
        IO.println("El sueldo bruto es de: " + sueldoBruto);

        if (bono > 0) {
            IO.println("Felicidades recibiste un bono!");
            IO.println("El bono fue de: " + bono);
        }

        if (sancion > 0) {
            IO.println("Recibiste una sancion!");
            IO.println("La sancion fue de: " + sancion);
        }

        IO.println("El sueldo neto es de: " + sueldoNeto);
    }
}