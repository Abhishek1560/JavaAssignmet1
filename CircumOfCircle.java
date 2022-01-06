package coding1;
import java.util.Scanner;

public class CircumOfCircle {

		public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    System.out.print("Input the radius of the circle: ");
	    int radius = input.nextInt();
	    double circumference = 2*Math.PI*radius ;
	    System.out.println("Circumference of Circle: " +circumference);
	    
	    }

}
