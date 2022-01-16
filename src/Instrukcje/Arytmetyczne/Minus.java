package zad2.Instrukcje.Arytmetyczne;

import zad2.Instrukcja;
import zad2.Wyjatki.BladWykonania;

public class Minus extends OperacjaArytmetyczna {
    private final Instrukcja argument1;
    private final Instrukcja argument2;

    public Minus(Instrukcja argument1, Instrukcja argument2) {
        super("Minus");
        this.argument1 = argument1;
        this.argument2 = argument2;
    }

    @Override
    public double wykonaj() throws BladWykonania {
        return argument1.wykonaj() - argument2.wykonaj();
    }
}
