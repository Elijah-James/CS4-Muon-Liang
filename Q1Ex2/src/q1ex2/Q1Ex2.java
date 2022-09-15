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
        String guess1, max1, min1, chances1;
        int guess;
        int max = 10;
        int min = 1;
        int chances2 = 3;
        int chances;
        
        while(!menu){
            System.out.println("Welcome to Higher or Lower! What will you do?");
            System.out.println("-Start Game");
            System.out.println("-Change Settings");
            System.out.println("-End Application");
            System.out.print("What would you like to do? ");
            String menu1 = sc.nextLine();
            
            switch(menu1){
                case "Start Game":
                    chances = chances2;
                    range = Math.abs(min) + Math.abs(max);
                    int rand = (int) Math.floor(Math.random()*range) + min;
                    System.out.println("You have " + chances + " guesses left. What is your guess? ");
                    guess1 = sc.nextLine();
                    guess = Integer.parseInt(guess1);
                    chances --;
                    
                    while(chances!=0){
                        if (guess == rand){
                            System.out.println("You got it!");
                            System.out.println();
                            break;
                        }
                        else if (guess < rand && min <= guess && guess <= max){
                            System.out.println("Guess higher! You have " + chances + " guess(es) left. What is your guess? ");
                            guess1 = sc.nextLine();
                            guess = Integer.parseInt(guess1);
                            chances --;
                        }
                        else if (guess > rand && min <= guess && guess <= max){
                            System.out.println("Guess lower! You have " + chances + " guess(es) left. What is your guess? ");
                            guess1 = sc.nextLine();
                            guess = Integer.parseInt(guess1);
                            chances --;
                        }
                        else {
                            System.out.println("You have " + chances + " guess(es) left. Your guess may have been invalid or not within the range of possible numbers.");
                            guess1 = sc.nextLine();
                            guess = Integer.parseInt(guess1);
                            chances --;
                        }
                    }
                    
                    if (chances == 0){
                        System.out.println("Sorry, but you've failed to guess the number!");
                        System.out.println();
                    }
                    
                    break;
                    
                case "Change Settings":
                    System.out.println("What is the minimum value? ");
                    min1 = sc.nextLine();
                    min = Integer.parseInt(min1);
                    System.out.println("What is the maximum value? ");
                    max1 = sc.nextLine();
                    max = Integer.parseInt(max1);
                    System.out.println("How many guesses do you want? ");
                    chances1 = sc.nextLine();
                    chances2 = Integer.parseInt(chances1);
                    System.out.println();
                    
                    break;
                    
                case "End Application":
                   menu = true;  
                   
                   break;
            }              
        }             
    }
}