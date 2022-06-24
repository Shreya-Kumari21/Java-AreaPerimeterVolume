import java.util.Scanner;

class squareperimeter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Side: ");
		double a=sc.nextDouble();
		double perimeter=4*a;
		System.out.println("Perimeter of Square: "+perimeter);
	}
}