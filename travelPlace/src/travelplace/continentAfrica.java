/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelplace;

/**
 *
 * @author user
 */
public class continentAfrica extends travel {
    String country;
    String island;
    String toString;
    String food1;
    
    public continentAfrica(String country, String island){
        this.country = country;
        this.island = island;
    }
    
    public void setCountry(String country){
    this.country = country;
    }
    public void setIsland(String island){
    this.island = island;
    }
    public String getCountry(){
    return country;
    }
    public String getIsland(){
    return island;
    }
    
    public String toString(){
    return country + island;
    }
    
    public static void food1(){
        System.out.println("Traditional food : Bunny Chow, South Africa");
    }
    
    public void car(){   //polymorphism
        System.out.println("Transport use : Toyota Hilux");
    }
    
    
    
}
