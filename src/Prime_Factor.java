//Prime Factors Exercise
import java.util.Scanner;
public class Prime_Factor {

	public static void main(String args[])
	{
		int number;
		System.out.println("enter number");
		Scanner in=new Scanner(System.in);
		number=in.nextInt();
	    prime obj=new prime();
	  obj.factors(number);
	  in.close();
	}
}
class prime{
	void factors(int number)
     {
		int i,j,remainder;
		if(number==2)
		{
			System.out.println("2");
		}
		for(i=2;i<=(number/2);i++)
		{
			remainder=number%i;
			if(remainder==0)
			{
        		boolean isprime=true;
        		for(j=2;j<=i/2;j++)
        		{
        			 if(i%j==0)
                     {
                         isprime = false;
                         break;
                     }
        		}
        		if(isprime==true){
                 System.out.println(i);
        		}
					
			}
		}
			
}
	
}			


