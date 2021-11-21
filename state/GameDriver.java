import java.util.Scanner;
/**
 * A driver for the Arithemetic Game
 * 
 * @author Siri Avula
 */
public class GameDriver {

    /**
     * These are our instance variables:
     * We have the Scanner reader variable initialized, which will be used to interact with the user.
     * We have an instance of the ArithemeticGame which will help us interact with the game.
     * We also have a String array of options that the user will choose from.
     */
    private Scanner reader;
    private ArithemeticGame game;
    private static final String[] mainOptions = {"Answer a Question", "Quit"};

    /**
     * This is the public constructor for our GameDriver class.
     */
    public GameDriver() {
        reader = new Scanner(System.in);
        game = new ArithemeticGame();
    }

    /**
     * This method runs the Arithemetic Game.
     */
    public void run() {
        System.out.println("Welcome to our Arithemetic Game");

        while(true) {
            int option = getUserOption();
            
            if(option == 1) {
                game.pressQuestionButton();
            } else if(option == 2){
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Sorry Invalid command");
            }
        }
    }

    /**
     * This method gets the user's input for which option they would like to choose.
     * @return returns an integer value that the user inputs
     */
    private int getUserOption(){
        for(int i=0; i < mainOptions.length; i++){
            System.out.println((i+1) + ". " + mainOptions[i]);
        }
        return Integer.parseInt(reader.nextLine());
    }

    public static void main(String[] args) {
        GameDriver driver = new GameDriver();
        driver.run();
    }
}
