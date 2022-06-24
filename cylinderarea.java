import java.util.Scanner;

class cylinderarea{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Radius: ");
		double r=sc.nextDouble();
		System.out.println("Enter a Height: ");
		double h=sc.nextDouble();
		double area=2*3.14*(r+h)*r;
		System.out.println("Total surface area of Cylinder: "+area);
	}
}