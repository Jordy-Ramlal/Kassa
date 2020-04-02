public class Kassa {

    private double totaal;
    private int aantalProducten;

    public Kassa() {

    }

    public void voegProductToe(double prijs) {
        totaal = totaal + prijs;
        aantalProducten++;
    }

    public double getTotaalMetKorting() {
        if (totaal >= 100 && aantalProducten >= 3) {
            return totaal * 0.9;
        }
        else {
            return totaal;
        }
    }

    public int getTotaalAantalProducten() {
        return 0;
    }

    public void resetKassa() {
        totaal = 0.0;
        aantalProducten = 0;
    }
}
