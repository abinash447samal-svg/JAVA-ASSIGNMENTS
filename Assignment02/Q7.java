import java.util.Scanner;

class Q7 {

    // Function to convert decimal to binary
    public String toBinary(int num) {
        String binary = "";

        while(num > 0) {
            int rem = num % 2;
            binary = rem + binary; // add at front
            num = num / 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        Q7 obj = new Q7();
        String result = obj.toBinary(num);

        System.out.println("Binary equivalent = " + result);
    }
}