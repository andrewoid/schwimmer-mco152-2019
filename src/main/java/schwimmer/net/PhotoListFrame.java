package schwimmer.net;

import io.reactivex.disposables.Disposable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class PhotoListFrame extends JFrame {

    private final JLabel imageLabel;
    private final JButton previousButton;
    private final JButton nextButton;
    private final JLabel currentNumberLabel;
    private final Disposable disposable;

    private PhotoList photoList;
    private int counter = 0;

    public PhotoListFrame() {
        setSize(800, 600);
        setTitle("PhotoList");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel root = new JPanel();
        root.setLayout(new BorderLayout());

        imageLabel = new JLabel();
        root.add(imageLabel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        previousButton = new JButton("Previous");
        previousButton.addActionListener(actionEvent -> {
            counter--;
            setPhoto(photoList.get(counter));
            updatePhotoNumber();
        });
        nextButton = new JButton("Next");
        nextButton.addActionListener(actionEvent -> {
            counter++;
            setPhoto(photoList.get(counter));
            updatePhotoNumber();
        });
        currentNumberLabel = new JLabel("1");
        bottomPanel.add(previousButton);
        bottomPanel.add(currentNumberLabel);
        bottomPanel.add(nextButton);
        root.add(bottomPanel, BorderLayout.SOUTH);

        setContentPane(root);

        JsonPlaceholderClient client = new JsonPlaceholderClient();
        disposable = client.getPhotoList()
                .subscribe(photos -> {
                    photoList = photos;
                    setPhoto(photos.get(0));
                });

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                // always dispose your disposable when closing the window.
                disposable.dispose();
            }
        });
    }


    public void setPhoto(Photo photo) {
        try {
            imageLabel.setIcon(new ImageIcon(new URL(photo.getUrl())));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void updatePhotoNumber() {
        currentNumberLabel.setText(String.valueOf(counter + 1));
    }

    public static void main(String[] args) {
        new PhotoListFrame().setVisible(true);
    }

}
