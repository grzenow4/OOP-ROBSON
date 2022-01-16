package zad2;

import zad2.Wyjatki.BladWykonania;

public abstract class Instrukcja {
    protected String typ;

    public Instrukcja(String typ) {
        this.typ = typ;
    }

    public abstract double wykonaj() throws BladWykonania;
}
