package Abinaya;
//string input 7+3          output 10
//7-3                 4
//String calculator
import java.util.*;
public class StringCalculator
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int a=str.charAt(0)-'0';//int a=str.charAt(0)-48;
int b=str.charAt(2)-'0';//int b=str.charAt(2)-48;
char c=str.charAt(1);
switch(c){
case '+':
  System.out.println(a+b);
  break;
case '-':
  System.out.println(a-b);
  break;
case '*':
  System.out.println(a*b);
  break;
case '/':
  System.out.println(a/b);
  break; 
case '%':
  System.out.println(a%b);
  break;
    }
  }
}