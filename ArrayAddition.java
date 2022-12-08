import java.util.Scanner;
class ArrayAddition{
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);
		int row,column;
		System.out.print("Enter the no of rows : ");
		row=sc.nextInt();
		System.out.print("\nEnter the no of columns : ");
		column=sc.nextInt();
		int[][] array1=new int[row][column];
		int[][] array2=new int[row][column];
		System.out.print("Enter the Array 1 : \n");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				array1[i][j] = sc.nextInt();
			}
		}
		System.out.print("\nEnter the Array 2 : \n");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				array2[i][j] = sc.nextInt();
			}
		}
		System.out.print("Addition of Two Array  : \n");
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print((array1[i][j]+array2[i][j])+" ");
			}
			System.out.println("");
		}
	}
}