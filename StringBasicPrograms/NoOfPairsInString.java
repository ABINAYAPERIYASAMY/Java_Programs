package Abinaya;
import java.util.*;
	//input               output
	//bbannabbmmnn             6
	//nmamznah                 3
	/*import java.util.*;
	public class Main
	{
	public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	String str=sc.nextLine();
	char arr[]=str.toCharArray();
	int pair=0;

	for(int i=0;i<arr.length;i++)
	{      
	for(int j=i+1;j<arr.length;j++)
	{
	   if(arr[i]!='\0'&& arr[i]==arr[j])
	   {
	       pair++;
	       arr[j]='\0';
	       arr[i]='\0';
	       break;
	   }
	   
	   if(arr[i]=='\0')
	   break;
	}   
	   
	}
	System.out.println(count);
	}
	}*/
	//or
	public class NoOfPairsInString {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String str = input.nextLine();

	char ch[] = str.toCharArray();
	Arrays.sort(ch);
	System.out.println(Arrays.toString(ch));
	int count = 0;
	for(int i=1;i<str.length();i++)
	{
	   if(ch[i] == ch[i-1])
	   {
	       count++;
	       i++;
	   }
	}

	System.out.println(count);
	}
}