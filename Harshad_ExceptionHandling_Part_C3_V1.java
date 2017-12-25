package ExceptionHandling;

public class Harshad_ExceptionHandling_Part_C3_V1 
{
	public static void main(String[] args) 
	{
		int array[]={20,20,40};
		int n1=15,n2=10;
		int i;int output=10;
		try
		{
			output =n1/n2;
			System.out.println("The output is:" +output);
			for(i=5;i>=0;i--)
			{
				System.out.println("The value of Array is: "+ array[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array is out of Bounds"+e);
		}catch(ArithmeticException e)
		{
			System.out.println("Can not divided by Zero");
		}
	}
}