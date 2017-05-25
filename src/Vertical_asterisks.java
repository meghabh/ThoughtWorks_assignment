//Given a number n, print n lines, each with one asterisks

import java.util.Scanner;
public class Vertical_asterisks {
	public static void main(String args[])
	{
		int number,i;
		Scanner in=new Scanner(System.in); 
		System.out.println("enter the number");
		number=in.nextInt();
		
        System.out.println("the number is " +number);
        for(i=0;i<number;i++)
        {
        	System.out.println("*");
        }
        in.close();
	}

}
