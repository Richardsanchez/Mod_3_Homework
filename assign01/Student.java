package assign01;

public class Student extends Person {

    //Data fields
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 3;
    public final static int JUNIOR = 2;
    public final static int SENIOR = 4;

    //Constructor
    public Student(String name, String email, int status) {
        super(name, email);
        this.status = status;
    }

    /** GETTERS AND SETTERS */
    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1 : return "freshman";
            case 2 : return "sophomore";
            case 3 : return "junior";
            case 4 : return "senior";
        }
    }

    /** END OF GETTERS AND SETTERS */

    //Print class
    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
}
