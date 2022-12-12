import java.util.Scanner;
public class Factorial{
    // function to return factorial of a number
    public static int FactorialNumber(int number){
        int result = (number == 0) ? 1 :  (number * FactorialNumber(number-1));
        return result;
    }
    // main function to the factorial
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial of a number : ");
        int number = sc.nextInt();
        int result = Factorial.FactorialNumber(number);
        System.out.println(result);
    }
}