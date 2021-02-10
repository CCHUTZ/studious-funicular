public class Harmonico {

    public static void main(String[] args) { 

        // argumento de la linea de comando
        int n = Integer.parseInt(args[0]);

        // computar 1/1 + 1/2 + 1/3 + ... + 1/n
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        // Imprime el harmónico
        System.out.println(sum);
    }
    
}

// % java HarmonicNumber 10
// *  2.9289682539682538