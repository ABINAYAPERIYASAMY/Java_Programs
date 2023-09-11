import java.util.*;
public class StrongNumber {
	public static void main(String[] args) {
		// example 145 is a strong number [sum of each digit fac =given num]
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rem,sum=0,fac;
        while(num!=0)
        {   fac=1;
            rem=num%10;
            for(int i=1;i<=rem;i++)
            {
                fac=fac*i;
            }
            sum=sum+fac;
            num/=10;
        }
        if(temp==sum)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
	}

}
