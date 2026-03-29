import java.util.Scanner;

class Q10 {

    // Recursive function to find sum of digits
    public int sumDigits(int num) {
        if(num == 0) {
            return 0; // base case
        }
        return (num % 10) + sumDigits(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Q10 obj = new Q10();
        int result = obj.sumDigits(num);

        System.out.println("Sum of digits = " + result);
    }
}