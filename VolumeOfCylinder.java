package coding1;
   import java.util.Scanner;

public class VolumeOfCylinder {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Input the radius of the cylinder: ");
		int radius = input.nextInt();
		System.out.print("Input the height of the cylinder: ");
		int height = input.nextInt();
		double volume = Math.PI*radius*radius*height ;
		System.out.println("Volume of a cylinder: " +volume);

	}

}
