//Given a number n, print a centered diamond

import java.util.Scanner;
public class Centered_Diamond {
	public static void main(String args[])
	{
		int number,i,k,j,odd=1,a;
		Scanner in=new Scanner(System.in); 
		System.out.println("enter number");
		number=in.nextInt();
		
        System.out.println("the number is " +number);
        for(i=1;i<=number;i++)
        {
        	//k is the number of spaces
        	for(k=1;k<=number-i;k++)
        	{
        		
        		System.out.print(" ");
        		
        	}
        	for(j=1;j<=odd;j++)
        	{
        	System.out.print("*");
            }
        	
        	System.out.println(" ");
        	odd=odd+2;
	  }
        a=odd-4;
        for(i=number-1;i>=1;i--)
        	{
        	for(k=1;k<=number-i;k++)
        	{
        		
        		System.out.print(" ");
        		
        	}
        	for(j=1;j<=a;j++)
        	{
        	System.out.print("*");
            }
        	
        	System.out.println(" ");
        	a=a-2;
        	
        }
        
        in.close();
	}
}
