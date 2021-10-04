/**
 * The Question class holds the information for a trivia question.
 * 
 * @author Siri Avula
 */
public class Question {
    /**
     * These are all of the private instance variables for question, answers and correct answer. 
     * String[] answers is an array of answers with type String.
     */
    private String question;
    private String[] answers;
    private int correctAnswer;

    /**
     * This is a public constructor for the Question class.
     * @param question is the question that the user will answer.
     * @param ans1 is the first answer choice.
     * @param ans2 is the second answer choice.
     * @param ans3 is the third answer choice.
     * @param ans4 is the fourth answer choice.
     * @param correctAnswer is the correct answer of the four answer choices.
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new String[4];
        ans1 = answers[0];
        ans2 = answers[1];
        ans3 = answers[2];
        ans4 = answers[3];
    }

    /**
     * This method is a toString method that will print out the question and answer choice options.
     * @return returns a string of the question and answer options
     */
    public String toString() {
        return question + "\n" + 
        "1. " + answers[0] + "\n" 
        + "2. " + answers[1] + "\n" 
        + "3. " + answers[2]+ "\n" 
        + "4. " + answers[3];
    }

    /**
     * This method compares the user's answer to the correct answer and prints out true if the user's answer is correct, otherwise the method returns false.
     * @param userAnswer is the answer that the user inputs. 
     * @return returns true if the user's answer is the same as the correct answer.
     */
    public boolean isCorrect(int userAnswer) {
        if ((userAnswer-1) == correctAnswer) {
            return true;
        }
        return false;
    }

    /**
     * This method returns the correct answer by finding the correct answer in the array of answers.
     * @return returns the correct answer as a String.
     */
    public String getCorrectAnswer() {
        return answers[correctAnswer];
    }
}
