package Abinaya;
import java.util.*;
public class ToCheckAshAndStarAreEqual {
		public static void main(String[] args) {
			Scanner sc =new Scanner (System.in);
			String str=sc.nextLine();
			char arr[]=str.toCharArray();
			int countash=0,countstar=0;
			for(int i=0;i<str.length();i++)
			{
			        if(arr[i]=='#')
			        {
			            countash++;
			        }
			        if(arr[i]=='*')
			        {
			            countstar++;
			        }
			}
			if(countash==countstar)
			{
			    System.out.println("0");
			}
			else if(countash>countstar)
			{
			    System.out.println("Negative integer");
			}
			else
			System.out.println("Positive integer");
		}
	}
	//or 
	/*import java.util.*;
	public class Main
	{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str=new String("###****");
			int count=0,count1=0;
			for(int i=0;i<str.length();i++)
			{
			    if(str.charAt(i)=='*')
			    count++;
			    else if(str.charAt(i)=='#')
			    count1++;
			}
			System.out.print(count-count1);
		}
	}*/
