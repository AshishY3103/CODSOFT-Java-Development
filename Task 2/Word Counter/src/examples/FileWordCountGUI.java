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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FileWordCountGUI extends JFrame implements ActionListener {

    private JTextArea filePathField;
    private JButton countButton;
    private JLabel resultLabel;
    private JLabel uniqueWordsLabel;
    private JTextArea wordFrequencyLabel;
    private JPanel panel1;
    private JPanel panel2;
    
    
    public FileWordCountGUI() {
        setTitle("File Word Count");
        setSize(400, 150);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create components
        filePathField = new JTextArea(3, 20);
        countButton = new JButton("Count Words");
        countButton.addActionListener(this);
        countButton.setBackground(Color.cyan);
        resultLabel = new JLabel();
        uniqueWordsLabel = new JLabel();
        wordFrequencyLabel = new JTextArea();
        
        
        panel1 = new JPanel();
        panel1.add(new JLabel("Enter file path: "));
        panel1.add(new JScrollPane(filePathField));
        
        
        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel2.add(countButton,BorderLayout.NORTH);
        panel2.add(resultLabel,BorderLayout.CENTER);
        panel2.add(uniqueWordsLabel,BorderLayout.SOUTH);
        setLayout(new FlowLayout());
        add(panel1);
        add(panel2);
        //add(new JLabel("Enter file path: "));
        //add(new JScrollPane(filePathField));
        //add(countButton);
        //add(resultLabel);
        //add(uniqueWordsLabel);

        setVisible(true);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countButton) {
            String filePath = filePathField.getText().trim();
            if (!filePath.isEmpty()) {
                String fileContent = readFileContent(filePath);
                if (fileContent != null) {
                    String[] words = getWordsFromString(fileContent);
                    int totalWords = countWords(fileContent);
                    int uniqueWordCount = getUniqueWordCount(words);
                Map<String, Integer> wordFrequency = getWordFrequency(words);
                
                resultLabel.setText("Total words: " + totalWords);
                uniqueWordsLabel.setText("Unique Words: " + uniqueWordCount); 
                filePathField.setText("Word Frequency:\n"+wordFrequencyToString(wordFrequency));
                filePathField.setRows(20);
                filePathField.setColumns(60);
                setSize(700, 500);
                }
            } else {
                resultLabel.setText("Please enter a file path.");
            }
        }
    }

    private String readFileContent(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
            return content.toString();
        } catch (IOException e) {
            resultLabel.setText("Error reading the file: " + e.getMessage());
            return null;
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

