package ExceptionHandling;


public class Harshad_ExceptionHandling_Part_C_Practical1_V1
{
	public static void main(String[] args)
	{
		try
		{
			throwException();
		}
		catch(Exception exeption)
		{
			System.err.println("Exception handled in main");
		}
		doesNotThrowException();
	}
	public static void throwException() throws Exception
	{
		try
		{
			System.out.println("Method throwException");
		}
		catch(Exception exception)
		{
			System.err.println("Exception handled in method throwException");
			throw exception;
		}
		finally
		{
			System.err.println("Finally executed in throw Exception");
		}
	}
	public static void doesNotThrowException()
	{
		try
		{
			System.out.println("Method doesNotThrowException");
		}
		catch(Exception exception)
		{
			System.err.println(exception);
		}
		finally
		{
			System.err.println("Finally executed in doesNotException");
		}
		System.out.println("End of method doesNotException");
	}
}