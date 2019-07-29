import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnagramGenerator {
    public List<String> generateFor(String word) {

        if (word.isEmpty()) {
            return Collections.singletonList("");

        }
        if (word.length() == 1) {
            return Collections.singletonList(word);
        }

        if (word.length() == 2) {

            return new ArrayList<String>() {{
                add(word);
                add(word.substring(1, 2) + word.substring(0, 1));
            }};
        }

        return new ArrayList<String>() {{
            add(word.substring(0, 1) + generateFor("BC").get(0));
            add(word.substring(0, 1) + generateFor("BC").get(1));
            add(word.substring(1, 2) + generateFor("AC").get(0));
            add(word.substring(1, 2) + generateFor("AC").get(1));
            add(word.substring(2, 3) + generateFor("AB").get(0));
            add(word.substring(2, 3) + generateFor("AB").get(1));

        }};

    }
}
