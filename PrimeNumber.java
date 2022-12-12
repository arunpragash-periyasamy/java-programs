import java.util.Scanner;
public class PrimeNumber{
    // Method to check whether the number is prime or not
    public static boolean PrimeOrNot(int number){
        if(number == 0 || number == 1)
           return false;
        for(int i = 2; i <= number/2 ; i++){
            if(number%i ==0){
                return false;
            }
        } 
        return true;
    }
    // main method
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether prime number or not: ");
        int number = sc.nextInt();
        boolean result = PrimeNumber.PrimeOrNot(number);
        String res = (result == true) ? "The number "+number+" is prime number" : "The number "+number+" is not prime number"; 
        System.out.println(res);
    }
}