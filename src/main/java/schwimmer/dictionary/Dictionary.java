package schwimmer.dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionary {

    private ArrayList<String> list = new ArrayList<>();

    public Dictionary() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("dictionary.txt"));
        while (scanner.hasNext()) {
            String word = scanner.next();
            list.add(word);
            scanner.nextLine();
        }
        scanner.close();
    }

    public boolean contains(String word) {
        return list.contains(word.toUpperCase());
    }

    public boolean isPalindrome(String word) {
        return false;
    }

    public List<String> getPalindromes() {
        return null;
    }

    public int size() {
        return 0;
    }

}
