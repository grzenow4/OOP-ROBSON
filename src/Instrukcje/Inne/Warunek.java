package zad2.Instrukcje.Inne;

import zad2.Instrukcja;
import zad2.Instrukcje.Logiczne.WyrazenieLogiczne;
import zad2.Wyjatki.BladWykonania;

public class Warunek extends Instrukcja {
    private final WyrazenieLogiczne warunek;
    private final Instrukcja blok_prawda;
    private final Instrukcja blok_falsz;

    public Warunek(WyrazenieLogiczne warunek, Instrukcja blok_prawda, Instrukcja blok_falsz) {
        super("If");
        this.warunek = warunek;
        this.blok_prawda = blok_prawda;
        this.blok_falsz = blok_falsz;
    }

    @Override
    public double wykonaj() throws BladWykonania {
        if (warunek.wykonaj() != 0) {
            return blok_prawda.wykonaj();
        }
        else {
            return blok_falsz.wykonaj();
        }
    }
}
