/**
 * This class creates the nose decoration.
 */
public class Nose extends CharacterDecorator{
    
    /**
     * This method is the constructor for the Nose class.
     */
    public Nose(Character character) {
        super(character);
        this.character = character;
        //this.sections.add(" |   >    | ");
    }

    /**
     * This method changes the decoration in the sections to display nose.
     */
    public void customize() {
        sections.set(3, " |   >    | ");
    }
}
