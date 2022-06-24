import java.util.Scanner;

class equilateraltrianglearea{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Side: ");
		double a=sc.nextDouble();
		double area=(1.73*a*a)/4;
		System.out.println("Area of Equilateral Triangle: "+area);
	}
}