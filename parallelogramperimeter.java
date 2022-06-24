import java.util.Scanner;

class parallelogramperimeter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Side 1: ");
		double a=sc.nextDouble();
		System.out.println("Enter a Side 2: ");
		double b=sc.nextDouble();
		double perimeter=2*(a+b);
		System.out.println("Perimeter of Parallelogram: "+perimeter);
	}
}