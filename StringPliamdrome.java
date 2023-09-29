/*
 * file         :StringPalindrome
 * description  :java program to find Palindrome of string
 * name         :Alan Kb
 * version      :1.o
 * date         :29/09/2023
*/
import java.util.Scanner;
public class StringPliamdrome {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=sc.next();
		boolean isPalindrome=check(input);
		if(isPalindrome) {
			System.out.println("The given string is paliandrome");
		}
		else
		{
			System.out.println("The given string is not paliamdrome");
		}
	}	
	
	private static boolean check(String input) {
		char[]charArray=input.toCharArray();
		int length=input.length();
		for(int i=0;i<length/2;i++)
		{
			if (charArray[i]!=charArray[length-i-1])
			{
			return false;
			}
		}
			return true;
		}
}
