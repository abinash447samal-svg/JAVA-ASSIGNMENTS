import java.util.Scanner;

class Q8 {

    // Function to calculate BMI
    public double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (meters): ");
        double height = sc.nextDouble();

        Q8 obj = new Q8();
        double bmi = obj.calculateBMI(weight, height);

        System.out.println("BMI = " + bmi);

        // Category check
        if(bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if(bmi < 25) {
            System.out.println("Category: Normal");
        } else if(bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }
    }
}