import java.util.Scanner;
public class calculator
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter:");
        int a = s.nextInt();
        String op =  s.next();
        int b = s.nextInt();
        if (op.equals("+")) {
            int sum = a + b;
            System.out.println("the sum is: " +sum);
        } else if (op.equals("-")) {
            int diff = a - b;
            System.out.println("the difference is: " +diff);
        } else if (op.equals("*")){
            int mult = a * b;
            System.out.println("the product is: " +mult);
        } else if (op.equals("/")){
            int div = a/b;
            System.out.println("the quotient is: " +div);
        } else if (op.equals("%")){
            int mod = a%b;
            System.out.println("the remainder is: " +mod);
        }
    }
}
