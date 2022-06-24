import java.util.Scanner;

class circleperimeter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Radius: ");
		double r=sc.nextDouble();
		double perimeter=2*3.14*r;
		System.out.println("Perimeter of Circle: "+perimeter);
	}
}