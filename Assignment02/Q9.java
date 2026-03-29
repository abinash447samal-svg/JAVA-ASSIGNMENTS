import java.util.Scanner;

class Q9 {

    // Recursive function to find factorial
    public int fact(int n) {
        if(n == 0 || n == 1) {
            return 1; // base case
        }
        return n * fact(n - 1); // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Q9 obj = new Q9();
        int result = obj.fact(num);

        System.out.println("Factorial = " + result);
    }
}