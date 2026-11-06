public class versionhallintaMain {
public static void main(String[] args){

versionhallintaAuto auto1 = new versionhallintaAuto();

auto1.merkki = "Mercedes-Benz";
auto1.malli = "e36 AMG";
auto1.bensanMaara = 40;

auto1.naytaTiedot();
auto1.kiihdyta();

System.out.println("");

    versionhallintaAuto auto2 = new versionhallintaAuto();

        auto2.merkki = "Audi";
        auto2.malli = "A4";
        auto2.bensanMaara = 35;

        auto2.kiihdyta();
        auto2.naytaTiedot();

        System.out.println(""); // väli
               
       versionhallintaAuto auto3 = new versionhallintaAuto();

        auto3.merkki = "Toyota";
        auto3.malli = " Corolla";
        auto3.bensanMaara = 10;


        auto3.kiihdyta();
        auto3.naytaTiedot();
        // Välit
        System.out.println("");
    

        versionhallintaAuto auto4 = new versionhallintaAuto();

        auto4.merkki = "Toyota";
        auto4.malli = " Prius";
        auto4.bensanMaara = 10;

        auto4.kiihdyta();
        auto4.naytaTiedot();

        System.out.println("");

    versionhallintaAuto auto5 = new versionhallintaAuto();

    auto5.merkki = "Mitsubishi";
    auto5.malli = " Galant";
    auto5.bensanMaara = 20;

    auto5.kiihdyta();
    auto5.naytaTiedot();
    

 }
} 
