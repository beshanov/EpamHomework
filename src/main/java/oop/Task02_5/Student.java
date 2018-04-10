package oop.Task02_5;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;

    List<Grade> gradeList = new ArrayList<>();

    public<T extends Number> void addGrade(Subject subject, T number){
        if(subject.StudentList.contains(this)) {

          // if (subject.intGrade() && number.getClass()==Integer.class){gradeList.add(new Grade<T>(subject, number));}
         //  if (!subject.intGrade() && number.getClass()==Double.class){gradeList.add(new Grade<T>(subject, number));}

        } else {
            System.out.println("The student is not in the group");
        }
    }

    public void showGrades(Subject subject){
        for(Grade grade : gradeList){
            if(subject == grade.subject){
                System.out.println(subject.toString() + " " + grade.number);
            }
        }
    }


    /*List<Integer> mathGrades = new ArrayList<>();
    List<Integer> physicsGrades = new ArrayList<>();
    List<Double> englishGrades = new ArrayList<>();
*/



    public Student(String name){
        this.name = name;
    }

   /* public String getMathGrades(){
        return "Math: " + mathGrades.toString();
    }*/

    @Override
    public String toString() {
        return name;
    }
}
