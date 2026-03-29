/*Write a Java program to display the prime numbers between x and y where both x and
y is inclusive.*/

import java.util.Scanner;

class Q4{

    // Non-static function
    boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        PrimeRange obj = new PrimeRange();  // 👈 object created

        System.out.println("Prime numbers are:");

        for (int i = x; i <= y; i++) {
            if (obj.isPrime(i)) {   // 👈 function called using object
                System.out.print(i + " ");
            }
        }
    }
}