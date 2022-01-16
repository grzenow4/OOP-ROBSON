package zad2.Instrukcje.Logiczne;

import zad2.Wyjatki.BladWykonania;

public class I extends OperacjaLogiczna {
    private final WyrazenieLogiczne argument1;
    private final WyrazenieLogiczne argument2;

    public I(WyrazenieLogiczne argument1, WyrazenieLogiczne argument2) {
        super("And");
        this.argument1 = argument1;
        this.argument2 = argument2;
    }

    @Override
    public double wykonaj() throws BladWykonania {
        if (argument1.wykonaj() == 0 || argument2.wykonaj() == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
