/*
Aravind went to a forest, he stuck inside the forest and He is blind.
The forest is given as a square grid. The forest grid is filled with trees 
and empty cells. He can move upwards, downwadrs, left and right, 
but he cannot stop until he touches the tree. Once he touches a tree, 
he can choose the next direction to move. Intially Aravind is at poistion A, 
and he is trying to reach a safe-point at position S.

You will be given the forest grid filled with 1's and 0's, 1 means tree 
and 0 means empty cell. And initial position of Aravind, safe-point S.

Your task is to find the minimum distance travelled by Aravind to reach 
the safe-point, If he cannot stop at the safe-point, return -1.

You may assume that the borders of the forest are all trees.


Input Format:
-------------
Line-1: An integer N, size of the grid.
Next N lines: N space separated integers
Next line:  two space separated integers, initial position of Aravind
Next line:  two space separated integers, position of safe-point.

Output Format:
--------------
Print an integer, minimum distance travelled by Aravind to reah safe-point.


Sample Input-1:
---------------
5
0 1 0 0 0
0 0 0 0 0
0 0 0 1 0
1 1 0 0 1
0 0 0 0 0
2 4
4 0

Sample Output-1:
----------------
10

Explanation:
------------
For Picture look at hint.
The minimum path is : up -> left -> down -> left.

Sample Input-2:
---------------
5
0 1 0 0 0
0 0 0 0 0
0 0 0 1 0
1 1 0 0 1
0 0 0 0 0
0 3
3 3

Sample Output-2:
----------------
-1

Explanation: 
------------
Aravind cannot stop at safe-point.


==== Testcases ====
case =1
input =5
0 1 0 0 0
0 0 0 0 0
0 0 0 1 0
1 1 0 0 1
0 0 0 0 0
2 4
4 0
output =10

case =2
input =5
0 1 0 0 0
0 0 0 0 0
0 0 0 1 0
1 1 0 0 1
0 0 0 0 0
0 3
3 3
output =-1

case =3
input =5
0 0 1 0 0
0 0 0 0 0
0 0 0 1 0
1 1 0 1 1
0 0 0 0 0
0 4
4 4
output =12

case =4
input =6
0 1 0 0 0 0
0 0 0 1 0 0
0 1 0 0 0 1
0 0 1 0 0 0
0 0 0 1 0 0
0 1 0 0 0 1
1 5
4 0
output =10

case =5
input =6
0 1 0 0 0 0
0 0 0 1 0 0
0 1 0 0 0 1
0 0 1 0 0 0
0 0 0 1 0 0
0 1 0 0 0 1
1 5
0 0
output =14

case =6
input =6
0 1 0 0 0 0
0 0 0 1 0 0
0 1 0 0 0 1
0 0 1 0 0 0
0 0 0 1 0 0
0 1 0 0 0 1
3 3
1 5
output =6

case =7
input =8
0 1 0 0 0 0 1 0
1 0 0 0 0 0 0 0
0 0 0 0 1 0 0 1
0 1 0 1 1 0 0 0
0 0 0 0 1 0 1 0
0 0 0 0 0 0 0 0
0 1 1 0 0 1 1 0
0 0 1 0 0 0 0 0
7 5
2 3
output =13

case =8
input =8
0 1 0 0 0 0 1 0
1 0 0 1 0 0 0 0
0 0 0 0 1 0 0 1
0 1 0 1 1 0 0 0
0 0 0 0 1 0 1 0
0 0 0 0 0 0 0 0
0 1 1 0 0 1 1 0
0 0 1 0 0 0 0 0 
1 7
3 7
output =14

*/


import java.util.*;

public class Forest {
    class Point {
        int x,y,l;
        public Point(int _x, int _y, int _l) {x=_x;y=_y;l=_l;}
    }
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int m=maze.length, n=maze[0].length;
        int[][] length=new int[m][n]; // record length
        for (int i=0;i<m*n;i++) length[i/n][i%n]=Integer.MAX_VALUE;
        int[][] dir=new int[][] {{-1,0},{0,1},{1,0},{0,-1}};
        PriorityQueue<Point> list=new PriorityQueue<>((o1,o2)->o1.l-o2.l); // using priority queue
        list.offer(new Point(start[0], start[1], 0));
        while (!list.isEmpty()) {
            Point p=list.poll();
            if (length[p.x][p.y]<=p.l) continue; // if we have already found a route shorter
            length[p.x][p.y]=p.l;
            for (int i=0;i<4;i++) {
                int xx=p.x, yy=p.y, l=p.l;
                while (xx>=0 && xx<m && yy>=0 && yy<n && maze[xx][yy]==0) {
                    xx+=dir[i][0];
                    yy+=dir[i][1];
                    l++;
                }
                xx-=dir[i][0];
                yy-=dir[i][1];
                l--;
                list.offer(new Point(xx, yy, l));
            }
        }
        return length[destination[0]][destination[1]]==Integer.MAX_VALUE?-1:length[destination[0]][destination[1]];
    }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Forest f=new Forest();
		int n=sc.nextInt();
		int start[]=new int[2];
		int destination[]=new int[2];
		int maze[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				maze[i][j]=sc.nextInt();
		start[0]=sc.nextInt();
		start[1]=sc.nextInt();
		destination[0]=sc.nextInt();
		destination[1]=sc.nextInt();
		int distance=f.shortestDistance(maze,start,destination);
	
		if(distance > 0)
			System.out.println(distance);
		else
			System.out.println("-1");
	}
}