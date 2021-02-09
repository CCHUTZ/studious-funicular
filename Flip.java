public class Flip {

    public static void main(String[] args) {
        //el método Math.random () retorna un valor entre 0.0 y 1.0
        //Así obtienes cara o corona en la moneda 50% de las veces que juegues. 
        if (Math.random() < 0.5) System.out.println("Cara");
        else                    System.out.println("Corona");
    }
    
}
