/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author MUON
 */
public class Singer {
    String name, favoriteSong;
    int noOfPerformances;
    double earnings;
    
    public Singer(String n, String fS, int nOP, double e){
        name = n;
        favoriteSong = fS;
        noOfPerformances = nOP;
        earnings = e;
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
