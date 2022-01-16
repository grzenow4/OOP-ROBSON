package zad2.Instrukcje.Logiczne;

public class StalaLogiczna extends WyrazenieLogiczne {
    private final boolean wartosc;

    public StalaLogiczna(String typ) {
        super(typ);
        wartosc = typ.equals("True");
    }

    @Override
    public double wykonaj() {
        if (wartosc) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
