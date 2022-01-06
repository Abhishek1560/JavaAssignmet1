package coding1;
// find third angle of triangle
   import java.util.Scanner;
   
   public class AngOfTriangle {

	public static void main(String[] args) {
	int a,b,c;
    Scanner input = new Scanner (System.in);
    System.out.print("Input the first angle of the triangle: ");
     a = input.nextInt();
    System.out.print("Input the second angle of triangle: ");
     b = input.nextInt();
    c = 180-(a+b);
     
    System.out.println("Third angle of triangle is: " +c);
    

	}

}
