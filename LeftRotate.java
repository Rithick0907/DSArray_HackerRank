//Question in the Bottom of the Code
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotate {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        //My Code Begins
        int i,j,b=0;
        for(i=0;i<d;i++)         //to left rotate that many times
        {
            b=a[0];
            for(j=1;j<n;j++)      //to left rotate 1st Element in array
            {
                a[j-1]=a[j];
            }
            a[n-1]=b;
        }
        for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
        scanner.close();
    }
}
/*
Question:
A left rotation operation on an array of size n shifts each of the array's elements 1 unit
to the left. 
For example, if 2 left rotations are performed on array [1,2,3,4,5], 
then the array would become [3,4,5,1,2].

Given an array of n integers and a number,d, perform d left rotations on the array.
Then print the updated array as a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of 
n(the number of integers) and  d(the number of left rotations you must perform). 
The second line contains n space-separated integers describing the respective elements
of the array's initial state.

Constraints
  1.1<=n<=10^5
  2.1<=d<=n
  3.1<=a[i]<=10^6
 
Output Format

Print a single line of n space-separated integers denoting the final state of the array 
after performing d left rotations.

Sample Input

5 4
1 2 3 4 5

Sample Output
5 1 2 3 4

Explanation
When we perform d=4 left rotations, the array undergoes the following sequence of changes:
[1,2,3,4,5]->[2,3,4,5,1]->[3,4,5,1,2]->[4,5,1,2,3]->[5,1,2,3,4]
Thus, we print the array's final state as a single line of space-separated values, which is 5 1 2 3 4.
*/
