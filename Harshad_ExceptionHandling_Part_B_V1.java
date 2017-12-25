package ExceptionHandling;
import java.util.* ;

public class Harshad_ExceptionHandling_Part_B_V1
{
	public static void main ( String[] a ) 
	{
		Scanner scan = new Scanner( System.in  );
		int num = 0 ;
		String name;
		
		System.out.println("Enter your Name: ");
		name=scan.nextLine();
			
		System.out.print("Enter an Integer: ");
		try
		 {
			num = scan.nextInt();    
		 }
		
		 catch(InputMismatchException ex)
		 {
			System.out.println(ex.getMessage());
			System.out.println("Name:"+ name);
			System.out.println("Integer:"+ num);
		 }
	}
}