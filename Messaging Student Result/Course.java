package sms;
public class Course {
    private String name;
    private String code;
    private double credit;

    public Course(String name, String code, double credit) {
        this.name = name;
        this.code = code;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", code=" + code + ", credit=" + credit + '}';
    }
    
}
