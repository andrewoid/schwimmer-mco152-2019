package schwimmer.dictionary;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DictionaryTest {

    @Test
    public void contains_true() throws FileNotFoundException {
        // given
        Dictionary dictionary = new Dictionary();

        // when
        // then
        assertTrue(dictionary.contains("WONDERFUL"));
    }

    @Test
    public void contains_true_mixed_case() throws FileNotFoundException {
        // given
        Dictionary dictionary = new Dictionary();

        // when
        // then
        assertTrue(dictionary.contains("Wonderful"));
    }

    @Test
    public void contains_false() throws FileNotFoundException {
        // given
        Dictionary dictionary = new Dictionary();

        // when
        // then
        assertFalse(dictionary.contains("WONDERF"));
    }

}