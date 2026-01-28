import java.util.*;
class SpiralMatrix {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		int matrix[][] = new int[row][col];
		
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		int left = 0,right = matrix[0].length-1;
		int top = 0,bottom = matrix.length-1;
		
		while(top<=bottom && left<=right) {
			for(int i = left;i<=right;i++) {
				System.out.print(matrix[top][i] + " ");
			}
			top++;
	
			
			for(int i = top;i<=bottom;i++) {
				System.out.print(matrix[i][right] + " ");
			}
			right--;
			
			for(int i = right;i>=left;i--) {
				System.out.print(matrix[bottom][i] + " ");
			}
			bottom--;
			
			for(int i = bottom;i>=top;i--) {
				System.out.print(matrix[i][left] + " ");
			}
			left++;
		}
        scan.close();
	}
}
