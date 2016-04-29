import java.util.ArrayList;
import java.util.Scanner;
public class QuizerProject
	{
		static ArrayList<Questions> Quiz = new ArrayList <Questions>();
		static Scanner userInput = new Scanner(System.in);
		static int num;
		public static void main(String[] args)
			{
				greetPlayer();
				generateQuiz();
				askQuestions();
			}
		public static void greetPlayer()
		{
			System.out.println("What is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello, " + name + "!");
		}
		public static void generateQuiz()
		{
			System.out.println("How many questions would you like the quiz to be.");
			num = userInput.nextInt();
		}
		public static void askQuestions()
		{
			int right = 0;
			int wrong = 0;
			for(int i=0; i<num; i++)
				{
					if (i%3!=0)
						{
							int first = (int)(Math.random()*30)+10;
							int second = (int)(Math.random()*15)+1;
							System.out.println("What is " + first + " % " + second + "?");
							int answer = userInput.nextInt();
							if (answer == first%second)
								{
									System.out.println("Congrats you got that one right.");
									right++;
								}
							else if (answer != first%second)
								{
									System.out.println("You got that one wrong.");
									System.out.println("The correct answer is " + first%second);
									wrong++;
								}
						}
					else if (i%3==0&&i%6!=0)
						{
							int first = (int)(Math.random()*10)+1;
							int second = (int)(Math.random()*30)+11;
							System.out.println("What is " + first + " % " + second + "?");
							int answer = userInput.nextInt();
							if (answer == first%second)
								{
									System.out.println("Congrats you got that one right.");
									right++;
								}
							else if (answer != first%second)
								{
									System.out.println("You got that one wrong.");
									System.out.println("The correct answer is " + first%second);
									wrong++;
								}
						}
					else if ((i%3==0&&i%6==0))
						{
							int first = (int)(Math.random()*30)+1;
							System.out.println("What is " + first + " % " + first + "?");
							int answer = userInput.nextInt();
							if (answer == first%first)
								{
									System.out.println("Congrats you got that one right.");
									right++;
								}
							else if (answer != first%first)
								{
									System.out.println("You got that one wrong.");
									System.out.println("The correct answer is " + first%first);
									wrong++;
								}
						}
						
				}
			System.out.println("You got " + right + " problems correct");
			System.out.println("You got " + wrong + " problems wrong");
			System.out.println("Nice job!");
		}
	}