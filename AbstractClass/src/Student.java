
public class Student extends Person {

    int ID;
   void showName()
   {
       System.out.print(name);
   }

    void showInfo() {
        super.showName();
        System.out.println(age);
        System.out.println(ID);
    }

   
    void showAge() {
       System.out.println(age);
    }
}
