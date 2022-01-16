package zad2.Instrukcje.Inne;

import zad2.Instrukcja;
import zad2.Instrukcje.Logiczne.WyrazenieLogiczne;
import zad2.Wyjatki.BladWykonania;

public class Petla extends Instrukcja {
    private final WyrazenieLogiczne warunek;
    private final Instrukcja blok;

    public Petla(WyrazenieLogiczne warunek, Instrukcja blok) {
        super("While");
        this.warunek = warunek;
        this.blok = blok;
    }

    @Override
    public double wykonaj() throws BladWykonania {
        while (warunek.wykonaj() != 0) {
            blok.wykonaj();
        }

        return 0;
    }
}
