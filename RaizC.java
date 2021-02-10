public class RaizC {
    public static void main(String[] args) { 

        // argumento
        double c = Double.parseDouble(args[0]);
        double epsilon = 1.0e-15;  // toleranica relativa al error
        double t = c;              // estimado de la raíz cuadrada de C 

        // Aplicar repetidament el update de Newton hasta alcanzar la precisón  deseada
             while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        // imprime el estimado de la raíz cuadara de C 
        System.out.println(t);
    }
}

// java RaizC 2 

//Bugs conocidos: loop infinito si el número es negativo. 