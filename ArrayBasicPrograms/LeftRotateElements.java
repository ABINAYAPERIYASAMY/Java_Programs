//package Abinaya;
import java.util.*;
public class LeftRotateElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter no.of times to rotate left: ");
		int t=sc.nextInt();//no.of times to rotate left
		int[] arr = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{    
		arr[i]=sc.nextInt();  
		}  
		 for(int i = 0; i < t; i++){  
	            int j, first;  
	            //Stores the first element of the array  
	            first = arr[0];  
	            for(j = 0; j < arr.length-1; j++){  
	                //Shift element of array by one  
	                arr[j] = arr[j+1];  
	            }  
	            //First element of array will be added to the end  
	            arr[j] = first;  
	        }  
	        System.out.println();  
	        //Displays resulting array after rotation  
	        System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	        }  
	}
}
