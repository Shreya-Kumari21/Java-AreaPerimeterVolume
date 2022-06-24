import java.util.Scanner;

class spherevolume{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Radius: ");
		double r=sc.nextDouble();
		double volume=(4.0/3.0)*3.14*(r*r*r);
		System.out.println("Volume of Sphere: "+volume);
	}
}