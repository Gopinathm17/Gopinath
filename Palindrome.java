package assignment;

public class Palindrome {

	public static void main(String[] args) {
		int num1=34543;
		int rev=0;
		int org_num=num1;
		
		while(num1!=0)
		{
			rev=rev*10+num1%10;
			num1=num1/10;
		}
					
		if (org_num==rev) {
			System.out.println("number is palindrome");
		}
			else {
				System.out.println("number is negative");	
		}
	
		
	}			

	}


