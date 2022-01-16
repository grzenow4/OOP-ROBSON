package zad2.Instrukcje.Inne;

import zad2.Instrukcja;
import zad2.Robson;
import zad2.Wyjatki.BladWykonania;

public class Przypisanie extends Instrukcja {
    private final String nazwa;
    private final Instrukcja wartosc;

    public Przypisanie(String nazwa, Instrukcja wartosc) {
        super("Przypisanie");
        this.nazwa = nazwa;
        this.wartosc = wartosc;
    }

    @Override
    public double wykonaj() throws BladWykonania {
        if (Robson.dajZmienne().containsKey(nazwa)) {
            Robson.dajZmienne().replace(nazwa, wartosc.wykonaj());
        }
        else {
            Robson.dajZmienne().put(nazwa, wartosc.wykonaj());
        }

        return Robson.dajZmienne().get(nazwa);
    }
}
