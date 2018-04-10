package oop.Task02_5;

import static oop.Task02_5.Subject.MATH;

public class JournalTest {

    public static void main(String[] args) {
        Student p1 = new Student("Ann");
        Student p2 = new Student("Ben");
        Student p3 = new Student("Harry");

        MATH.addStudent(p1);
        MATH.addStudent(p2);
        Subject.ENGLISH.addStudent(p1);
        Subject.ENGLISH.addStudent(p3);

        p1.addGrade(MATH, 4.2);
        p1.addGrade(MATH, 4);
        p1.addGrade(MATH, 5);

        p1.showGrades(MATH);

       // System.out.println(MATH.getStudents());
       // System.out.println(Subject.ENGLISH.getStudents());




    }
}
