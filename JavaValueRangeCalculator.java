import java.util.Scanner;
public class JavaValueRangeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of bytes a data type uses: ");
		byte bytes = sc.nextByte();
		int bits = 8*bytes;
		long power =(long) ((Math.pow(2,bits))/2);
		long powerminus1 =(long) (power-1);
		System.out.println("The data type value ranges from -" + power + " to " + powerminus1);
	}
}
