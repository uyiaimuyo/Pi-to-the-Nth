import java.util.*;
import java.math.BigDecimal;
public class PiToN{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		BigDecimal b1 = new BigDecimal("22.0");
		BigDecimal b2 = new BigDecimal("7.0");
		
		System.out.println("Enter a number of decimal places for PI: ");
		int n = scan.nextInt();
		
		if(n < 15)
			System.out.println(b1.divide(b2, n, BigDecimal.ROUND_UP));
		else
			System.out.println("You have exceeded the limit.");
	}
}