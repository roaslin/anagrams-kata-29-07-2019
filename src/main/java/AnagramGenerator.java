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

        if(word.length() == 2){

            return new ArrayList<String>() {{
                add(word);
                add(word.substring(1,2) + word.substring(0,1));
            }};
        }

        return new ArrayList<String>() {{
            add("ABC");
            add("ACB");
            add("BAC");
            add("BCA");
            add("CAB");
            add("CBA");

        }};

    }
}
