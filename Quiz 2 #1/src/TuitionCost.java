/*
 * 
 *  Victor Kuciel
 *  Quiz #2 Question: #1
 *  
 */

import java.util.Scanner;

public class TuitionCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Tuition rate is $12,342
		System.out.print("What is the current rate of tuition? ");
		double tuition = input.nextDouble();
		
		System.out.print("What is the percentage increase in year #2? ");
		double PIY2 = input.nextDouble()/100;
		
		System.out.print("What is the percentage increase in year #3: ");
		double PIY3 = input.nextDouble()/100;
		
		System.out.print("What is the percentage increase in year #4: ");
		double PIY4 = input.nextDouble()/100;
		
		double newTuition = tuition;
		double TuitionTotalCost = 0;
		double increase = 0;
		
		for (int year=0; year < 4; year++){
			switch (year){
				case 0: increase = 0; break;
				case 1: increase = PIY2; break; 
				case 2: increase = PIY3; break; 
				case 3: increase = PIY4; break;
			}
			newTuition += newTuition*increase;
			TuitionTotalCost += newTuition;
        }
		System.out.printf("The final tuition cost is $%5.2f", TuitionTotalCost);
		input.close();
	}}

