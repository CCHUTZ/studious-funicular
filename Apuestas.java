public class Apuestas {

    public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);    // Bankroll del apostador
        int goal   = Integer.parseInt(args[1]);    // Bankrol deseado del apostador
        int trials = Integer.parseInt(args[2]);    // número de itnentos para conseguirlo 

        int bets = 0;        // total de apuestas hechas 
        int wins = 0;        // total de apuestas ganadas 

        // repetir los intentos
        for (int t = 0; t < trials; t++) {

            // Simulatción de perdida
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                // se llegó a la meta?
        }

        // Resultados
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }
    
}

// *  % java Apuestas 50 250 1000
//*  178 wins of 1000
//*  Percent of games won = 17.8
//*  Avg # bets           = 10010.79