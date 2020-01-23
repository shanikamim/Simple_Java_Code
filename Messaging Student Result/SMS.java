package sms;

import java.util.ArrayList;

public class SMS {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<Student> students = new ArrayList<Student>();
        
        courses.add(new Course("C Prog", "CSE1011", 3));
        courses.add(new Course("Java", "CSE2015", 3));
        courses.add(new Course("Java Lab", "CSE2016", 3));
        courses.add(new Course("DS", "CSE1033", 3));
        
        students.add(new Student("STD 1", 1, 0));
        students.add(new Student("STD 2", 2, 0));
        
        students.get(0).registrationToCourse(courses.get(0));
        students.get(0).registrationToCourse(courses.get(1));
        students.get(0).registrationToCourse(courses.get(2));
        students.get(0).registrationToCourse(courses.get(3));
        
        students.get(0).displayCourses();
        
        
        
//        for(Course c : courses){
//            System.out.println(c.getName());
//        }
//        for(Student s : students){
//            System.out.println(s.getName());
//        }
    }
    
}
