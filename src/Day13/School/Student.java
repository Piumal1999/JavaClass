package Day13.School;

public class Student extends Human{

    //default constructor
    public Student(){
        this("Undefined","Undifined","Undifined","Undifined");
    }

    //constructor
    public Student(String addNo, String firstName, String lastName, String grade) {
        this.addNo = addNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        count ++;
    }

    //student count
    public static int count;

    //variables of student
    String addNo;
    String grade;

}
