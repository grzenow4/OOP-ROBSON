package zad2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import zad2.Instrukcje.Arytmetyczne.WyrazenieArytmetyczne;
import zad2.Instrukcje.Logiczne.WyrazenieLogiczne;
import zad2.Wyjatki.*;

public class Robson {
    private static Instrukcja program;
    private static final HashMap<String, Double> zmienne = new HashMap<>();

    public static HashMap<String, Double> dajZmienne() {
        return zmienne;
    }

    public static void fromJSON(String filename) throws NieprawidlowyProgram, FileNotFoundException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Instrukcja.class, new InstrukcjaAdapter());
        gsonBuilder.registerTypeAdapter(WyrazenieArytmetyczne.class, new InstrukcjaAdapter());
        gsonBuilder.registerTypeAdapter(WyrazenieLogiczne.class, new InstrukcjaAdapter());
        Gson gson = gsonBuilder.create();

        JsonReader reader = new JsonReader(new FileReader(filename));

        program = gson.fromJson(reader, Instrukcja.class);
    }

    public static void toJSON(String filename) throws IOException {
        Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
        FileWriter writer = new FileWriter(filename);
        gson.toJson(program, writer);
        writer.close();
    }

    public static double wykonaj() throws BladWykonania {
        return program.wykonaj();
    }
}