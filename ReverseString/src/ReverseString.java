import java.util.Scanner;
public class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		String string;
		String reverse = "";
		System.out.print("Please enter a word of phrase: ");
		string = scan.nextLine();
		
		for(int i = string.length()-1; i >= 0; i--)
		{
			reverse += string.substring(i, i+1);
		}
		System.out.println(reverse);
	}

}
