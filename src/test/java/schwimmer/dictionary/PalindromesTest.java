package schwimmer.dictionary;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class PalindromesTest {

    @Test
    public void getPalindromes() {

        // given
        Dictionary dictionary = mock(Dictionary.class);
        Palindromes palindromes = new Palindromes();
        List<String> wordList =
                Arrays.asList("Kaila", "Esther", "Dad", "Hannah", "Helen", "Ayelet");
        doReturn(wordList).when(dictionary).getList();

        // when
        List<String> list = palindromes.getPalindromes(dictionary);

        // then
        assertEquals(2, list.size());

    }
}