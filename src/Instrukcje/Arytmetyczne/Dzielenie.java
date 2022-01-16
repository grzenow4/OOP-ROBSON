package zad2.Instrukcje.Arytmetyczne;

import zad2.Instrukcja;
import zad2.Wyjatki.BladWykonania;

public class Dzielenie extends OperacjaArytmetyczna {
    private final Instrukcja argument1;
    private final Instrukcja argument2;

    public Dzielenie(Instrukcja argument1, Instrukcja argument2) {
        super("Dzielenie");
        this.argument1 = argument1;
        this.argument2 = argument2;
    }

    @Override
    public double wykonaj() throws BladWykonania {
        if (argument2.wykonaj() == 0) {
            throw new BladWykonania();
        }

        return argument1.wykonaj() / argument2.wykonaj();
    }
}
