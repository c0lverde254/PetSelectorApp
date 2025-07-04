import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PetSelector extends JFrame implements ActionListener {
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton ;
    private JLabel imageLabel;

    public PetSelector() {
        setTitle("RadioButtonDemo");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Group buttons
        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Add action listeners
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        // Add to frame
        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);

        // Image display
        imageLabel = new JLabel();
        add(imageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String pet = "";
        String imageFile = "";

        if (e.getSource() == birdButton) {
            pet = "Bird";
            imageFile = "bird.png";
        } else if (e.getSource() == catButton) {
            pet = "Cat";
            imageFile = "cat.png";
        } else if (e.getSource() == dogButton) {
            pet = "Dog";
            imageFile = "dog.png";
        } else if (e.getSource() == rabbitButton) {
            pet = "Rabbit";
            imageFile = "rabbit.png";
        } else if (e.getSource() == pigButton) {
            pet = "Pig";
            imageFile = "pig.png";
        }

        // Load and set image
        ImageIcon icon = new ImageIcon(imageFile);
        imageLabel.setIcon(icon);

        // Show message at left corner
        JOptionPane.showMessageDialog(this, "You selected: " + pet);
    }

    public static void main(String[] args) {
        new PetSelector();
    }
}
