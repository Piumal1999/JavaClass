package Day13.School;

public class Run {
    public static void main(String[] args) {

        //student 1 created
        Student s1 = new Student("49","Maithreepala","Sirisena","3-B");

        //student 2 created
        Student s2 = new Student("50","Ranil","Wickramasinghe","2-A");

        //student 3 created
        Student s3 = new Student("51","Mahinda","Rajapaksha","1-C");

        //student 4 created
        Student s4 = new Student();

        //print total students
        System.out.println("Total Students: " + Student.count);


        //teacher 1 created
        Teacher t1 = new Teacher("21","Henry","Bernard");

        //teacher 2 created
        Teacher t2 = new Teacher();

        //print total teachers
        System.out.println("Total Teachers: " + Teacher.count);

        t1.printName();

        s1.printName();
    }
}
