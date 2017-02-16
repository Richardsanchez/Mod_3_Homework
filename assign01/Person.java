package assign01;

public class Person {

    //Data fields
    private String name;
    private String email;


     //Default constructor
     public Person() {

    }

    //Constructor
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /** GETTERS AND SETTERS */

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**END OF GETTERS AND SETTERS*/


    //Print class
    public String toString() {
        return "\nName: " + name + "\nEmail address: " + email;
    }
}