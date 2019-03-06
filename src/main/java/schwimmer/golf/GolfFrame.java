package schwimmer.golf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GolfFrame extends JFrame {

    public GolfFrame() {
        setTitle("Touro Golf");
        setSize(800, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel root = new JPanel();
        root.setLayout(new BorderLayout());

        JLabel north = new JLabel(new ImageIcon("spiked-dragon-head.png"));
        root.add(north, BorderLayout.NORTH);

        JLabel south = new JLabel("SOUTH");
        south.setBackground(Color.MAGENTA);
        south.setOpaque(true);
        root.add(south, BorderLayout.SOUTH);

        JLabel west = new JLabel("WEST");
        west.setBackground(Color.cyan);
        west.setOpaque(true);
        root.add(west, BorderLayout.WEST);

        JButton center = new JButton("CENTER");
        center.setBackground(Color.LIGHT_GRAY);
        center.setOpaque(true);

        center.addActionListener(this::printClick);

        root.add(center, BorderLayout.CENTER);

        setContentPane(root);
    }

    public void printClick(ActionEvent actionEvent) {
        // This is what happens when
        // you click the button
        // it's a lot of code and this can get out of hand
        // very quickly
        System.out.println("CLICK");
    }

}
