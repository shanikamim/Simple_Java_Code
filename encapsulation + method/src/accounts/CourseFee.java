
package accounts;
import course.CourseInfo;

public class CourseFee extends CourseInfo{
    double courseFeeAmount;
    
    public double calculateCourseFee(){
        if(this.courseCredit==1){
            return 3000.0;
        }else if(this.courseCredit==3){
            return (3*3000.0);
        }
        
        return 0.0;
    }
}
