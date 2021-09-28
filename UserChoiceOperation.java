import java.util.Scanner;

public class UserChoiceOperation {
	void operation()
	{
		int a,b,choice;
			System.out.println("Enter two number");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			
			System.out.println("Enter 1 for addition");
			System.out.println("Enter 2 for substraction");
			System.out.println("Enter 3 for multiplication");
			System.out.println("Enter 4 for division");
			choice=sc.nextInt();
			
			if(choice==1)
				System.out.println("addition is"+(a+b));
			else if(choice==2)
				System.out.println("substraction is"+(a-b));
			else if(choice==3)
				System.out.println("multiplication is"+(a*b));
			else if(choice==4)
				System.out.println("division is"+(a/b));
			else
				System.out.println("error");
	}
	public static void main(String[] args) {
		UserChoiceOperation obj=new UserChoiceOperation();
		obj.operation();
		

	}

}
