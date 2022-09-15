/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex2;

/**
 *
 * @author MUON
 */
import java.util.Scanner;

public class Q1Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menu=false;
        int range;
        int max1 = 10;
        int min1 = 1;
        int numGuesses = 3;
        int chances1 = 3;
        
        while(!menu){
            System.out.println("Welcome to Higher or Lower! What will you do?");
            System.out.println("-Start Game");
            System.out.println("-Change Settings");
            System.out.println("-End Application");
            System.out.print("What would you like to do? ");
            String menu1 = sc.nextLine();
            
            switch(menu1){
                case "Start Game":
                    chances1 = numGuesses;
                    range = Math.abs(min1) + Math.abs(max1);
                    int rand = (int) Math.floor(Math.random()*range) + min1;
                    System.out.println("You have " + chances1 + " guesses left. What is your guess? ");
                    String guess = sc.nextLine();
                    int guess1 = Integer.parseInt(guess);
                    chances1 --;
                    
                    while(chances1!=0){
                        if (guess1 == rand){
                            System.out.println("You got it!");
                            System.out.println();
                            break;
                        }
                        else if (guess1 < rand && min1 < guess1 && guess1 < max1){
                            System.out.println("Guess higher! You have " + chances1 + " guess(es) left. What is your guess? ");
                            guess = sc.nextLine();
                            guess1 = Integer.parseInt(guess);
                            chances1 --;
                        }
                        else if (guess1 > rand && min1 < guess1 && guess1 < max1){
                            System.out.println("Guess lower! You have " + chances1 + " guess(es) left. What is your guess? ");
                            guess = sc.nextLine();
                            guess1 = Integer.parseInt(guess);
                            chances1 --;
                        }
                        else {
                            System.out.println("You have " + chances1 + " guess(es) left. Your guess may have been invalid or not within the range of possible numbers.");
                            guess = sc.nextLine();
                            guess1 = Integer.parseInt(guess);
                            chances1 --;
                        }
                    }
                    
                    if (chances1 == 0){
                        System.out.println("Sorry, but you've failed to guess the number!");
                        System.out.println();
                    }
                    
                    break;
                    
                case "Change Settings":
                    System.out.println("What is the minimum value? ");
                    String min = sc.nextLine();
                    min1 = Integer.parseInt(min);
                    System.out.println("What is the maximum value? ");
                    String max = sc.nextLine();
                    max1 = Integer.parseInt(max);
                    System.out.println("How many guesses do you want? ");
                    String chances = sc.nextLine();
                    chances1 = Integer.parseInt(chances);
                    System.out.println();
                    
                    break;
                    
                case "End Application":
                   menu = true;  
                   
                   break;
                   
                default:
                    System.out.println();
                   
                   break;
            }              
        }             
    }
}