/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;


public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws CustomException {
        if(age<0)throw new CustomException("Age cannot be less than 0 !");
        else{
            this.name = name;
            this.age = age; 
            System.out.println("Person created !");
        }      
    }
}
