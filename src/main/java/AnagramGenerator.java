import java.util.ArrayList;
import java.util.List;

public class AnagramGenerator {
    public List<String> generateFor(String word) {

        if (word.isEmpty()) {
            return new ArrayList<String>() {{
                add("");

            }};

        }
        if (word.length() == 1) {
            return new ArrayList<String>() {{
                add(word);
            }};
        }

        if (word.length() == 2) {

            return new ArrayList<String>() {{
                add(word);
                add(word.substring(1, 2) + word.substring(0, 1));
            }};
        }

        return new ArrayList<String>() {{

            add(word.substring(0, 1) + generateFor(dropCharacterOf(word, 0)).get(0));
            add(word.substring(0, 1) + generateFor(dropCharacterOf(word, 0)).get(1));
            add(word.substring(1, 2) + generateFor(dropCharacterOf(word, 1)).get(0));
            add(word.substring(1, 2) + generateFor(dropCharacterOf(word, 1)).get(1));
            add(word.substring(2, 3) + generateFor(dropCharacterOf(word, 2)).get(0));
            add(word.substring(2, 3) + generateFor(dropCharacterOf(word, 2)).get(1));

        }};

    }

    private String dropCharacterOf(String word, int position) {

        if (position == 0) {
            return word.substring(1, 3);
        }

        if (position == 1) {

            return word.substring(0, 1) + word.substring(2, 3);
        }

        return word.substring(0, 2);
    }
}
