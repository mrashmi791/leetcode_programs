/**
 * 
 * 
 * 
 * Given a m * n matrix mat of ones (representing soldiers) and zeros (representing civilians), return the indexes of the k weakest rows in the matrix ordered from the weakest to the strongest.

A row i is weaker than row j, if the number of soldiers in row i is less than the number of soldiers in row j, or they have the same number of soldiers but i is less than j. Soldiers are always stand in the frontier of a row, that is, always ones may appear first and then zeros.

 

Example 1:

Input: mat = 
[[1,1,0,0,0],
 [1,1,1,1,0],
 [1,0,0,0,0],
 [1,1,0,0,0],
 [1,1,1,1,1]], 
k = 3
Output: [2,0,3]
Explanation: 
The number of soldiers for each row is: 
row 0 -> 2 
row 1 -> 4 
row 2 -> 1 
row 3 -> 2 
row 4 -> 5 
Rows ordered from the weakest to the strongest are [2,0,3,1,4]

 * 
 * 
 * 
 */

package learning_programs.leetcode.practice;

import java.util.Scanner;

public class KWeakestRowInMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = m;
		int mat[][] = new int[m][n];
		for(int i = 0;i < m;i++) {
			for(int j = 0;j < n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int k = sc.nextInt();
		int[] rows = kWeakestRows(mat,k);
		for(int  i = 0 ; i < rows.length;i++) {
			System.out.print(rows[i]+" ");
		}
		
	}

	private static int[] kWeakestRows(int[][] mat, int k) {
		int result[] = new int[k];
		int rows = mat.length;
		int soldier[] = new int[rows];
		
		for(int i = 0;i < soldier.length;i++) {
			int count = 0;
			for(int j = 1;j < mat[i].length && mat[i][j]==1;j++) {
				count++;
			}
			soldier[i]= count;
		}
		
		for(int i = 0; i < k ;i++ ) {
			int smallIndex = 0;
			for(int j = 1; j < soldier.length; j++) {
				if(soldier[j] < soldier[smallIndex]) {
					smallIndex = j;
				}
			}
			result[i] = smallIndex;
			soldier[smallIndex] = Integer.MAX_VALUE;
			
			
		}
		return result;
		
	}

}
