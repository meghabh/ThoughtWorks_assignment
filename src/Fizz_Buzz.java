//FizzBuzz Exercise

import java.util.Scanner;
public class Fizz_Buzz {
	
	public static void main(String args[])
	{
		int number,i,x,y;
		Scanner in=new Scanner(System.in);
System.out.println("enter number");
number=in.nextInt();
System.out.println("the number is "+number);
for(i=1;i<=number;i++)
{
x=i%3;
y=i%5;
if(x!=0 && y!=0){
	System.out.println(""+i);
}
if(!(x!=0||y!=0))
	{
	System.out.println("FizzBuzz");
}
else
{
	if(x==0)
	{
		System.out.println("Fizz");
	}
	if(y==0)
	{
	System.out.println("Buzz");
	}
}
		}
	}

}
