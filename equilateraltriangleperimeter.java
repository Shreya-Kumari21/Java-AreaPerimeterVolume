import java.util.Scanner;

class equilateraltriangleperimeter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Side: ");
		double a=sc.nextDouble();
		double perimeter=3*a;
		System.out.println("Perimeter of Equilateral Triangle: "+perimeter);
	}
}