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
