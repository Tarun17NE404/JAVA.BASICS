import java.util.Scanner;
class  CheckEvenOdd
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter an Integer Number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num % 2 == 0)
			System.out.println("Entered Number is a even");
		else
			System.out.println("Entered Number is a odd");
	}
}
