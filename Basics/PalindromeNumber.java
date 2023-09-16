package Abinaya;
import java.util.*;
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,sum=0,temp;    
		  temp=n;    
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(temp +" is a Palindrome Number ");    
		  else    
		   System.out.println(temp+" is not a Palindrome Number");  
	}

}
