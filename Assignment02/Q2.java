/*Write a Java program to take two numbers x and y as input and perform the following
operation using the Math library.
a. Find the maximum between x and y
b. Find the minimum between x and y
c. Find xy
d. Find √𝑥
e. Generate a random number between 10 and 100*/

import java.util.Scanner;
class Q2{
   void claculate(double x , double y){
    double Maximun = Math.max(x,y);
    double Minimum = Math.min(x,y);
    double Power   = Math.pow(x,y);
    double Root    = Math.sqrt(x);

    int Random = (int)(Math.random()*(100-10 +1)) + 10;
     System.out.println("Max is "+Maximun);
     System.out.println("Min is "+Minimum);
     System.out.println("Power is "+Power);
     System.out.println("Root is "+Root);
     System.out.println("Random number :"+Random);
    
   }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number X : ");
    double x = sc.nextDouble();
    System.out.println("Enter the number Y : ");
    double y = sc.nextDouble();

    //object creation
    Q2 obj = new Q2();

    obj.claculate(x,y);

   }

}