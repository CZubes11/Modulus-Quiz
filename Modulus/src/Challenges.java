import java.util.Scanner;
public class Challenges
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				run1();
				System.out.println();
				run2();
				System.out.println();
				run3();
				System.out.println();
				run4();
			}
		public static void run1()
		{
			System.out.println("Please input a number and I will tell you if it is even or odd.");
			int num = userInput.nextInt();
			if (num%2==0)
				{
					System.out.println("That was even");
				}
			else
				{
					System.out.println("That was odd");
				}
		}
		public static void run2()
		{
			System.out.println("Please input a year and i will tell you if it was a leap year or not.");
			int year = userInput.nextInt();
			if (year%4==0)
				{
					System.out.println("That was a leap year");
				}
			else
				{
					System.out.println("That was not a leap year");
				}
		}
		public static void run3()
		{
			int [] numbers= {2, 5, -7, 1, 3, 12, 19, -16, 4};
			for (int i=0; i < numbers.length; i++)
				{
					if (i%3==0)
						{
							System.out.println(numbers[i+2]);
						}
				}
		}
		public static void run4()
		{
			for(int i=1; i<101; i++)
				{
					if (i%3==0&&i%5==0)
						{
							System.out.println("Fizz Buzz");
						}
					else if (i%3==0&&i%5!=0)
						{
							System.out.println("Fizz");
						}
					else if (i%5==0&&i%3!=0)
						{
							System.out.println("Buzz");
						}
					else
						{
							System.out.println(i);
						}
				}
		}
	}