package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner keyboard = new Scanner(System.in); 
		  String s1,s2;
	    System.out.print("��J�Ĥ@�r��: ");
        s1 = keyboard.next();
        System.out.print("��J�ĤG�r��: ");
        s2 = keyboard.next();
        if(s1.equals(s2)) 
    		System.out.printf("The two strings are the same."); 
    		else 
    		{
    		    System.out.print("��J�Ĥ@�r��: ");
    	        s1 = keyboard.next();
    	        System.out.print("��J�ĤG�r��: ");
    	        s2 = keyboard.next();
    	        if(s1.equals(s2)) 
        		System.out.printf("The two strings are the same."); 
    	        else
    	        {
    	        	System.out.print("��J�Ĥ@�r��: ");
        	        s1 = keyboard.next();
        	        System.out.print("��J�ĤG�r��: ");
        	        s2 = keyboard.next();
        	        if(s1.equals(s2)) 
                		System.out.printf("The two strings are the same."); 
    	        }
    		}

	}

}

	      
	        	
	        	

