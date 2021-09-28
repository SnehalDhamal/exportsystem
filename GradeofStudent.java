import java.util.Scanner;

public class GradeofStudent {
	void compute()
	{
		int m1,m2,m3,per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 marks");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		per=(m1+m2+m3)/3;
		
        System.out.println("Enter per"+per);
        if(per>=75)
        	System.out.println("Distinction");
        else if(per>=60)
        	System.out.println("first division");
        else if(per>=50)
        	System.out.println("second division");
        else if(per>=40)
        	System.out.println("third division");
        else 
        	System.out.println("fails");
        	
        
	}

	public static void main(String[] args) {
		GradeofStudent obj=new GradeofStudent();
		obj.compute();

	}

}
