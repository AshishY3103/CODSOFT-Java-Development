package examples;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame {

    public MainGUI() {
        setTitle("Word Count Application");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JButton textWordCountButton = new JButton("Text Word Count");
        textWordCountButton.setBackground(Color.getHSBColor(100, 70, 10));
        JButton fileWordCountButton = new JButton("File Word Count");
        fileWordCountButton.setBackground(Color.cyan);

        // Layout
        setLayout(new GridLayout(2, 1));
        add(textWordCountButton);
        add(fileWordCountButton);

        // Button actions
        textWordCountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TextWordCountGUI();
                dispose(); // Close the main frame after opening the TextWordCountGUI
            }
        });

        fileWordCountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FileWordCountGUI();
                dispose(); // Close the main frame after opening the FileWordCountGUI
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainGUI());
    }
}
