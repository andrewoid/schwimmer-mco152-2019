package schwimmer.grams;

import org.junit.Test;
import schwimmer.dictionary.Dictionary;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GramsTest {

    @Test
    public void getWords_HELEN() throws FileNotFoundException {

        // given
        Dictionary dictionary = new Dictionary();
        Grams grams = new Grams(dictionary);

        // when
        List<String> words = grams.getWords("HELEN");

        // then
        assertEquals(10, words.size());
    }

}