import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * This is the MedicalRecordAdapter class and Adapts the information of a Health Record
 * 
 * @author Siri Avula
 */
public class MedicalRecordAdapter implements MedicalRecord {

    private HealthRecord record;

    /**
     * This is the public constructor of the MedicalRecordAdapter class
     * @param record is the record that will inputted and adapted 
     */
    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    /**
     * Gets the first name of the patient
     * @return The first name of the patient as a String
     */
    public String getFirstName() {
        String name = record.getName();
        int index = name.indexOf(" ");
        String firstName = name.substring(0, index);
        return firstName;
    }

    /**
     * Gets the last name of the patient
     * @return The last name of the patient
     */
    public String getLastName() {
        String name = record.getName();
        int index = name.indexOf(" ");
        String lastName = name.substring(index+1);
        return lastName;
    }

    /**
     * Gets the patient's birthday
     * @return The birthday of the patient
     */
    public Date getBirthday() {
        Date date = record.getBirthdate();
        return date; 
    }

    /**
     * Gets the gender of the patient
     * @return The patient's gender
     */
    public Gender getGender() {
        Gender female = Gender.FEMALE;
        Gender male = Gender.MALE;
        Gender other = Gender.OTHER;
        if (record.getGender().equalsIgnoreCase(female.name())) {
            return female;
        }
        else if (record.getGender().equalsIgnoreCase(male.name())) {
            return male;
        }
        else {
            return other;
        }
    }

    /**
     * Adds a visit to the patients history log
     * @param date The date the patient visited the medical office
     * @param well True if the visit was a well check, and false otherwise
     * @param description The description of the visit
     */
    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    }

    /**
     * Gets the list of all the patients mecial visits
     * @return an arraylist (of type Visit) of patient medical visits
     */
    public ArrayList<Visit> getVisitHistory() {
        ArrayList<String> visitHistory = record.getHistory();
        ArrayList<Visit> visits = new ArrayList<Visit>();
        for(int i = 0; i < visitHistory.size()/3; i++) {    
            SimpleDateFormat formatter = new SimpleDateFormat("dd, MM, yyyy", Locale.ENGLISH);
            String dateInString = record.getHistory().get(i).substring(11);
            Date date = new java.util.Date(); 
            String wellStr = record.getHistory().get(i+1).substring(10);
            String description = record.getHistory().get(i+2).substring(10);
            boolean well = true;
            if (wellStr.equalsIgnoreCase("true")) {
                well = true;
            }
            else {
                well = false;
            }
            visits.add(new Visit(date, well, description));
        }
        
        return visits;
    }

    /**
     * A string representation of the patients health record
     * @return A string representation of the patients health record
     */
    public String toString() {
        String result = "***** " + getFirstName() + " " + getLastName() + " *****\n";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");

        result += "Birthday: " + simpleDateFormat.format(getBirthday()) + "\n";
        result += "Gender: " + getGender() + "\n";
        result += "Medical Visit History: \n";

        if(getVisitHistory().size() == 0){
            result += "No visits yet";
        } else {
            for(Visit visit : getVisitHistory()){
                result += visit.toString() + "\n";
            }
        }

        return result;
    }
}
