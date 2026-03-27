import java.util.Scanner;
class Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers "); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("a is largest="+a);
        }
        else if (b>a && b>c){
            System.out.println("b is largest ="+b);
        }
        else{
            System.out.print("c is largest="+c);
        }
    }
}