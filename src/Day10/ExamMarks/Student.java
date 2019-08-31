package Day10.ExamMarks;

public class Student {
    static byte noOfSubjects = 4;
    String name;
    byte regNo;
    byte maths, science, it;

    //get the Total Marks
    public int getTotal() {
        return (maths+science+it);
    }
}
