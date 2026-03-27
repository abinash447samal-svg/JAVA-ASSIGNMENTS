import java.util.Scanner;
class Q6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        int count =0;
        while(a!=0){
            a = a/10;
            count++;
        }
        System.out.println("The number of the digit is:"+count);
    }
}