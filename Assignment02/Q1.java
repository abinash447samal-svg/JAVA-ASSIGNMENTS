/*Write a Java program to display greetings message for a user. Take the username as
input at run time. Define a method public void greet (String name) to perform the
operation.*/

import java.util.Scanner;
class Q1{
    void greet(String name){
        System.out.println("Hello "+name+" nice to meet you");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        //static → needs object to call non-static
        //object cration 
        Q1 obs = new Q1();
        
        obs.greet(name);
    }
}