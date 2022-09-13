import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> characters = new HashMap<>();

        char charactersFromQuote[] = quote.toCharArray();

        //System.out.println(charactersFromQuote);
        for (char letter: charactersFromQuote){
            if (characters.containsKey((letter))){
                characters.put(letter, characters.get(letter) + 1);
            } else {
                characters.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> lettersListed: characters.entrySet()){
            System.out.println(lettersListed.getKey() + ": " + lettersListed.getValue());
        }
    }
}