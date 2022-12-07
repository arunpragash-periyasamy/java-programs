import java.util.Scanner;
class TwoDArray{
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);
		int row,column;
		System.out.print("Enter the no of rows: ");
		row=sc.nextInt();
		System.out.print("\nEnter the no of columns: ");
		column=sc.nextInt();
		System.out.print("\nEnter the Elements of the matrix: ");
		int[][] array = new int[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				array[i][j]=sc.nextInt();
			}
		}
		System.out.print("The Given "+row+"X"+column+" Matrix: \n");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println("");
		}
	}
} 