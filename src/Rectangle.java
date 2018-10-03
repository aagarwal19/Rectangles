import java.util.Scanner;

/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */

public class Rectangle 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length: ");
		double length = in.nextDouble();
		in.nextLine();
		System.out.print("Enter the width:  ");
		double width = in.nextDouble();
		in.nextLine();
		System.out.print("The area of the rectangle is: ");
		System.out.printf("%12.2f", length * width);
		in.nextLine();
		System.out.print("The perimeter of the rectangle is: ");
		System.out.printf("%7.2f", (length * 2) + (width * 2));
		in.nextLine();
		System.out.print("The length of the diagonal is: ");
		System.out.printf("%10.2f", Math.sqrt((length*length)+(width*width)));
		in.nextLine();
	}
	
}
