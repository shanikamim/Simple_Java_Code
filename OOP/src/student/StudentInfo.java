
package student;

import common.Person;

public class StudentInfo extends Person{
    public String Id;
    private String contactNumber;
    protected String address;
    
    
    public void StudentInfo(String id, String address){
        this.Id = id;
        this.address = address;
    }
    
    public void StudentInfo(String id){
        this.Id = id;
    }
    
    public void StudentInfo(String id, String contactNumber, 
            String address){
        this.Id = id;
        this.address = address;
        this.contactNumber = contactNumber;
    }
    
    public void setContactNumber(String number){
        this.contactNumber = number;
    }
    
    public String getContactNumber(){
        return this.contactNumber;
    }
    
    public String getFullName(){
        return this.fullName;
    }
    public String getDepartment(){
        return this.department;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public int getAge(){
        return this.age;
    }
}
