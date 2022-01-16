package zad2.Instrukcje.Arytmetyczne;

public class Liczba extends WyrazenieArytmetyczne {
    private final double wartosc;

    public Liczba(double wartosc) {
        super("Liczba");
        this.wartosc = wartosc;
    }

    @Override
    public double wykonaj() {
        return wartosc;
    }
}
