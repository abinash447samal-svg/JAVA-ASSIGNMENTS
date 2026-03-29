/*Write a Java program to perform the operation of a simple calculator (+, -, *, and /)
using a switch case statement. Input two operands and the operator at the run time.*/

import java.util.Scanner;
class Q3{
    void calculator(double a, double b){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operation you want to do( + , - , * , /) : ");

        //char op = sc.next().charAt(0);{takes character}
        String op = sc.next();
        // we can use sc.nextLine but it will take the whhole string with space

        switch(op){
            case "+":
                System.out.println("Sum is "+(a+b));
                break;
            case "-":
                System.out.println("Sub is "+(a-b));
                break;
            case "*":
                System.out.println("Mul is "+(a*b));
                break;
            case "/":
                if(b!=0){
                     System.out.println("Div is "+(a/b));
                }
                else{
                     System.out.println("Error- can't divide by zero");

                }
                 break;
             default:
                System.out.println("invalid choice");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double a = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double b = sc.nextDouble();

        Q3 ob = new Q3();
        ob.calculator(a,b);

    }
}