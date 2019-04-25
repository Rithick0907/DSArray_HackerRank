package gfg_test;
import java.util.*;
import java.lang.*;

class Height {
	int feet;
	int inches;
	public Height(int ft, int inc)
	{
	    feet = ft;
	    inches = inc;
	}
}
public class GfG
{
    public static int findMax(Height arr[], int n)
    {
        int[] a=new int[10];
        int ans=0,i;
        int b=n;
        if(n>2)
        b=n/2;
        for(i=0;i<b;i++)
        {
            a[i]=arr[i].feet*12+arr[i].inches;
        }
        for(i=0;i<b;i++)
        {
            if(a[i]>a[i+1])
            ans=a[i];
            else
            ans=a[i+1];
        }
        return ans;
    }
    public static void main(String[] args)
    {
     Height[] h=new Height[10];
     GfG g=new GfG();
     Scanner sc=new Scanner(System.in);
     int n,i,feet,inches;
     int ans,ans1;
     n=sc.nextInt();
     System.out.println(n);
     for(i=0;i<n;i++)
     {
         feet=sc.nextInt();
         inches=sc.nextInt();
         h[i]=new Height(feet,inches);
     }
     ans=g.findMax(h,n);
     n=(int)Math.pow(2,n);
     System.out.println(n);
     for(i=0;i<n;i++)
     {
         feet=sc.nextInt();
         inches=sc.nextInt();
         h[i]=new Height(feet,inches);
     }
     ans1=g.findMax(h,n);
     System.out.println(ans);
     System.out.println(ans1);
    }    
}
