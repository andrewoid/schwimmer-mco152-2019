package schwimmer.grams;

import org.junit.Before;
import org.junit.Test;
import schwimmer.dictionary.Dictionary;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GramsTest {

    private Dictionary dictionary;

    @Before
    public void before() {
        dictionary = mock(Dictionary.class);
    }

    @Test
    public void getWords_HELEN() throws FileNotFoundException {
        // given
        Dictionary dictionary = new Dictionary();
        Grams grams = new Grams(dictionary);

        // when
        List<String> words = grams.getWords("HELEN");

        // then
        assertEquals(10, words.size());
        // TODO add more asserts
    }

    @Test
    public void getWords_ABCDE() {
        // given
        Grams grams = new Grams(dictionary);
        doReturn(Arrays.asList("CAB", "EEL", "CMA")).when(dictionary).getList();

        // when
        List<String> words = grams.getWords("ABCDE");

        // then
        assertEquals(1, words.size());
        assertEquals("CAB", words.get(0));
        verify(dictionary).getList();
    }

}