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
        int max = 10;
        int min = 1;
        int chances = 3;
        
        while(!menu){
            System.out.println("Welcome to Higher or Lower! What will you do?");
            System.out.println("-Start Game");
            System.out.println("-Change Settings");
            System.out.println("-End Application");
            System.out.print("What would you like to do? ");
            String menu1 = sc.nextLine();
            
            switch(menu1){
                case "Start Game":
                    range = Math.abs(min) + Math.abs(max);
                    int rand = (int) Math.floor(Math.random()*range) + min;
                    System.out.println("You have " + chances + " guesses left. What is your guess? ");
                    int guess = sc.nextInt();
                    chances --;
                    
                    while(chances!=0){
                        if (guess == rand){
                            System.out.println("You got it!");
                            break;
                        }
                        else if (guess < rand && min < guess && guess < max){
                            System.out.println("Guess higher! You have " + chances + " guess(es) left. What is your guess? ");
                            guess = sc.nextInt();
                            chances --;
                        }
                        else if (guess > rand && min < guess && guess < max){
                            System.out.println("Guess lower! You have " + chances + " guess(es) left. What is your guess? ");
                            guess = sc.nextInt();
                            chances --;
                        }
                        else {
                            System.out.println("You have " + chances + " guess(es) left. Your guess may have been invalid or not within the range of possible numbers.");
                            guess = sc.nextInt();
                            chances --;
                        }
                    }
                    
                    if (chances == 0){
                        System.out.println("Sorry, but you've failed to guess the number!");
                    }
                    
                    break;
                    
                case "Change Settings":
                    System.out.println("What is the minimum value? ");
                    min = sc.nextInt();
                    System.out.println("What is the maximum value? ");
                    max = sc.nextInt();
                    System.out.println("How many guesses do you want? ");
                    chances = sc.nextInt();
                    
                    break;
                    
                case "End Application":
                   menu = true;  
                   
                   break;
            }              
        }             
    }
}
   
