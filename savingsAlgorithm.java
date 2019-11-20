import java.util.Scanner;
//this code was wrote on the 23 of oct 2019
public class savingsAlgorithm {
	
	public static void main(String[] args){
		
		Scanner x = new Scanner(System.in);
	
		int salary;
		int strategyChosen;
		int amountSavedYearly;
		int amountSavedMonthly;
		int amountSavedWeekly;
		
		int aggressiveStrategy = 40;
		int midStrategy = 30;
		int passiveStrategy = 20;
		int userSelectedAmount;
		
		
		
		System.out.println("Please enter your annual salary.");
		salary = x.nextInt();
		
		System.out.println("Please select a savings strategy.\n 1.20%\n 2.30%\n 3.40%\n 4.Enter your own percentage");
		strategyChosen = x.nextInt();
		
		if(strategyChosen == 1){
			amountSavedYearly = salary*passiveStrategy/100;
			amountSavedMonthly = amountSavedYearly/12;
			amountSavedWeekly = amountSavedMonthly/4;
			
			System.out.println("\nSalary: " + salary + "\nAmount Saved By Year End:  " + amountSavedYearly);
			System.out.println("These are the guidlines to achieve this target:");
			System.out.println("You need to save Monthly: " + amountSavedMonthly);
			System.out.println("You need to save Weekly: " + amountSavedWeekly);
		}
		
		if(strategyChosen == 2){
			
			amountSavedYearly = salary*midStrategy/100;
			amountSavedMonthly = amountSavedYearly/12;
			amountSavedWeekly = amountSavedMonthly/4;
			
			System.out.println("\nSalary: " + salary + "\nAmount Saved By Year End:  " + amountSavedYearly);
			System.out.println("These are the guidlines to achieve this target:");
			System.out.println("You need to save Monthly: " + amountSavedMonthly);
			System.out.println("You need to save Weekly: " + amountSavedWeekly);
		}
		
		if(strategyChosen == 3){
			
			amountSavedYearly = salary*aggressiveStrategy/100;
			amountSavedMonthly = amountSavedYearly/12;
			amountSavedWeekly = amountSavedMonthly/4;
			
			System.out.println("\nSalary: " + salary + "\nAmount Saved By Year End:  " + amountSavedYearly);
			System.out.println("These are the guidlines to achieve this target:");
			System.out.println("You need to save Monthly: " + amountSavedMonthly);
			System.out.println("You need to save Weekly: " + amountSavedWeekly);
			
		}
		if(strategyChosen == 4){
			System.out.println("Please enter the percentage of your annual income you wish to save: ");
			userSelectedAmount = x.nextInt();;
			
			amountSavedYearly = salary*userSelectedAmount/100;
			amountSavedMonthly = amountSavedYearly/12;
			amountSavedWeekly = amountSavedMonthly/4;
			
			System.out.println("\nSalary: " + salary + "\nAmount Saved By Year End:  " + amountSavedYearly);
			System.out.println("These are the guidlines to achieve this target:");
			System.out.println("You need to save Monthly: " + amountSavedMonthly);
			System.out.println("You need to save Weekly: " + amountSavedWeekly);
			
		}
		
	}
	
	
}
