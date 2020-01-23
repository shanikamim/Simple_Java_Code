
package accounts;
import registration.StudentRegistrationInfo;
import semester.SemesterInfo;
public class StudentAccountInfo extends SemesterInfo{
    double totalAmount;
    double paidAmount;
    double dueAmount;
    
    private int totalCredit(){
        StudentRegistrationInfo regInfo = 
                new StudentRegistrationInfo();
        
        return regInfo.getTotalCredit();
    }
}
