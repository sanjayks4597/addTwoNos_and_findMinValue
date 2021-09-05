package demo_1;
import java.util.*;
public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find minimum value by providing dynamic value
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first value :");
		int value1=sc.nextInt();
		System.out.print("Enter Second value:");
		int value2=sc.nextInt();
		
		if(value1<value2)
		{
			System.out.println("minimum number from above entered value is : " +value1);
		}
		else
		{
			System.out.println("minimum number from above entered value is : "+value2);
		}
		
		//find minimum num by providing static value..
		int num1=234;
		int num2=543;
		
		if(num1<num2)
		{
			System.out.println("minimum number from 234 and 543 is: " +num1);
		}
		else
		{
			System.out.println("minimum number from 234 and 543 is: "+num2);
		}

	}

}
