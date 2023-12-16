package vinaykumarjava1234;
import java.util.Scanner;
public class quizgame {
	public static void main(String[] args)throws java.lang.Exception {
		System.out.println("Welcome for the quiz game");
		System.out.println("here this quiz will cover the basic concepts of java program including jdk,jvm,data types , decision making loops");
		int score = 0;
		String answer1 = "java development kit";
		Scanner input1 = new Scanner(System.in);
		{
			System.out.println("1.what does jdk stands for?");
			String ans1 = input1.nextLine();
		    if (ans1.equals(answer1))
			{
				score++;
				System.out.println("very good");
				
			}
		}
		String answer2 = "java runtime environment";
		Scanner input2 = new Scanner(System.in);{
			System.out.println("2. what does jrm stands for?");
			String ans2 = input2.nextLine();
			if (ans2.equals(answer2))
			{
				score++;
				System.out.println("very good");
				
			}
		}
		String answer3 = "java virtual machine";
		Scanner input3 = new Scanner(System.in);{
			System.out.println("3. what does jvm stands for?");
			String ans3 = input3.nextLine();
			if (ans3.equals(answer3))
			{
				score++;
				System.out.println("very good");
				
			}
		}
		String answer4 = "yes";
		Scanner input4 = new Scanner(System.in);{
			System.out.println("4. if its raining do you use umbrella? type 'yes' or 'no'");
			String ans4 = input4.nextLine();
			if (ans4.equals(answer4))
			{
				score++;
				System.out.println("very good");
			}
			else
			{
				System.out.println("not correct");
			}
		}
		String answer5 = "yes";
		Scanner input5 = new Scanner(System.in);{
			System.out.println("5. Is 10 is greater than 5? type 'yes' or 'no'");
			String ans5 = input5.nextLine();
			if (ans5.equals(answer5))
			{
				score++;
				System.out.println("very good");
			}
			else
			{
				System.out.println("not correct");
			}
		}
		double answer6 = 7.5;
		try(Scanner input6 = new Scanner(System.in)){
			System.out.println("6. what is the output for int x = 5; double y = 2.5; System.out.println(x+y);?");
			
			if (input6.hasNextDouble()) {
		        double ans6 = input6.nextDouble();
		        if (ans6 == answer6)
			{
				
				score++;
				System.out.println("very good");
				
			}
		}}
		
		
		System.out.println("your score is " +score);
	}
	

}
