/*
A merchant has two types of idols, gold and silver.
He has arranged the idols in the form of m*n grid, 
	- the gold idols are represented as 1's 
	- the silver idols are represented as 0's.

Your task is to find the longest consecutive arrangement of gold idols, 
The arrangement can be either horizontal, vertical, diagonal or 
antidiagonal, but not the combination of these.


Input Format:
-------------
Line-1: Two space separated integers m and n, grid size.
Next m lines : n space separated integers, arrangement of idols.

Output Format:
--------------
Print an integer, longest arranement of gold idols.


Sample Input:
---------------
4 5
1 0 1 1 1
0 1 0 1 0
1 0 1 0 1
1 1 0 1 1

Sample Output:
----------------
4


==== Testcases ====
case =1
input =4 5
1 0 1 1 1
0 1 0 1 0
1 0 1 0 1
1 1 0 1 1
output =4

case =2
input =5 7
1 1 1 1 0 1 0
0 1 1 1 0 0 0
0 1 1 1 0 1 1
1 1 0 0 1 1 1
1 0 0 0 0 1 1
output =5

case =3
input =10 7
0 1 0 1 1 0 1
0 1 0 1 0 0 0
0 0 0 1 0 0 1
1 1 1 1 0 1 1
0 1 1 1 1 0 0
1 1 1 1 0 1 0
1 0 0 0 1 1 1
1 0 1 1 1 0 0
0 1 1 1 1 0 0
1 0 1 0 0 1 1
output =6

case =4
input =10 10
0 0 0 1 0 1 0 1 1 1
1 0 1 0 1 1 0 1 1 0
1 0 1 1 1 0 1 1 1 0
0 1 0 0 0 0 1 1 1 1
1 1 1 1 1 1 1 0 0 1
1 0 1 1 1 1 1 1 1 1
0 1 1 1 0 0 1 0 0 1
0 0 1 1 1 1 1 1 1 1
0 1 1 1 0 0 0 0 0 0
0 1 0 1 0 1 1 0 1 0
output =9

case =5
input =10 15
1 1 1 0 0 0 1 1 0 1 0 0 1 0 0
0 1 0 1 0 1 1 0 1 0 0 0 1 1 0
1 0 1 0 0 1 0 1 1 1 0 0 0 1 1
1 1 1 0 0 0 0 1 0 1 0 1 1 0 0
0 1 1 0 1 0 1 1 0 0 1 1 1 0 0
0 0 1 0 0 0 1 0 0 1 1 1 1 0 1
0 0 0 0 1 1 1 0 1 0 1 1 0 1 1
1 0 1 1 1 0 1 1 0 0 1 1 0 1 1
1 0 1 0 0 1 1 0 1 0 0 1 0 1 0
1 0 0 1 1 0 0 1 0 0 0 0 0 1 1
output =6

case =6
input =10 15
0 1 0 1 1 1 1 1 0 1 1 0 0 1 0
1 0 1 0 0 0 0 1 1 1 0 0 0 0 1
1 1 0 0 1 0 0 0 1 1 0 1 1 0 0
1 0 0 1 0 0 1 1 1 0 0 0 0 1 0
1 1 1 0 0 1 0 0 0 1 0 1 1 1 1
1 0 0 0 0 0 1 0 1 0 0 1 1 1 0
1 0 1 1 1 0 1 0 1 1 0 0 1 0 0
1 1 1 1 0 1 0 0 0 1 0 0 1 0 1
0 1 1 0 0 1 1 1 1 1 1 0 1 1 1
1 0 1 0 1 1 0 1 0 1 0 1 1 1 0
output =7

case =7
input =20 18
1 0 1 1 0 0 0 0 1 1 1 1 1 1 0 1 1 1
1 1 0 0 1 0 1 0 0 1 0 0 1 1 0 0 1 1
1 0 1 1 1 0 1 0 0 0 0 0 1 1 1 0 1 0
0 1 0 1 0 0 1 1 0 0 0 0 1 1 0 0 0 1
0 1 0 0 0 1 0 1 1 0 1 0 0 0 1 1 0 1
1 0 1 1 1 1 0 1 0 1 0 1 1 1 0 0 1 1
0 1 1 0 0 0 0 1 0 0 1 1 1 1 0 1 1 1
0 1 1 0 1 0 1 1 1 0 1 0 1 1 1 1 0 1
1 0 0 0 1 1 0 1 0 1 0 0 1 0 1 0 1 0
1 1 1 0 0 1 1 0 1 1 1 1 1 0 1 0 0 1
0 1 1 0 0 1 1 0 0 1 1 1 0 1 0 1 1 1
1 0 1 1 0 1 0 0 0 1 1 1 0 0 1 0 0 1
1 0 0 1 0 0 1 0 0 1 0 0 1 1 1 1 1 1
1 1 1 1 0 1 0 1 1 1 1 0 1 0 1 1 1 0
1 0 1 0 0 1 1 0 0 1 0 0 1 0 0 1 1 1
1 0 1 0 1 0 1 0 0 0 0 1 0 0 1 1 1 1
1 0 1 0 1 0 1 0 0 0 1 0 1 1 0 1 0 1
1 1 0 1 1 1 1 1 1 1 1 1 1 0 0 0 0 0
0 0 1 0 0 0 1 1 0 0 0 0 0 0 1 1 0 0
0 0 1 0 0 1 0 0 0 1 0 0 1 0 1 1 0 0
output =10

case =8
input =20 30
0 0 0 0 1 1 1 1 0 1 1 0 0 0 1 0 0 1 1 1 0 0 0 1 1 0 1 0 0 1
0 0 0 0 0 0 1 0 1 0 1 0 0 1 1 0 1 1 1 1 0 1 0 0 0 1 1 0 0 0
0 1 1 0 0 1 0 1 0 0 1 1 1 1 0 0 0 0 1 0 1 0 1 0 1 0 1 1 0 1
0 1 1 0 1 1 0 1 1 0 0 1 0 0 0 0 1 1 0 0 1 1 1 1 0 0 1 1 1 1
1 0 1 0 1 1 1 1 1 0 0 1 1 0 0 1 0 1 1 1 1 1 1 0 1 0 1 1 1 1
1 0 0 0 1 1 1 0 1 1 0 0 1 1 0 1 1 0 1 0 0 0 0 1 0 0 0 1 1 1
0 1 0 1 1 1 1 1 0 0 1 0 1 0 0 0 1 0 1 0 0 0 0 1 0 0 0 0 0 0
1 1 0 0 0 1 0 1 0 0 1 1 1 0 0 0 1 0 1 0 1 1 1 1 1 1 1 0 0 0
0 1 0 0 1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 0 0 0 0 1 0
1 0 0 0 1 0 1 0 0 1 1 0 0 1 0 0 1 1 0 1 0 0 0 1 1 1 1 1 1 1
1 0 0 1 0 0 0 0 0 1 0 1 0 1 0 0 0 0 0 0 0 0 0 1 0 1 1 1 0 0
1 1 0 0 0 0 0 0 0 0 0 1 0 0 0 1 0 0 1 0 0 0 0 0 1 1 1 1 1 1
0 1 0 0 1 1 1 0 1 1 1 0 1 1 1 1 1 1 0 0 1 1 1 0 1 1 1 0 1 0
0 1 0 0 0 1 1 0 0 0 1 1 0 1 0 1 0 1 1 1 1 1 1 1 0 0 0 1 1 1
1 0 1 0 0 0 0 1 0 0 1 1 0 1 1 1 1 0 0 1 1 0 1 0 0 0 1 0 0 0
0 0 0 0 1 0 0 1 1 1 1 0 0 1 0 1 0 1 0 1 1 1 1 0 0 1 1 1 1 0
0 0 1 1 1 1 1 0 1 1 1 0 1 1 1 0 0 1 1 1 1 0 1 0 1 0 0 0 1 1
1 1 0 0 1 1 1 0 0 0 0 0 1 1 1 0 0 0 1 0 1 1 0 1 1 1 0 0 0 0
1 0 1 1 0 0 0 1 0 1 1 1 0 0 0 0 0 0 0 1 1 1 0 1 0 1 1 0 0 0
1 0 1 0 0 1 1 0 0 1 0 1 0 1 1 0 1 1 0 0 1 0 0 1 1 0 1 0 1 0
output =11

*/

import java.util.Scanner;

class LongestLine {
  public static int longestLine(int[][] M) {
    if (M.length == 0) 
		return 0;
    
	int ones = 0;
    int[][] dp = new int[M[0].length][4];
    for (int i = 0; i < M.length; i++) {
      int old = 0;
      for (int j = 0; j < M[0].length; j++) {
        if (M[i][j] == 1) {
          dp[j][0] = j > 0 ? dp[j - 1][0] + 1 : 1;
          dp[j][1] = i > 0 ? dp[j][1] + 1 : 1;
          int prev = dp[j][2];
          dp[j][2] = (i > 0 && j > 0) ? old + 1 : 1;
          old = prev;
          dp[j][3] = (i > 0 && j < M[0].length - 1) ? dp[j + 1][3] + 1 : 1;
          ones = Math.max(ones, Math.max(Math.max(dp[j][0], dp[j][1]), Math.max(dp[j][2], dp[j][3])));
        } else {
          old = dp[j][2];
          dp[j][0] = dp[j][1] = dp[j][2] = dp[j][3] = 0;
        }
      }
    }
    return ones;
  }
  
  public static void main(String args[])
  {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				arr[i][j]=sc.nextInt();
		System.out.println( longestLine(arr));
  }
}