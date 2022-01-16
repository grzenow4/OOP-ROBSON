package zad2.Instrukcje.Inne;

import java.util.ArrayList;
import zad2.Instrukcja;
import zad2.Wyjatki.BladWykonania;

public class Blok extends Instrukcja {
    private final ArrayList<Instrukcja> instrukcje;

    public Blok(ArrayList<Instrukcja> instrukcje) {
        super("Blok");
        this.instrukcje = instrukcje;
    }

    @Override
    public double wykonaj() throws BladWykonania {
        if (instrukcje.isEmpty()) {
            return 0;
        }
        else {
            for (int i = 0; i < instrukcje.size() - 1; i++) {
                instrukcje.get(i).wykonaj();
            }

            return instrukcje.get(instrukcje.size() - 1).wykonaj();
        }
    }
}
