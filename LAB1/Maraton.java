package FirstLab;

public class Maraton implements IMaraton {

    private String placeofMarathon;
    private int year;
    private Atleticar[] atleticari;

    public Maraton() {
    }

    public Maraton(String placeofMarathon, int year, Atleticar[] atleticari) {

        this.placeofMarathon = placeofMarathon;
        this.year = year;
        this.atleticari = atleticari;
    }

    public String getPlaceofMarathon() {
        return placeofMarathon;
    }

    public void setPlaceofMarathon(String placeofMarathon) {
        this.placeofMarathon = placeofMarathon;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Atleticar[] getAtleticari() {
        return atleticari;
    }

    public void setAtleticari(Atleticar[] atleticari) {
        this.atleticari = atleticari;
    }

    @Override
    public String toString() {
        String s = placeofMarathon + "\n" + year + "\n";
        for (int i = 0; i < atleticari.length; i++) {
            s = s + atleticari[i].toString();
        }
        return s;
    }

    public Atleticar najdobroVreme() {
        double min = atleticari[0].getRuntime();
        int index = 0;
        for (int i = 1; i < atleticari.length; i++) {
            if (atleticari[i].getRuntime() < min) {
                index = i;
                min = atleticari[i].getRuntime();
            }
        }
        return atleticari[index];
    }

    public int atleticariOd(String s) {
        int br = 0;
        for (int i = 0; i < atleticari.length; i++) {
            if (atleticari[i].getCountry().compareTo(s) == 0) {
                br++;
            }
        }
        return br;
    }
}
