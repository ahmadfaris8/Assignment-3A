/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelplace;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

/**
 *
 * @author user
 */
public class TravelPlace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("/Users/Desktop/Traveller.txt"); 
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = scan.next();
        System.out.println("Where are you from(State) : ");
        String place = scan.next();
        System.out.println("\nThank you " + name + ", from " + place + "!!!" );
        
        
        ArrayList<String> continent = new ArrayList<String>();   //array list
        continent.add("AFRICA");
        continent.add("ASIA");
        continent.add("AUSTRALIA");
        continent.add("EUROPE");
        System.out.println("\nContinent you might consider : " + continent);
        
        System.out.println("\n---AFRICA---");
        continentAfrica cf = new continentAfrica("Seychelles", " Pulau Praslin");
        System.out.println("Africa Continent : " + cf.toString());
        cf.totPerson();
        cf.sum(100, 300, 200);
        cf.food();
        cf.food1();
        cf.car();
        
    
        System.out.println("\n---ASIA---");
        continentAsia1 ca = new continentAsia1("Perak", " Pulau Pangkor");
        System.out.println("Asia Continent : " + ca.toString());
        ca.totPerson();
        ca.sum(100, 300);
        ca.food();
        ca.food2();
        ca.car();
        
        System.out.println("\n---AUSTRALIA---");
        continentAustralia cs = new continentAustralia("Queensland", " Pulau Fraser");
        System.out.println("Australia Continent : " + cs.toString());
        ca.sum(100, 300);
        ca.food();
        cs.food3();
        cs.car();
        cs.temp(); //abstraction methods
        
        System.out.println("\n---EUROPE---");
        continentEurope ce = new continentEurope("Norway", " Pulau Lyngor");
        System.out.println("Europe Continent : " + ce.toString());
        ca.sum(100, 300);
        ce.food();
        ce.car();
        ce.food4();
        
        
       
        
        
        
    }
    
}
