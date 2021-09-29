import java.util.Scanner;
//jenkins project modification
public class GreatestAmongThree {
	void compare() 
	
	{
		int a,b,c;
		System.out.println("Enter three no");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sc.close();
		
		if(a>b && a>c) 
				System.out.println(" greater no is"+a);
		
		else if(b>c)
			System.out.println(" greater no is"+b);
		else
			System.out.println("greater no is"+c);
	}

	public static void main(String[] args) { 
		GreatestAmongThree obj=new GreatestAmongThree();
		obj.compare();
		

	}

}
