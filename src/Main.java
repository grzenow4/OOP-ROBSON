package zad2;

import java.io.IOException;
import zad2.Wyjatki.*;

public class Main {
    public static void main(String[] args) throws BladWykonania, IOException, NieprawidlowyProgram {
        Robson.fromJSON("silnia.json");
        Robson.toJSON("toJSON");
        System.out.println(Robson.wykonaj());
    }
}
