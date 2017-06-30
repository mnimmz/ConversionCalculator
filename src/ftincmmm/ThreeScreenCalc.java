package ftincmmm;

import java.util.Scanner;

public class ThreeScreenCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("* Welcome to Conversion Calculator *");
		System.out.println("*                                  *");
		Scanner convert = new Scanner(System.in);
		
		System.out.println("* Press 1 for feet to inches:      *");
		System.out.println("* Press 2 for cm to mm:            *");
		System.out.println("*                                  *");
		System.out.println("************************************");
		int x = convert.nextInt();
	
		if(x == 1){
			System.out.println("              ");
			System.out.println("************************************");
			System.out.println("*                                  *");
			System.out.println("*          Feet to Inches          *");
			System.out.println("*                                  *");
			System.out.println("*        Please enter feet:        *");
			System.out.println("*                                  *");
			System.out.println("************************************");
			int y = convert.nextInt();
			System.out.println("              ");
			System.out.println("************************************");
			System.out.println("*                                  *");
			System.out.println("*        Output in inches:         *");
			System.out.println("*                                  *");
			System.out.println(y = y*12);
			System.out.println("************************************");	
			
		}
		
		else if(x == 2){
			System.out.println("              ");
			System.out.println("************************************");
			System.out.println("*                                  *");
			System.out.println("*    Centimeters to Millimeters    *");
			System.out.println("*                                  *");
			System.out.println("*    Please enter centimeters:     *");
			System.out.println("*                                  *");
			System.out.println("************************************");
			int z = convert.nextInt();
			System.out.println("              ");
			System.out.println("************************************");
			System.out.println("*                                  *");
			System.out.println("*      Output in millimeters:      *");
			System.out.println("*                                  *");
			System.out.println(z = z*10);
			System.out.println("************************************");			
			
		}
					
		else{
			System.out.println("Please choose between 1 and 2!");
		}
		
		
		
		
		
	}
	

}
