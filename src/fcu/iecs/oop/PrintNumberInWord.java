package ddd;

import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1 ;
         
         Scanner keyboard = new Scanner(System.in); 
         System.out.print("Enter a integer: ");
         num1=keyboard.nextInt();
         if(num1==1) 
             System.out.printf("The input integer is ¡§ONE¡¨."); 
         if(num1==2) 
             System.out.printf("The input integer is ¡§TWO¡¨."); 
         if(num1==3) 
             System.out.printf("The input integer is ¡§THREE¡¨."); 
         if(num1==4) 
             System.out.printf("The input integer is ¡§FOUR¡¨."); 
         if(num1==5) 
             System.out.printf("The input integer is ¡§FIVE¡¨."); 
         if(num1==6) 
             System.out.printf("The input integer is ¡§SIX¡¨."); 
         if(num1==7) 
             System.out.printf("The input integer is ¡§SEVEN¡¨."); 
         if(num1==8) 
             System.out.printf("The input integer is ¡§EIGHT¡¨."); 
         if(num1==9) 
             System.out.printf("The input integer is ¡§NIGHT¡¨."); 
         if(num1>9) 
             System.out.printf("OTHER");
  

	}

}
