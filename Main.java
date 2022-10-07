public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;

        if (numeroIf < 0) {
            System.out.println("El numero es negativo");
                }
        else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        }
        else {
            System.out.println("El numero es 0");
        }

        //

        int numeroWhile = 1;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +1;
        }

        //

        int numeroDoWhile = 2;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroWhile - 1;
        } while (numeroDoWhile > 2);

        //

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1) {
            System.out.println(numeroFor);
        }

        //

        var estación = "Otoño";

        switch (estación) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("Esta no es una estación");
        }
    }
}