import java.util.Scanner;

class conevolume{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Radius: ");
		double r=sc.nextDouble();
		System.out.println("Enter a Height: ");
		double h=sc.nextDouble();
		double volume=3.14*r*r*(h/3);
		System.out.println("Volume of Cone: "+volume);
	}
}