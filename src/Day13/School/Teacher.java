package Day13.School;

public class Teacher extends Human {

    //default constructor
    public Teacher() {
        this("Undefined", "Undefined", "Undefined");
    }

    //constructor with details
    public Teacher(String staffId, String firstName, String lastName) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;

        count ++;
    }

    //count
    static int count;

    //teacher variables
    String staffId;
}
