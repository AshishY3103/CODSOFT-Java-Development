import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Random;

public class Main extends JFrame implements ActionListener {
    private JTextField guessField;
    private JButton guessButton;
    private JLabel resultLabel;
    private JLabel scoreLabel;
    private JLabel attemptsLabel;
    private int randomNumber;
    private int maxAttempts;
    private int score;
    private int attempts;
    private boolean gameInProgress;

    public Main() {
        setTitle("Number Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Number Guessing Game");
        titleLabel.setFont(new Font("Times New Roman", 1, 24));
        titleLabel.setForeground(new java.awt.Color(0, 204, 255));
        titleLabel.setBounds(50, 30, 300, 30);

        panel.add(titleLabel);

        JLabel guessLabel = new JLabel("Enter Number to Guess: ");
        guessLabel.setFont(new Font("Times New Roman", 1, 18));
        guessLabel.setBounds(20, 80, 250, 20);
        panel.add(guessLabel);

        guessField = new JTextField();
        guessField.setFont(new Font("Times New Roman", 1, 18));
        guessField.setBounds(230, 80, 80, 20);
        panel.add(guessField);
        guessField.setColumns(10);

        guessButton = new JButton("Guess");
        guessButton.setBounds(210, 150, 100, 25);
        guessButton.setBackground(new java.awt.Color(255, 255, 204));
        guessButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        panel.add(guessButton);
        guessButton.addActionListener(this);

        resultLabel = new JLabel(" ");
        resultLabel.setBounds(50, 180, 300, 20);
        resultLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resultLabel.setForeground(new java.awt.Color(204, 153, 255));
        panel.add(resultLabel);

        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setBounds(20, 130, 100, 20);
        scoreLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        panel.add(scoreLabel);

        attemptsLabel = new JLabel("Attempts: 0");
        attemptsLabel.setBounds(20, 150, 100, 20);
        attemptsLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        panel.add(attemptsLabel);

        setBounds(100, 100, 400, 300);
        setResizable(false);
        setVisible(true);

        initializeGame();
    }

    private void initializeGame() {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
        maxAttempts = 5;
        score = 0;
        attempts = 0;
        resultLabel.setText(" ");
        scoreLabel.setText("Score: " + score);
        attemptsLabel.setText("Attempts: " + attempts);
        gameInProgress = true;
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == guessButton) {
            int guess;
            try {
                guess = Integer.parseInt(guessField.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input! Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (gameInProgress) {
                attempts++;

                if (guess == randomNumber) {
                    resultLabel.setText("Congratulations! You guessed the correct number.");
                    score += maxAttempts - attempts + 1;
                    scoreLabel.setText("Score: " + score);
                    gameInProgress = false;
                    int playAgain = JOptionPane.showConfirmDialog(this, "Do you want to play again?", "Game Over", JOptionPane.YES_NO_OPTION);
                    if (playAgain == JOptionPane.YES_OPTION) {
                        resetGame();
                        initializeGame();
                    } else {
                        System.exit(0);
                    }
                } else if (guess < randomNumber) {
                    resultLabel.setForeground(new java.awt.Color(204, 153, 255));
                    resultLabel.setText("Too low! Guess a higher number.");
                }else if (guess > 100) {
                    resultLabel.setForeground(new java.awt.Color(255, 0, 0));
                    resultLabel.setText("Too high! Please Guess number between 1 to 100.");
                    
                } else {
                    resultLabel.setForeground(new java.awt.Color(204, 153, 255));
                    resultLabel.setText("Too high! Guess a lower number.");
                    
                }

                if (attempts == maxAttempts) {
                    JOptionPane.showMessageDialog(this, "Game over! You ran out of attempts.\nThe correct number was: " + randomNumber, "Game Over", JOptionPane.INFORMATION_MESSAGE);
                    gameInProgress = false;
                    int playAgain = JOptionPane.showConfirmDialog(this, "Do you want to play again?", "Game Over", JOptionPane.YES_NO_OPTION);
                    if (playAgain == JOptionPane.YES_OPTION) {
                        resetGame();
                        initializeGame();
                    } else {
                        System.exit(0);
                    }
                }

                attemptsLabel.setText("Attempts: " + attempts);
                if (gameInProgress) {
                    showHint(guess);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please start a new game.", "Game Over", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void showHint(int guess) {
        String hint;

        int difference = Math.abs(randomNumber - guess);
        if(guess > 100){
            JOptionPane.showMessageDialog(this, "Invalid input! Please guess between 1 to 100.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            
        }else{
          if (difference >= 20) {
            hint = "You're far away from the number.";
        } else if (difference >= 5) {
            hint = "You're getting closer but still a bit far.";
        } else{
            hint = "You're very close now, just a few steps away.";
        }  
        }
        

        JOptionPane.showMessageDialog(this, hint, "Hint", JOptionPane.INFORMATION_MESSAGE);
    }

    private void resetGame() {
        guessField.setText("");
        resultLabel.setText("");
        attempts = 0;
        gameInProgress = true;
    }

public static void main(String[] args) {
        new Main();
    }
}
