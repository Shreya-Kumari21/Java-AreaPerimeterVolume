import java.util.Scanner;

class isoscelestrianglearea{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Breadth: ");
		double b=sc.nextDouble();
		System.out.println("Enter a Height: ");
		double h=sc.nextDouble();
		double area=(b*h)/2;
		System.out.println("Area of Isosceles Triangle: "+area);
	}
}