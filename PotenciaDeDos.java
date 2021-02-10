public class PotenciaDeDos {
    public static void main(String[] args) {
        // argumento de una linea de comando
        int n = Integer.parseInt(args[0]);

        int i = 0; // cuenta de 0 a N
        int PotenciaDeDos = 1; // poder de 2
        // repite hasta que i sea igual a n
        while (i <= n) {
            System.out.println(i + " " + PotenciaDeDos); // Imprime la potencia de 2
            PotenciaDeDos = 2 * PotenciaDeDos;
            i = i + 1;

        }
    }

}
