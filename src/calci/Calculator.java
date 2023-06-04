package calci;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int add = sum(a,b);
		int su = sub(a,b);
		int multipl = multi(a,b);
		int divide= div(a,b);
		System.out.println("addition : "+add);
		System.out.println("substration :"+su);
		System.out.println("multiplication : "+multipl);
		System.out.println("division : "+divide);
		}
	public static int sum(int a, int b)
	{
		
		return a+b;
	}
	public static int sub(int a, int b)
	{
		return a-b;
	}
	public static int multi(int a, int b)
	{
		return a*b;
	}
	public static int div(int a, int b)
	{
		return a/b;
	}

}
