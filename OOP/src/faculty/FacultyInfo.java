
package faculty;

import common.Person;
import student.StudentInfo;

public class FacultyInfo extends Person{
    public String initial;
    
    public void listOfAllStudentContactNumber(){
        StudentInfo student = new StudentInfo();
        student.setContactNumber("123");
        student.getContactNumber();
    }
    
    public void listOfAllStudentInfo(){
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.Id="";
        studentInfo.getAddress();
        studentInfo.getAge();
        studentInfo.getContactNumber();
    }
}
