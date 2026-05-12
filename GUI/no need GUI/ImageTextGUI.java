//package GUI;
import javax.swing.*;
import java.awt.*;

public class ImageTextGUI extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public ImageTextGUI() {
        setTitle("Vertical Pictures ");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
        setLayout(null);

        // First Picture
        ImageIcon image1 = new ImageIcon("Resources/q1.jpg");
        label1 = new JLabel(image1);
        label1.setBounds(50, 50, image1.getIconWidth(), image1.getIconHeight());
        add(label1);

        // Second Picture
        ImageIcon image2 = new ImageIcon("Resources/q2.jpg");
        label2 = new JLabel(image2);
        label2.setBounds(50, 200, image2.getIconWidth(), image2.getIconHeight());
        add(label2);

        // Third Picture
        ImageIcon image3 = new ImageIcon("Resources/q3.jpg");
        label3 = new JLabel(image3);
        label3.setBounds(50, 350, image3.getIconWidth(), image3.getIconHeight());
        add(label3);

        // Text on First Picture
        JLabel textLabel1 = new JLabel("Iron package");
        textLabel1.setForeground(Color.WHITE);
        textLabel1.setBounds(80, 100, 150, 20);
        add(textLabel1);

        // Text on Second Picture
        JLabel textLabel2 = new JLabel("Silver package");
        textLabel2.setForeground(Color.WHITE);
        textLabel2.setBounds(80, 250, 150, 20);
        add(textLabel2);

        // Text on Third Picture
        JLabel textLabel3 = new JLabel("Gold Package");
        textLabel3.setForeground(Color.WHITE);
        textLabel3.setBounds(80, 400, 150, 20);
        add(textLabel3);
    }

    public static void main(String[] args) {
        
            ImageTextGUI example = new ImageTextGUI();
            //example.setVisible(true);
        };
    }
