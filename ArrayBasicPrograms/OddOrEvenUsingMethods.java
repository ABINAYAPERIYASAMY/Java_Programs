//package Abinaya;
//input: 4                   Output: EVEN: 2 4
//      2 4 3 5                    ODD: 3 5
import java.util.*;
public class OddOrEvenUsingMethods {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]= new int[n];
	     for(int i=0;i<arr.length;i++)
     {
         arr[i]=sc.nextInt();
         
     }  
         arr=evenodd(arr);
	}
     public static int[] evenodd(int arr[])
    {   
        System.out.print("EVEN: " );
	    for(int i=0;i<arr.length;i++)
	    {
        if(arr[i]%2==0)
     	 System.out.print(arr[i]+" ");
	    }
	    System.out.println("");
        System.out.print("ODD: " );
        for(int i=0;i<arr.length;i++)
     	{	if(arr[i]%2!=0)
     	    System.out.print(arr[i]+" ");
     	}
	    return arr;
	}
}
