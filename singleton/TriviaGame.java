import java.util.*;
/**
 * The TriviaGame class helps create a trivia game that interacts with the user.
 * 
 * @author Siri Avula
 */
public class TriviaGame {
    
    /**
     * These are all of the private instance variables for triviaGame, score, rand, reader, and questions. 
     * We create a private static triviaGame using TriviaGame.
     * The integer variable score will keep track of the number of games the user wins.
     * The private Random rand variable will be used to generate random numbers. 
     * ArrayList<Question> is an array list of the questions only.
     */
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;
    
    /**
     * This is the private constructor for the TriviaGame class.
     */
    private TriviaGame() {
        this.reader = new Scanner(System.in);
        this.rand = new Random();
        this.questions = DataLoader.getTriviaQuestions();
    }

    /**
     * This method checks to make sure there isn't an existing instance of TriviaGame and then creates an instance of TriviaGame.
     * @return returns an instance of TriviaGame
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            System.out.println("Creating a Trivia Game");
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    /**
     * This method allows the user to keep playing the game.
     */
    public void play() {
        boolean quit = false;
        while(!quit) {
            System.out.println("(P)lay or (Q)uit: ");
            String playGame = reader.nextLine();
            if (playGame.equalsIgnoreCase("p")) {
                playRound();
            }
            else if (playGame.equalsIgnoreCase("q")) {
                System.out.println("\nYou won " + score + " games!\nGoodbye");
                System.exit(0);
            }
        }
        
    }

    /**
     * This method allows the user to play the round. It asks the user a random question and allows the user to answer the question. The method also checks if the user answers right or wrong.
     * @return returns true if the user enters a correct answer for the question.
     */
    private boolean playRound() {
        int randomQuestion = rand.nextInt(questions.size());
        this.questions.toString();
        System.out.println(questions.get(randomQuestion));
        System.out.println("Enter answer: ");
        int ans = reader.nextInt();
        reader.nextLine();
        if(questions.get(randomQuestion).isCorrect(ans)) {
            System.out.println("YAY! You got it right!");
            score++;
            return true;
        }
        else {
            System.out.println("You got it wrong!\nThe correct answer is " + questions.get(randomQuestion).getCorrectAnswer());
            return false;
        }
    }
}
