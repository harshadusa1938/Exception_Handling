package ExceptionHandling;

//Array Index Out Of Bounds Exception
public class Harshad_ExceptionHandling_Part_C2_V1
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5},sum=0;
		for(int i=0;i<=5;i++)// a[5] is illegal
		{
			sum=sum+a[i];
		}
		System.out.println("The Sum is :"+sum);
	}
}
