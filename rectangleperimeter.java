import java.util.Scanner;

class rectangleperimeter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Length: ");
		double l=sc.nextDouble();
		System.out.println("Enter a Breadth: ");
		double b=sc.nextDouble();
		double perimeter=2*(l+b);
		System.out.println("Perimeter of Rectangle: "+perimeter);
	}
}