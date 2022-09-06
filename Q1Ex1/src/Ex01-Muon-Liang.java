/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Elijah James
 */
public class Q1Ex1 {

    public static void main(String[] args) {
        String name = "Josie";
        int age = 13;
        double gwa = 1.25d;
        
        String name1 = "Marie";
        int age1 = 16;
        double gwa1 = 1.00d;
        
        String name2 = "Alphonso";
        int age2 = 14;
        double gwa2 = 1.50d;
        
        System.out.println("Student 1");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Math GWA: " + gwa);
        System.out.println();
        
        System.out.println("Student 2");
        System.out.println("Name: " + name1);
        System.out.println("Age: " + age1);
        System.out.println("Math GWA: " + gwa1);
        System.out.println();
        
        System.out.println("Student 3");
        System.out.println("Name: " + name2);
        System.out.println("Age: " + age2);
        System.out.println("Math GWA: " + gwa2);
        System.out.println();
        
        System.out.println("The average Math GWA of the three is " + (gwa+gwa1+gwa2)/3); //operation: sum and division
        System.out.println(name + " is the youngest student among the three: " + (age<age1 && age<age2)); //operation: comparison
        System.out.println(name2 + " has the highest Math GWA in the group: " + (gwa2<gwa && gwa2<gwa1)); //operation: comparison
    }
    
}
