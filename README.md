# CODSOFT-Java-Development

Task 1 : 
1. Generate a random number within a specified range, such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.
3. Compare the user's guess with the generated number and provide feedback on whether the guess
   is correct, too high, or too low.
4. Repeat steps 2 and 3 until the user guesses the correct number.
   You can incorporate additional details as follows:
5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.

Solution: 
Steps:
1. Define a GuessingGame class to encapsulate the game logic and data. 
   It has fields for startRange, endRange, maxAttempts, totalAttempts, rounds, and a Random object for generating random numbers.
2. The constructor initializes the game parameters and counters.
3. The generateRandomNumber() method generates a random number within the specified range.
4. The play() method runs the game inside a do-while loop, allowing multiple rounds to be played until   
   the user decides not to play again.
   In each round, a random number is generated using the generateRandomNumber() method.
   The user is prompted to enter their guess, and the program compares the guess with the generated number.
   The user is given feedback on whether their guess is too high or too low.
   The game continues until the user guesses the correct number or exceeds the maximum number of attempts.
   After each round, the user is asked if they want to play again. If they don't want to play again, the loop is terminated.
5. The getAverageAttemptsPerRound() method calculates the average attempts per round.
6. In the main method, we create a GuessingGame object, call the play() method to start the game, and 
   then display the final score.