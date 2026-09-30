public class IMC {
    public static void main(String[] args) {

        double peso;
        double altura;
        String gordura;
        String otraPersona = "si";

        while (otraPersona.equals("si")) {

        peso = Double.parseDouble(IO.readln("Ingresa el peso: "));
        altura = Double.parseDouble(IO.readln("Ingresa la altura: "));

        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            gordura = "Bajo peso";
        } else if (imc >= 18.5 && imc < 25) {
            gordura = "Normal";
        } else if (imc >= 25 && imc < 30) {
            gordura = "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            gordura = "Obesidad grado I";
        } else if (imc >= 35 && imc < 40) {
            gordura = "Obesidad grado II";
        } else {
            gordura = "Obesidad grado III";
        }

        switch (gordura) {
            case "Bajo peso":
                System.out.println("Tu IMC es: " + imc + " y tu estado es: " + gordura 
                + ". Se recomienda: Mejorar la alimentación, aumentar el consumo de alimentos nutritivos y consultar a un profesional de salud para identificar posibles causas.");
                break;
            case "Normal":
                System.out.println("Tu IMC es: " + imc + " y tu estado es: " + gordura
                + ". Se recomienda: Mantener una alimentación equilibrada, realizar actividad física regularmente y conservar hábitos saludables.");
                break;
            case "Sobrepeso":
                System.out.println("Tu IMC es: " + imc + " y tu estado es: " + gordura
                + ". Se recomienda: Mejorar alimentación, aumentar actividad física y controlar el peso periódicamente.");
                break;
            case "Obesidad grado I":
                System.out.println("Tu IMC es: " + imc + " y tu estado es: " + gordura
                + ". Se recomienda: Establecer un plan de alimentación y ejercicio, buscar orientación de un profesional de salud y vigilar factores como glucosa y presión arterial.");
                break;
            case "Obesidad grado II":
                System.out.println("Tu IMC es: " + imc + " y tu estado es: " + gordura 
                + ". Se recomienda: Realizar seguimiento médico regular, implementar cambios de alimentación y actividad física y considerar tratamiento especializado según el estado de salud.");
                break;
            case "Obesidad grado III":
                System.out.println("Tu IMC es: " + imc + " y tu estado es: " + gordura 
                + ". Se recomienda: Buscar valoración médica integral y un tratamiento especializado que incluya alimentación, actividad física y, cuando corresponda, otras opciones de tratamiento.");
                break;
        }

        IO.println("¿Deseas calcular el IMC de otra persona? (si/no)");
        otraPersona = IO.readln();
        }
    }
}
