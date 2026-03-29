/*Write a Java program to find the sum of the following series. Take the value of x and n
is user input. Define a function fact(int n) which will calculate the factorial of number
and use this function while calculating the sum.
𝑥2 𝑥3 𝑥4
𝑥𝑛
1 + 𝑥 + + + + ……
2! 3! 4!
𝑛!*/

import java.util.Scanner;

class Q5{

    // Non-static factorial function
    int fact(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // Non-static function to calculate sum
    void calculateSum(int x, int n) {
        double sum = 0;

        for(int i = 0; i <= n; i++) {
            sum = sum + (Math.pow(x, i) / fact(i));
        }

        System.out.println("Sum of the series = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        // Creating object to call non-static methods
        Q5 obj = new Q5();
        obj.calculateSum(x, n);
    }
}