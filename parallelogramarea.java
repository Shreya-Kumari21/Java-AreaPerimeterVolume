import java.util.Scanner;

class parallelogramarea{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Breadth: ");
		double b=sc.nextDouble();
		System.out.println("Enter a Height: ");
		double h=sc.nextDouble();
		double area=b*h;
		System.out.println("Area of Parallelogram: "+area);
	}
}