public class Dog {
    private String imie;
    private String rasa;

    public Dog(){};
    public Dog (String imie, String rasa){
        this.imie = imie;
        this.rasa = rasa;
    }

    public String getImie() {
        return imie;
    }

    public String getRasa() {
        return rasa;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "imie='" + imie + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
