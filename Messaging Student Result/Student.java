package sms;

import java.util.ArrayList;

public class Student {
    private String name;
    private int roll;
    private double cgpa;
    ArrayList<Course> coursesTaken=new ArrayList<Course>();

    public Student(String name, int roll, double cgpa) {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
    }
    
    void registrationToCourse(Course course){
        if(coursesTaken.size()<3)
            coursesTaken.add(course);
        else
            System.out.println("You cannot take any more subjects");
    }
    
    void displayCourses(){
        for(Course c:coursesTaken){
            System.out.println(c.getName());
        }
    }
    
    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }
    public double getCgpa() {
        return cgpa;
    }
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", roll=" + roll + ", cgpa=" + cgpa + '}';
    }
    

    
}
