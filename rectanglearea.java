import java.util.Scanner;

class rectanglearea{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a length: ");
		double l=sc.nextDouble();
		System.out.println("Enter a Breadth: ");
		double b=sc.nextDouble();
		double area=l*b;
		System.out.println("Area of Rectangle: "+area);
	}
}