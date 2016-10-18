package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner keyboard = new Scanner(System.in); 
		  String s1,s2;
	    System.out.print("輸入第一字串: ");
        s1 = keyboard.next();
        System.out.print("輸入第二字串: ");
        s2 = keyboard.next();
        if(s1.equals(s2)) 
    		System.out.printf("The two strings are the same."); 
    		else 
    		{
    		    System.out.print("輸入第一字串: ");
    	        s1 = keyboard.next();
    	        System.out.print("輸入第二字串: ");
    	        s2 = keyboard.next();
    	        if(s1.equals(s2)) 
        		System.out.printf("The two strings are the same."); 
    	        else
    	        {
    	        	System.out.print("輸入第一字串: ");
        	        s1 = keyboard.next();
        	        System.out.print("輸入第二字串: ");
        	        s2 = keyboard.next();
        	        if(s1.equals(s2)) 
                		System.out.printf("The two strings are the same."); 
    	        }
    		}

	}

}

	      
	        	
	        	

