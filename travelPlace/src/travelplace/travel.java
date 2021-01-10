/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelplace;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class travel {
    String food;
    String transport;
    
    public static void food(){
        System.out.println("This continent have very delicious food!!");
    }
    
    public static void transport(){
        System.out.println("Many transportation!!");
    }
    
    public static void totPerson(){   //exception handling
        Scanner v1 = new Scanner(System.in);
        System.out.println("Please enter no. of traveler : ");
        int size = v1.nextInt();
        if(size==3||size==4||size==5){
            System.out.println("You may proceed. Thank you!! ");   
        }
        else{
            throw new ArithmeticException("You've input the wrong number.");
        }
    }
    
    void sum(int single, int queen){
        System.out.println("Room price need to be paid : "+ (single+queen));
    }
    void sum(int single, int queen, int twin){
        System.out.println("Room price need to be paid : "+ (single+queen+twin));
    }
    
}
