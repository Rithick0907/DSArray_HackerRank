/*
Question:
An array is a type of data structure that stores elements of the same type in a contiguous block of memory.
In an array,A, of size N, each memory location has some unique index,i  (where 0<=i<N), that can be referenced as  A[i].
Given an array,A,N of  integers, print each element in reverse order as a single line of space-separated integers

Input Format:
The first line contains an integer,N(the number of integers in A). 
The second line contains N space-separated integers describing A.

Constraints
1.1<=N<10^3
2.1<=A[i]<=10^4,Where A[i] is i integer of A

Output Format
Print all N integers in A in reverse order as a single line of space-separated integers.
*/
package array_in_java;
import java.util.*;
public class Dynamic_array1 {
    public static void main(String[] args)
    {
        int i,arr;
        ArrayList<Integer> arr1=new ArrayList<>();;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr=sc.nextInt();
            arr1.add(arr);
        }
        while(n>0)
        {
            System.out.print(arr1.get(n-1)+" ");
            n--;
        }
    }
}
