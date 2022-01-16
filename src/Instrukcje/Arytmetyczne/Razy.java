package zad2.Instrukcje.Arytmetyczne;

import zad2.Instrukcja;
import zad2.Wyjatki.BladWykonania;

public class Razy extends OperacjaArytmetyczna {
    private final Instrukcja argument1;
    private final Instrukcja argument2;

    public Razy(Instrukcja argument1, Instrukcja argument2) {
        super("Razy");
        this.argument1 = argument1;
        this.argument2 = argument2;
    }

    @Override
    public double wykonaj() throws BladWykonania {
        return argument1.wykonaj() * argument2.wykonaj();
    }
}
