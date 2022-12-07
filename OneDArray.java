import java.util.*;
class OneDArray{
	public static void main(String [] a){
		int [] myArray = new int[10];
		Scanner sc = new Scanner(System.in);

		// Getting input from the user
		for(int i=0;i<10;i++){
			System.out.println("Element "+(i+1));
			myArray[i] = sc.nextInt();
		}

		//printing the array elements using for loop
		System.out.println("Array Elements are:");
		for(int i=0;i<10;i++){
			System.out.println("Element "+(i+1)+" : "+myArray[i]);
		}
		System.out.println("\n");

		//printing array elements using For each loop in java
		for(int element : myArray){
			System.out.println(element);
		}
	}
}