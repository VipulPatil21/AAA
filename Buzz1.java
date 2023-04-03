import java.util.Scanner;
class Buzz1
{
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int num=s.nextInt();

	  if(num%10==7||num%7==0)
		{
		  System.out.println("It is a buzz number");
		}
		else
		{
			System.out.println("It is not a buzz number");
		}
	}
}
