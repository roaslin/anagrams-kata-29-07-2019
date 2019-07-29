import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AnagramGeneratorShould {

    @Test
    public void return_zero_anagrams_for_empty_input_string() {


        AnagramGenerator anagramsGenerator = new AnagramGenerator();
        assertThat(anagramsGenerator.generateFor(""), is(Collections.singletonList("")));
    }

    @Test
    public void return_one_anagram_for_word_of_one_character() {


        AnagramGenerator anagramsGenerator = new AnagramGenerator();
        assertThat(anagramsGenerator.generateFor("A"), is(Collections.singletonList("A")));
    }

    @Test
    public void return_two_anagrams_for_word_of_two_characters() {


        AnagramGenerator anagramsGenerator = new AnagramGenerator();
        assertThat(anagramsGenerator.generateFor("AB"), is(Arrays.asList("AB", "BA")));
    }

    @Test
    public void return_two_anagrams_for_word_of_three_characters() {

        AnagramGenerator anagramsGenerator = new AnagramGenerator();
        assertThat(anagramsGenerator.generateFor("ABC"), is(new ArrayList<String>() {
            {
                add("ABC");
                add("ACB");
                add("BAC");
                add("BCA");
                add("CAB");
                add("CBA");
            }
        }));
    }

}

