/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04muonliang;

import java.util.Scanner;

/**
 *
 * @author Elijah James
 */
public class Singer {
    Scanner sc= new Scanner(System.in);
    
    String Name;
    private static int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    
    public Singer (String N, int nOP, double e, Song fav) {
       Name = N;
       noOfPerformances = nOP;
       earnings = e;
       favoriteSong = fav;
    }
    
    public void performForAudience(int audi) {
        earnings += audi*100;
        noOfPerformances++;
        
        System.out.printf("%s performed for %d people. %n" + "They earned %.2f. The total number of performances of the singers is now %d. %n%n", Name, audi, earnings, noOfPerformances);
    }
    
    public void performForAudience(Singer name1, Singer name2) {
        earnings = earnings/2;
        noOfPerformances++;
        
        System.out.printf("%s performed with %s. %nBoth of them earned %.2f. The total number of performances of the singers is now %d. %n%n", name1.Name, name2.Name, earnings, noOfPerformances);
    }
    
    public void changeFavSong(Song favS) {
        favoriteSong = favS;
        System.out.printf("%s now has a different favorite song. It is %s by %s. %n", Name, favoriteSong.title, favoriteSong.artist);
    }
}
