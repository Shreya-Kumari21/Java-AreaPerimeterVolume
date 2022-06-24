import java.util.Scanner;

class cubearea{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Side: ");
		double a=sc.nextDouble();
		double area=4*a*a;
		System.out.println("Curved Surface area of Cube: "+area);
	}
}