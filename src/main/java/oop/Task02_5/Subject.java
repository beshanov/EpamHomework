package oop.Task02_5;

import java.util.ArrayList;
import java.util.List;
public enum Subject {
    MATH, PHYSICS, ENGLISH;

    public boolean fillGrade(){
        switch (this){
            case MATH : return true;
            case PHYSICS: return true;
            case ENGLISH: return false;
            default: return false;
        }
    }

    public ArrayList<Student> StudentList = new ArrayList<>();

    public void addStudent(Student Student){
        StudentList.add(Student);
    }

    public ArrayList<Student> getStudents(){
        return StudentList;
    }

}
