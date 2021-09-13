/**
 * An abstract class called Character Decorator, which essentially decorates the character.
 */
public abstract class CharacterDecorator extends Character {
    
    /**
     * This is the character that is being decorated.
     */
    protected Character character;

    /**
     * This constructor initializes the character, creates a for loop that takes the string from "sections" and adds it into this.sections.
     */
    public CharacterDecorator(Character character) {
        super();
        this.character = character;
        for (int i = 0; i < character.sections.size(); i++) {
            this.sections.add(character.sections.get(i));
        }
        customize();
    }

    /**
     * This is the customize method that is called in the constructor.
     */
    public abstract void customize();

}
