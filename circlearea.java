import java.util.Scanner;

class circlearea{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Radius: ");
		double r=sc.nextDouble();
		double area=3.14*r*r;
		System.out.println("Area of Circle: "+area);
	}
}