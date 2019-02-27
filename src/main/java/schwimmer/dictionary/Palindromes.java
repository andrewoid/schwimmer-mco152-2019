package schwimmer.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Palindromes {

    public boolean isPalindrome(String word) {
        return new StringBuilder(word)
                .reverse()
                .toString()
                .equalsIgnoreCase(word);
    }

    public List<String> getPalindromes(Dictionary dictionary) {
        List<String> palindromes = new ArrayList<>();
        for (String s : dictionary.getList()) {
            if (isPalindrome(s)) {
                palindromes.add(s);
            }
        }
        return palindromes;
    }

}
