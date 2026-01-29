import java.util.*;
class MatrixMultiplication {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		
        int[][] matrix1 = new int[row][col];
        for(int i = 0;i<row;i++) {
        	for(int j = 0;j<col;j++) {
        		matrix1[i][j] = scan.nextInt();
        	}
        }
        
        int[][] matrix2 = new int[row][col];
        for(int i = 0;i<row;i++) {
        	for(int j = 0;j<col;j++) {
        		matrix2[i][j] = scan.nextInt();
        	}
        }
        
         int[][] matrix3 = new int[row][col];
         
         for (int i = 0; i < matrix1.length; i++) {
             for (int j = 0; j < matrix1[i].length; j++) {
                 for (int k = 0; k < matrix1[j].length; k++) {
                     matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                 }
             }
         }
         for(int i = 0;i<row;i++) {
         	for(int j = 0;j<col;j++) {
         		System.out.print(matrix3[i][j] + " ");
         	}
         	System.out.println();
         }
         scan.close();
	}

}
