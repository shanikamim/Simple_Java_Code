/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author seu
 */
public class CourseInfo {

    protected String courseTitle;
    protected String courseCode;
    protected int courseCredit;
    protected String courseSection;

    public void CourseInfo(String courseCode, int courseCredit){
        this.courseCode = courseCode;
        this.courseCredit = courseCredit;
    }
    
    public void CourseInfo(String courseTitle, String courseCode) {
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
    }

    public void CourseInfo(String courseTitle, String courseCode, int courseCredit) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseCredit = courseCredit;
    }
}
