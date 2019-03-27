package schwimmer.golf;

import schwimmer.physics.Projectile;

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

        JPanel controlPanel = new JPanel();
        controlPanel.add(new JLabel("Velocity"));
        JTextField velocityField = new JTextField();
        velocityField.setColumns(4);
        controlPanel.add(velocityField);
        controlPanel.add(new JLabel("Angle"));
        JTextField angleField = new JTextField();
        angleField.setColumns(4);
        controlPanel.add(angleField);
        JButton swingButton = new JButton("SWING!");
        controlPanel.add(swingButton);
        swingButton.addActionListener(event -> {
            Projectile projectile = new Projectile(
                    Double.parseDouble(velocityField.getText()),
                    Double.parseDouble(angleField.getText()));
            golfCourseComponent.setGolfball(projectile);
        });
        root.add(controlPanel, BorderLayout.SOUTH);

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
