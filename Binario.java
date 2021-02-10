public class Binario {
    public static void main(String[] args) { 

        // argumento
        int n = Integer.parseInt(args[0]);

        // set power al mayor power de 2 que sea  <= n
        int power = 1;
        while (power <= n/2) {
            power *= 2;
        }
  
        // checa la presencia de power
        while (power > 0) {

            //  n power no está presente en n 
            if (n < power) {
                System.out.print(0);
            }

            // power está en n, resta power de n 
            else {
                System.out.print(1);
                n -= power;
            }

            // next smallest power of 2
            power /= 2;
        }

        System.out.println();

    }
}

//%java Binario 30 

