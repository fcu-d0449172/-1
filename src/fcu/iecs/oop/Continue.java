package fcu.iecs.oop;
import java.util.Scanner;
public class  Continue{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++){
			if(i %2 == 0)
				continue;
			System.out.println(i);
			if(i == 3)
				break;
		}
		




	}

}
