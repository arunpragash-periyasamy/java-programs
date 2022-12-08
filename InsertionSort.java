import java.util.Scanner;
public class InsertionSort{
    public static void sort(int[] array, int N){
        int count = 0;
        for(int i = 1; i < N; i++){
            // optimized code for insertion sort
            int key = array[i];
            int j = i-1;
            while( j >= 0 && key < array[j]){
                array[j+1]=array[j];
                --j;
            }
            array[j+1]=key;

            // normal code for insertion sort

            // for(int j = i; j > 0; j--){
            //     if(array[j] < array[j-1]){
            //         int temp = array[j];
            //         array[j] = array[j-1];
            //         array[j-1] = temp;
            //     }
            //     count++;
            // }
        }
        System.out.println("Count : "+count);
    }
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array : ");
        int N = sc.nextInt();
        int [] array = new int[N];
        System.out.println("Enter the array element : ");
        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }
        InsertionSort.sort( array, N);
            System.out.println("Sorted Array Using Insertion Sort");
        for(int i : array){
            System.out.print(i+" ");
        }
    }
}