package zad2.Instrukcje.Logiczne;

import zad2.Wyjatki.BladWykonania;

public class Zaprzeczenie extends WyrazenieLogiczne {
    private final OperacjaLogiczna argument;

    public Zaprzeczenie(OperacjaLogiczna argument) {
        super("Not");
        this.argument = argument;
    }

    @Override
    public double wykonaj() throws BladWykonania {
        if (argument.wykonaj() == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
