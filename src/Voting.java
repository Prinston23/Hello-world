import java.util.*;
public class Voting {
	public static void main(String[] args)
	{
		int age;
		System.out.println("Enter your age:");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(age==18)
		{
			System.out.println("You are eligible for voting");
		}
		
		else if(age>18)
			{
				
				System.out.println("You are  eligible to voting");
			
			}
		else
		{
			if(age<18)
			{
				System.out.println("You are  not eligible for voting");
			}
		}
		
	}
}


