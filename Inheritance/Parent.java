/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Shanzida Anika Mim
 */
public class Parent {
    private int parentVar;
    void P(){
        System.out.println("Parent Class Method.");
    }
    int getParentVar(){
        return parentVar;
    }
    void setParentVar(int parentVar){
        this.parentVar=parentVar;
    }
    
}
