/*
Pramod is working on Strings consist of digits only. He wants to findout, 
whether the given string can form Fibonacci sequence or not.

A String can form a Fibonacci Sequence, if it contains at least 
three numbers, and numbers are in the following order:
first, second, third  = first + second, fourth = third + second, .. so on.

Return true, if the given string can form fibonacci sequence,
otherwise, return false.

Note: Numbers in the fibonacci sequence contains no leading 0's.
for example, 2, 03,5 or 2,3,05 or 02,3,5 are not valid.

Input Format:
-------------
A String consist of digits only

Output Format:
--------------
Print a boolean value as result.


Sample Input-1:
---------------
23581321

Sample Output-1:
----------------
true

Explanation: 
------------
Fibonacci Sequence is : 2, 3, 5, 8, 13, 21
2, 3, 2+3=5, 3+5=8, 5+8=13, 8+13=21.

Sample Input-2:
---------------
199100199

Sample Output-2:
----------------
true

Explanation: 
------------
Fibonacci Sequence is : 1 99 100 199
1, 99, 1+99=100, 99+100=199.


==== Testcases ====
case =1
input =8914423337761098715972584
output =true

case =2
input =199100199
output =true

case =3
input =101102203305508813
output =true

case =4
input =1011022033055
output =false

case =5
input =123456789
output =false

case =6
input =11111122233355588
output =true

case =7
input =1111122233355588
output =false

case =8
input =89144233377610987159725844171
output =false

case =9
input =1012003015018021303210534085513
output =true

case =10
input =101200301501802130302105034085513
output =false

*/

import java.util.*;

public class FibonacciString {
    public boolean isFibonacciString(String num) {
        int n = num.length();
        for (int i = 1; i <= n / 2; ++i)
            for (int j = 1; Math.max(j, i) <= n - i - j; ++j)
                if (isValid(i, j, num)) return true;
        return false;
    }
    private boolean isValid(int i, int j, String num) {
        if (num.charAt(0) == '0' && i > 1) return false;
        if (num.charAt(i) == '0' && j > 1) return false;
        String sum;
        Long x1 = Long.parseLong(num.substring(0, i));
        Long x2 = Long.parseLong(num.substring(i, i + j));
        for (int start = i + j; start != num.length(); start += sum.length()) {
            x2 = x2 + x1;
            x1 = x2 - x1;
            sum = x2.toString();
            if (!num.startsWith(sum, start)) return false;
        }
        return true;
    }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(new FibonacciString().isFibonacciString(s));
	}
}