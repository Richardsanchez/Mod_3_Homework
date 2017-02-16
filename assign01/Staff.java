package assign01;

public class Staff extends Employee {

    // Data fields
    private String title;

    // Constructor
    public Staff(String name, String email, double salary, String title) {
        super(name, email, salary);
        this.title = title;
    }

    /** GETTERS AND SETTERS */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /** END OF GETTERS AND SETTERS */


    //Print class
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}