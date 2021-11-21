import java.util.Scanner;
/**
 * The ArithemeticGame class create methods for the game that helps interact with the user.
 * 
 * @author Siri Avula
 */
public class ArithemeticGame {
    /**
     * These are all of the private instance variables for easyState, mediumState, hardState, state, score, and reader. 
     * The private State easyState, mediumState, and hardState are the three different levels of the game.
     * The private State state variable will tell us which state the user is in.
     * The private int score variable keeps track of the user's score and will help us level them up if they are doing well, or level them down if they are struggling.
     * Scanner reader creates an instance of the scanner that helps us interact with the user.
     */
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    /**
     * This is the public constructor for the ArithemeticGame class.
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        this.state = state;
        this.score = score;
        this.reader = new Scanner(System.in);
    }

    /**
     * This method helps us interact with the user in asking them the questions and checking if they are correct.
     * We switch between the states based on how well the player is doing by keeping track of the score.
     */
    public void pressQuestionButton() {
        setState(easyState);
        while(true) {
        while(state == easyState) {
            int num1 = easyState.getNum();
            String operation = easyState.getOperation();
            int num2 = easyState.getNum();
            System.out.print(num1 + " " + operation + " " + num2 + ": ");
            int userAnswer = reader.nextInt();
            int answer = 0;
            if(operation == "+") {
                answer = num1 + num2;
            }
            else if(operation == "-") {
                answer = num1 - num2;
            }
                
            if(userAnswer == answer) {
                System.out.println("Correct");
                score++;
            }
            else {
                System.out.println("Incorrect");
                score = score - 1;
            }
            
            if(score >= 3) {
                easyState.levelUp();
                score = 0;
            }
            else if(score == -3) {
                easyState.levelDown();
            }

            System.out.println("1. Answer a Question\n2. Quit");
            int option = reader.nextInt();
            if(option == 1) {
                continue;
            }
            else {
                System.out.println("Goodbye");
                System.exit(0);
            }
        }

        while(state == mediumState) {
            int num1 = mediumState.getNum();
            String operation = mediumState.getOperation();
            int num2 = mediumState.getNum();
            System.out.print(num1 + " " + operation + " " + num2 + ": ");
            int userAnswer = reader.nextInt();
            int answer = 0;
            if(operation == "+") {
                answer = num1 + num2;
            }
            else if(operation == "-") {
                answer = num1 - num2;
            }
            else if(operation == "*") {
                answer = num1 * num2;
            }
                
            if(userAnswer == answer) {
                System.out.println("Correct");
                score++;
            }
            else {
                System.out.println("Incorrect");
                score = score - 1;
            }

            if(score >= 3) {
                mediumState.levelUp();
                score = 0;
            }
            else if(score <= -3) {
                mediumState.levelDown();
                score = 0;
                continue;
            }
    
            System.out.println("1. Answer a Question\n2. Quit");
            int option = reader.nextInt();
            if(option == 1) {
                continue;
            }
            else {
                System.out.println("Goodbye");
                System.exit(0);
            }
            
        }

        // Hard State
        while(state == hardState) {
            int num1 = hardState.getNum();
            String operation = hardState.getOperation();
            int num2 = hardState.getNum();
            System.out.print(num1 + " " + operation + " " + num2 + ": ");
            int userAnswer = reader.nextInt();
            int answer = 0;
            if(operation == "+") {
                answer = num1 + num2;
            }
            else if(operation == "-") {
                answer = num1 - num2;
            }
            else if(operation == "*") {
                answer = num1 * num2;
            }
            else if(operation == "/") {
                answer = num1 / num2;
            }

            if(userAnswer == answer) {
                System.out.println("Correct");
                score++;
            }
            else {
                System.out.println("Incorrect");
                score = score - 1;
            }

            if(score == 3) {
                hardState.levelUp();
            }
            else if(score <= -3) {
                hardState.levelDown();
                score = 0;
                continue;
            }

            System.out.println("1. Answer a Question\n2. Quit");
            int option = reader.nextInt();
            if(option == 1) {
                continue;
            }
            else {
                System.out.println("Goodbye");
                System.exit(0);
            }
        }

    }

    }

    /**
     * This method is a mutator and sets the state as what is input in the parameter.
     * @param state is the parameter and is the State that the current state is set to
     */
    public void setState(State state) { 
        this.state = state;
    }

    /**
     * This method is an accessor and gets the easy state.
     * @return returns the easy state of type State
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * This method is an accessor and gets the medium state.
     * @return returns the medium state of type State
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * This method is an accessor and gets the hard state.
     * @return returns the hard state of type State
     */
    public State getHardState() {
        return hardState;
    }


}