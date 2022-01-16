package zad2;

import com.google.gson.*;
import java.lang.reflect.Type;
import zad2.Instrukcje.Arytmetyczne.*;
import zad2.Instrukcje.Inne.*;
import zad2.Instrukcje.Logiczne.*;

public class InstrukcjaAdapter implements JsonDeserializer<Instrukcja> {
    @Override
    public Instrukcja deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        String typ = jsonObject.get("typ").getAsString();

        return switch (typ) {
            case "Blok" -> context.deserialize(jsonElement, Blok.class);
            case "If" -> context.deserialize(jsonElement, Warunek.class);
            case "While" -> context.deserialize(jsonElement, Petla.class);
            case "Przypisanie" -> context.deserialize(jsonElement, Przypisanie.class);
            case "Plus" -> context.deserialize(jsonElement, Plus.class);
            case "Minus" -> context.deserialize(jsonElement, Minus.class);
            case "Razy" -> context.deserialize(jsonElement, Razy.class);
            case "Dzielenie" -> context.deserialize(jsonElement, Dzielenie.class);
            case "And" -> context.deserialize(jsonElement, I.class);
            case "Or" -> context.deserialize(jsonElement, Lub.class);
            case "<" -> context.deserialize(jsonElement, Mniejsze.class);
            case ">" -> context.deserialize(jsonElement, Wieksze.class);
            case "<=" -> context.deserialize(jsonElement, MniejszeRowne.class);
            case ">=" -> context.deserialize(jsonElement, WiekszeRowne.class);
            case "==" -> context.deserialize(jsonElement, Rowne.class);
            case "Not" -> context.deserialize(jsonElement, Zaprzeczenie.class);
            case "Liczba" -> context.deserialize(jsonElement, Liczba.class);
            case "True", "False" -> context.deserialize(jsonElement, StalaLogiczna.class);
            case "Zmienna" -> context.deserialize(jsonElement, Zmienna.class);
            default -> throw new JsonParseException("Błędna instrukcja");
        };
    }
}
