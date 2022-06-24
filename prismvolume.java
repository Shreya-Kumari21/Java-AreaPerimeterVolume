import java.util.Scanner;

class prismvolume{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Base: ");
		double b=sc.nextDouble();
		System.out.println("Enter a Height: ");
		double h=sc.nextDouble();
		double volume=b*h;
		System.out.println("Volume of Prism: "+volume);
	}
}