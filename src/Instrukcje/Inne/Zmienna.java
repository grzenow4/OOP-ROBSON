package zad2.Instrukcje.Inne;

import zad2.Instrukcja;
import zad2.Robson;

public class Zmienna extends Instrukcja {
    private final String nazwa;

    public Zmienna(String nazwa) {
        super("Zmienna");
        this.nazwa = nazwa;
    }

    @Override
    public double wykonaj() {
        return Robson.dajZmienne().get(nazwa);
    }
}
