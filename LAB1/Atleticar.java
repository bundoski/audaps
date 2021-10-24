package FirstLab;

public class Atleticar {

    private String ime;
    private String pol;
    private int age;
    private double runtime;
    private String country;

    public Atleticar(){}

    public Atleticar(String ime, String pol, int age, double runtime, String country){

        this.ime=ime;
        this.pol=pol;
        this.age=age;
        this.runtime=runtime;
        this.country=country;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString(){
        return ime + "\n" + age + "\n" + country + "\n" + runtime + "\n";
    }

}
