public class Main {
    public static void main(String[] args) {
        

        Auto auto1 = new Auto();

        auto1.merkki = "Toyota";
        auto1.malli = " Corolla";
        auto1.bensanMaara = 10;


        auto1.kiihdyta();
        // Välit
        System.out.println("");
        System.out.println("");
        // Välit

        auto1.naytaTiedot();
    

        Auto auto2 = new Auto();

        auto2.merkki = "Toyota";
        auto2.malli = " Prius";
        auto2.bensanMaara = 10;

        auto2.kiihdyta();
        auto2.naytaTiedot();

        auto1.tankkaa(20);
        auto1.naytaTiedot();
        

    }
    
}
