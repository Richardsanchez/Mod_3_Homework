package assign01;

public class Faculty extends Employee {

    // Data fields
    private String officeHours;

    // Constructor
    public Faculty(String name, String email, double salary, String officeHours) {
        super(name, email, salary);
        this.officeHours = officeHours;
    }

    /** GETTERS AND SETTERS */
    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    /** END OF GETTERS AND SETTERS */

    //Print class
    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours;
    }
}