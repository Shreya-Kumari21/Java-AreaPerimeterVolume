import java.util.Scanner;

class rhombusarea{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Diagonal 1: ");
		double p=sc.nextDouble();
		System.out.println("Enter a Diagonal 2: ");
		double q=sc.nextDouble();
		double area=(p*q)/2;
		System.out.println("Area of Rhombus: "+area);
	}
}