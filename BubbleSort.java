import java.util.Scanner;
public class BubbleSort{
    public static void sort(int[] array,int N){
        System.out.println(N);
        for(int i=0;i<N-1;i++){
            boolean swapped = false;
            for(int j=0;j<N-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swapped = true;
                }
            }
            // if no swapping is done then don't want to sort further
            if(!swapped)
                break;
        }
    }
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int N = sc.nextInt();
        System.out.println("Enter the array elements to sort:");
        int [] array = new int[N];
        for(int i=0;i<N;i++){
            array[i]=sc.nextInt();
        }
        BubbleSort.sort(array,N);
        System.out.println("Sorted array by Bubble Sort Method: ");
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}