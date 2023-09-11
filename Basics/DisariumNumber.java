import java.util.*;
public class DisariumNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digit=0;
		int temp=n;
		int r,sum=0;
		while(temp!=0)
		{
		    temp/=10;
		    digit++;
		}
		temp=n;
		while(temp!=0)
		{   int power=1;
		    r=temp%10;
		    int i=digit;
		    while(i>0)
		    {
		    power=power*r;
		    i--;
		    }
		    sum+=power;
		    temp/=10;
		    digit--;
		}
		System.out.println("Sum is "+sum);
		if(n==sum)
		System.out.println("Disarium number");
		else
		System.out.println("Not a Disarium number");
	}

}
