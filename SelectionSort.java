import java.util.Scanner;
public class SelectionSort{
    public static void sort(int [] array, int N){
        for(int i = 0 ; i < N; i++){
            boolean swapped = false;
            int minimumIndex = i;
            for(int j = i+1; j < N; j++){
                if(array[j]<array[minimumIndex]){
                    minimumIndex = j;
                    swapped = true;
                }
            }
            // if minimum index is swapped then swap the elements else no need to swap the elements
            if(swapped){
                int temp = array[i];
                array[i] = array[minimumIndex];
                array[minimumIndex] = temp;
                System.out.println(array[minimumIndex]+" "+array[i]);
            }
        }
    }
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array : ");
        int N = sc.nextInt();
        System.out.println("\nEnter the array elements");
        int[] array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }
        SelectionSort.sort(array,N);
        System.out.println("Array sorted in Selection Sort Method : ");
        for(int i : array){
            System.out.print(i+" ");
        }
    } 
}