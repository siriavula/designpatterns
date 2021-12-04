import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * The information for a SC Medical Record
 * 
 * @author Siri Avula
 */
public class SCMedicalRecord implements MedicalRecord {

    /**
     * These are private instance variables used within this class. 
     * String firstName and String lastName are used for the name of the patient.
     * Date birthday and Gender gender tells us the birthdate and gender of the patient of type Date and Gender.
     * ArrayList<Visit> visits has all of the visits of the patient stored.
     */
    private String firstName;
    private String lastName;
    private Date birthday;
    private Gender gender;
    private ArrayList<Visit> visits;
    
    /**
     * This is the public constructor of the SCMedicalRecord class.
     * @param firstName is the first name of the patient
     * @param lastName is the last name of the patient
     * @param birthday is the birthday of the patient
     * @param gender is the gender of the patient
     */
    public SCMedicalRecord(String firstName, String lastName, Date birthday, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.visits = new ArrayList<Visit>();
    }

    /**
     * Gets the first name of the patient
     * @return The first name of the patient as a String
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * Gets the last name of the patient
     * @return The last name of the patient as a String
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Gets the patient's birthday
     * @return The birthday of the patient
     */
    public Date getBirthday(){
        return birthday;
    }

    /**
     * Gets the gender of the patient
     * @return The patient's gender
     */
    public Gender getGender(){
        return gender;
    }

    /**
     * Adds a visit to the patients history log
     * @param date The date the patient visited the medical office
     * @param well True if the visit was a well check, and false otherwise
     * @param description The description of the visit
     */
    public void addVisit(Date date, boolean well, String description){
        visits.add(new Visit(date, well, description));
    }

    /**
     * Gets the list of all the patients mecial visits
     * @return an arraylist (of type Visit) of patient medical visits
     */
    public ArrayList<Visit> getVisitHistory(){
        return visits;
    }

    /**
     * This method reformats the date of the patient's birthday
     * @return a String of the formatted birthday
     */
    private String getFormattedBirthday(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return simpleDateFormat.format(birthday);
    }

    /**
     * This method reformats the String of the Gender
     * @return a String ot the patient's gender
     */
    private String getFormattedGender(){
        String genderText = gender.toString();
        return genderText.substring(0,1).toUpperCase() + genderText.substring(1).toLowerCase();
    }

    /**
     * A string representation of the patients health record
     * @return A string representation of the patients health record
     */
    public String toString(){
        String result = "***** " + firstName + " " + lastName + " *****\n";
        result += "Birthday: " + getFormattedBirthday() + "\n";
        result += "Gender: " + getFormattedGender() + "\n";
        result += "Medical Visit History: \n";

        if(visits.size() == 0){
            result += "No visits yet";
        } else {
            for(Visit visit : visits){
                result += visit.toString() + "\n";
            }
        }

        return result;
    }
}
