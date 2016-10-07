package aaa;
import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


{ 
		            // TODO Auto-generated method stub
		                int num1 ;
		                float num2;
		                
		                Scanner keyboard = new Scanner(System.in); 
		                System.out.print("Enter a integer: ");
		                num1=keyboard.nextInt();
		                System.out.print("Enter a float point number ");
		                num2=keyboard.nextFloat();
		                System.out.print("Enter a you name: ");
		                //Scanner sc = new Scanner(System.in);
		                String s1 = keyboard.next();
		              
		                System.out.printf("Hi %s the multiplication of %d and %f is %4.2E.",s1 ,num1 ,num2,num1*num2 );
		                
		                

		    
		}

	}

}
