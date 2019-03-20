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

        GolfCourseComponent golfCourseComponent = new GolfCourseComponent();
        root.add(golfCourseComponent, BorderLayout.CENTER);

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
