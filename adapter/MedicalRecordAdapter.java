import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MedicalRecordAdapter implements MedicalRecord {

    private HealthRecord record;
    private ArrayList<Visit> visits;

    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    public String getFirstName() {
        String name = record.getName();
        int index = name.indexOf(" ");
        String firstName = name.substring(0, index);
        return firstName;
    }

    public String getLastName() {
        String name = record.getName();
        int index = name.indexOf(" ");
        String lastName = name.substring(index+1);
        return lastName;
    }

    // check to make sure its correct
    public Date getBirthday() {
        Date date = record.getBirthdate();
        return date; 
    }

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

    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    }

    public ArrayList<Visit> getVisitHistory() {
        ArrayList<String> visitHistory = record.getHistory();
        ArrayList<Visit> visits = new ArrayList<Visit>();
        for(int i = 0; i < visitHistory.size()/3; i++) {    
            // SimpleDateFormat fromUser = new SimpleDateFormat("dd, MMMM, yyyy");
            // SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yyyy");
            // try {
            //     String str = myFormat.format(fromUser.parse(date));
            // } catch (ParseException e) {
            //     e.printStackTrace();
            // } 
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
