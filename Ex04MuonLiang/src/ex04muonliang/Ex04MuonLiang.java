/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04muonliang;

/**
 *
 * @author Elijah James
 */
public class Ex04MuonLiang {
    public static void main(String[] args) {
        Person person1 = new Person("Josie", 20, "Student");
        Person person2 = new Person("Marie", 17, "Student");
        Person person3 = new Person("Alphonso", 25, "Teacher");
        
        Song fav1 = new Song("Lemon", "Kenshi Yonezu");
        Song fav2 = new Song("Lagtrain", "inabakumori");
        
        Singer kenshi = new Singer("Kenshi Yonezu", 0, 0, fav1);
        Singer daoko = new Singer ("Daoko", 0, 0, fav2);
        
        System.out.printf("Person 1 %n" + "Name: %s %n" + "Age: %d %n" + "Occupation: %s %n %n", person1.Name, person1.age, person1.occupation);
        System.out.printf("Person 2 %n" + "Name: %s %n" + "Age: %d %n" + "Occupation: %s %n %n", person2.Name, person2.age, person2.occupation);
        System.out.printf("Person 3 %n" + "Name: %s %n" + "Age: %d %n" + "Occupation: %s %n %n", person3.Name, person3.age, person3.occupation);
        
        kenshi.performForAudience(12);
        
        kenshi.performForAudience(kenshi, daoko);
        
        kenshi.changeFavSong(fav2);
    }
    
}