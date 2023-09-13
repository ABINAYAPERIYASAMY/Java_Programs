//package Abinaya;
import java.util.*;
public class ToDeleteDuplicateElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
	for(int i=0;i<n;i++)
	{
	    for(int j=i+1;j<n;)
	    {
	        if(arr[j]==arr[i])
	        {
	            for(int k=j;k<n-1;k++)
	            {
	                arr[k]=arr[k+1];
	            }
	            n--;
	        }
	        else
	        j++;
	    }
	}
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	}
}
