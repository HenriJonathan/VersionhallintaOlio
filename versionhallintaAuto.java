public class versionhallintaAuto {

public String merkki;
public String malli;
public int bensanMaara;

 public void naytaTiedot(){
        System.out.println("Auto: " + merkki + " " + malli);
        System.out.println("Bensan määrä: " + bensanMaara);
    }
    public void kiihdyta(){
    if (bensanMaara > 0)
    {
        bensanMaara--;
        System.out.println("Auto kiihtyy.");
    }
    else
    {
        System.out.println("Tankkaa ensin.");
    }
 }
}

    

