import java.util.Scanner;
public class StringPractice{
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String 1 : ");
        String s1 = sc.nextLine();
        System.out.print("\nEnter the String 2 : ");
        String s2 = sc.nextLine();
        if(s1equals(s2)){
            System.out.println("Two Strings are Equals");
        }
        else{
            System.out.println("Two Strings are not equal");
        }
    }
}