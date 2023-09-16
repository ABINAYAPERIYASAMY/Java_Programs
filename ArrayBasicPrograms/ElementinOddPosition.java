//package Abinaya;
import java.util.*;
public class ElementinOddPosition {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();  
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{    
		array[i]=sc.nextInt();  
		}  
		System.out.println("Elements of given array present on odd position: ");  
	    for (int i = 0; i < array.length; i = i+2) {  
	            System.out.print(array[i]+" "); 
	    }
	}
}
