package Day10.ExamMarks;

public class Run {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Amal";
        s1.regNo = 1;
        s1.maths = 5;
        s1.science = 6;
        s1.it = 22;
        System.out.println(s1.regNo+") "+s1.name+"  : "+s1.getTotal());

        Student s2 = new Student();
        s2.name = "Kamal";
        s2.regNo = 2;
        s2.maths = 90;
        s2.science = 8;
        s2.it = 2;
        System.out.println(s2.regNo+") "+s2.name+"  : "+s2.getTotal());

        Student s3 = new Student();
        s3.name = "Sunimal";
        s3.regNo = 3;
        s3.maths = 1;
        s3.science = 0;
        s3.it = 90;
        System.out.println(s3.regNo+") "+s3.name+"  : "+s3.getTotal());

        Student s4 = new Student();
        s4.name = "Nimal";
        s4.regNo = 4;
        s4.maths = 5;
        s4.science = 1;
        s4.it = 100;
        System.out.println(s4.regNo+") "+s4.name+"  : "+s4.getTotal());

        Student s5 = new Student();
        s5.name = "Vimal";
        s5.regNo = 5;
        s5.maths = 8;
        s5.science = 8;
        s5.it = 8;
        System.out.println(s5.regNo+") "+s5.name+"  : "+s5.getTotal());
    }
}
