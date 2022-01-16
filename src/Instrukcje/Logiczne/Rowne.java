package zad2.Instrukcje.Logiczne;

import zad2.Instrukcja;
import zad2.Wyjatki.BladWykonania;

public class Rowne extends PorownanieLogiczne {
    private final Instrukcja argument1;
    private final Instrukcja argument2;

    public Rowne(Instrukcja argument1, Instrukcja argument2) {
        super("==");
        this.argument1 = argument1;
        this.argument2 = argument2;
    }

    @Override
    public double wykonaj() throws BladWykonania {
        if (argument1.wykonaj() == argument2.wykonaj()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
