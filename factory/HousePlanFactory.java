/**
 * This class is the HousePlanFactory that returns the complete House Plan
 */
public class HousePlanFactory {
    /**
     * This method creates the House Plan that will be returned when a corresponding string is inputted
     * @param typel
     * @return type
     */
    public static HousePlan createHousePlan(String typel) {
         HousePlan type; 

         if(typel.equalsIgnoreCase("log cabin")) {
             type = new LogCabinPlan();
         }
         else if(typel.equalsIgnoreCase("Tiny Home")) {
             type = new TinyHomePlan();
         }
         else {
             type = new ContemporaryPlan();
         }

         return type;        
    }
}
