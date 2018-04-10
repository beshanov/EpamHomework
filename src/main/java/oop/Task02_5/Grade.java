package oop.Task02_5;

public class Grade<T extends Number>{
    Subject subject;
    T number;

    public Grade(){
    }

    public Grade(Subject subject, T number){
        this.subject = subject;
        this.number =number;
    }
}
