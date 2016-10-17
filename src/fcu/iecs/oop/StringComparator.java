package ccc;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner keyboard = new Scanner(System.in); 
		//Scanner sc = new Scanner(System.in);
	    System.out.print("輸入第一字串: ");
        String s1 = keyboard.next();
        System.out.print("輸入第二字串: ");
        String s2 = keyboard.next();
        if(s1.equals(s2)) 
    		System.out.printf("The two strings are the same."); 
    		else System.out.printf("The two strings are not the same."); 

	}

}
