package schwimmer.dictionary;

import javax.swing.*;
import java.io.FileNotFoundException;

public class DictionaryFrame extends JFrame {

    private final JLabel label;
    private Dictionary dictionary;

    public DictionaryFrame() {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    dictionary = new Dictionary();
                    label.setText("Dictionary is now Loaded");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        setTitle("Dictionary");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Dictionary Not Loaded");
        add(label);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new DictionaryFrame().setVisible(true);
        System.out.println(System.currentTimeMillis() - start);
    }

}
