/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;


public class CustomException extends Exception{
    CustomException(String s){
        super(s);
        System.out.println(s);
    }
}
