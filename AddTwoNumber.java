package addNum;
import java.util.*;
public class AddTwoNumber {

	public static void main(String[] args) {
		
		//addition of two no.s by providing dynamic values
		Scanner sc=new Scanner(System.in);	
		System.out.print("Enter value 1 :");
		int value1=sc.nextInt();
		System.out.print("Enter value 2 :");
		int value2=sc.nextInt();
		
		
		
		System.out.println("Addition of Entered value is :"+add(value1, value2));
		
		//addition of two no.s by providing two static values
		int num1=458;
		int num2=652;
		
		System.out.println("The Addition of 498 and 652 is :"+add(num1,num2));		

	}
	public static int add(int value1,int value2)
	{
		return value1+value2;
	}

}
