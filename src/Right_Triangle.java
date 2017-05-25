//Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.) 

import java.util.Scanner;

public class Right_Triangle {
	public static void main(String args[])
	{
		int number,i,j;
		Scanner in=new Scanner(System.in); 
		System.out.println("enter the number");
		number=in.nextInt();
		
        System.out.println("the number is " +number);
        for(i=1;i<=number;i++)
        {
        	for(j=1;j<=i;j++)
        	{
        	System.out.print("*");
        }
        	System.out.println(" ");
	}
        in.close();

	}

}
