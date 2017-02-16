package assign01;

public class Employee extends Person {

    //Data fields
    private double salary;
    private Date hireDate;

    //Constructor
    public Employee(String name, String email, double salary) {
        super(name, email);
        this.salary = salary;
        this.hireDate = new Date();
    }


   /** GETTERS AND SETTERS **/
    public String getSalary() {
        return String.format("%.2f", salary);
    }

    public String getHireDate() {
        return hireDate.Date;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /** END OF GETTERS AND SETTERS */



    //Print class
    public String toString() {
        return super.toString() + "\nSalary: $" + getSalary() + "\nDate hired: " + getHireDate();
    }
}