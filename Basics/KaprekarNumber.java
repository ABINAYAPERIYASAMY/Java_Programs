import java.util.*;
public class KaprekarNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sq=n*n;
        int i,count=1;
        if(n==1)
        {
            System.out.print("Kaprekar number");
            count=0;
        }
        int digit=0;
        while(sq!=0)
        {
            digit++;
            sq/=10;
        }
        sq=n*n;
        for(i=1;i<digit;i++)
        {   int sum=0;
            int e=(int)Math.pow(10,i);
            if(e==n)
            {
                continue;
            }
            sum=sq/e+sq%e;
            if(sum==n)
            {
                System.out.print("Kaprekar number");
                count=0;
                break;
            }
        }
        if(count==1)
            System.out.print("Not a Kaprekar number");
	}

}
