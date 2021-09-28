import java.util.Scanner;

public class GreaterNoAmongTwo {
	private static GreaterNoAmongTwo obj;
	void compute()
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		
	
    if(a>b) {
    	System.out.println(a+"is greater than"+b);
    
    }
    
    else
	            System.out.println(b+"is greater than"+a);

    }
	
	public static void main(String[] args) {
		GreaterNoAmongTwo.obj= new GreaterNoAmongTwo();
		
		obj.compute();
	

	}

}
