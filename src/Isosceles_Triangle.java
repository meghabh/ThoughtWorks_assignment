//Isosceles Triangle
//Given a number n, print a centered triangle. 

import java.util.Scanner;
public class Isosceles_Triangle {
	public static void main(String args[])
	{
		int number,i,k,j,odd=1;
		Scanner in=new Scanner(System.in); 
		System.out.println("enter number");
		number=in.nextInt();
		
        System.out.println("the number is " +number);
        for(i=1;i<=number;i++)
        {
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
        in.close();

	}

}
