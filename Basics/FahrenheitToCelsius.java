import java.util.*;
public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        float Fahrenheit=input.nextFloat();
        float Celsius=(Fahrenheit-32)*5/9;
        System.out.println(Celsius);
}
}