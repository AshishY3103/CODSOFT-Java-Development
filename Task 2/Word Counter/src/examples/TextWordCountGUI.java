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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TextWordCountGUI extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JButton countButton;
    private JLabel resultLabel;
    private JLabel uniqueWordsLabel;
    private JLabel wordFrequencyLabel;

    public TextWordCountGUI() {
        setTitle("Text Word Count");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create components
        
        textArea = new JTextArea(10, 30);
        countButton = new JButton("Count Words");
        countButton.addActionListener(this);
        resultLabel = new JLabel();
        uniqueWordsLabel = new JLabel();
       
        
        countButton.setBackground(Color.getHSBColor(100, 70, 10));
       
        
        JPanel statisticsPanel = new JPanel();
        statisticsPanel.setLayout(new GridLayout(3, 1));
        statisticsPanel.add(resultLabel);
        statisticsPanel.add(uniqueWordsLabel);
        // Layout
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(countButton, BorderLayout.SOUTH);
        add(statisticsPanel, BorderLayout.NORTH);
        

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countButton) {
            String inputText = textArea.getText().trim();
            if (!inputText.isEmpty()) {
                String[] words = getWordsFromString(inputText);
                int totalWords = countWords(inputText);
                
                int uniqueWordCount = getUniqueWordCount(words);
                Map<String, Integer> wordFrequency = getWordFrequency(words);
                
                resultLabel.setText("Total words: " + totalWords);
                uniqueWordsLabel.setText("Unique Words: " + uniqueWordCount);
                
                textArea.setText("Word Frequency:\n"+wordFrequencyToString(wordFrequency));
            } else {
                resultLabel.setText("Please enter some text.");
            }
        }
    }

    private int countWords(String inputText) {
        // Implement word counting logic here
        String[] words = inputText.split("\\W+");
        return words.length;
    }
    
    private String[] getWordsFromString(String text) {
        // Split the text into words using space and punctuation as delimiters
        return text.split("[\\p{Space}\\p{Punct}]+");
    }

    private int getUniqueWordCount(String[] words) {
        // Count unique words using a set
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        return uniqueWords.size();
    }

    private Map<String, Integer> getWordFrequency(String[] words) {
        // Count word frequency using a map
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        return wordFrequency;
    }

    private String wordFrequencyToString(Map<String, Integer> wordFrequency) {
        // Convert word frequency map to a formatted string
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append(" ,\n ");
        }
        return sb.toString();
    }
}
