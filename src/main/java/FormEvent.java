import java.util.EventObject;

public class FormEvent extends EventObject {

    private String name;
    private String occupation;
    private int ageCategory;
    private String empCat;
    private String taxID;
    private boolean USCitizen;
    private String gender;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String name, String occupation,
                     int ageCat, String empCat, String taxID, boolean usCitizen,
                     String gender) {
        super(source);

        this.name = name;
        this.occupation = occupation;
        this.ageCategory = ageCat;
        this.empCat = empCat;
        this.taxID = taxID;
        this.USCitizen = usCitizen;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getAgeCategory() {
        return ageCategory;
    }

    public String getEmpCategory(){
        return this.empCat;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public boolean isUSCitizen() {
        return USCitizen;
    }

    public void setUSCitizen(boolean USCitizen) {
        this.USCitizen = USCitizen;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
