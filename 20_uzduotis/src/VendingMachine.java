import java.text.DecimalFormat;
import java.util.Scanner;

public class VendingMachine {
	Scanner reader = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#0.00");
	private double price;
	private double sum = 0;
	private int coin = 0;
	private double balance;
	
	public void operate(){
		System.out.print("Iveskite gerimo kaina: ");
		price = Double.parseDouble(reader.next());
		do {
			System.out.println("Meskite moneta: ");
			int c = Integer.parseInt(reader.next());
			switch(c){
			case 1:
				sum = sum + 0.01;
				balance = price - sum;
				coin++;
				break;
			case 2:
				sum = sum + 0.02;
				balance = price - sum;
				coin++;
				break;
			case 5:
				sum = sum + 0.05;
				balance = price - sum;
				coin++;
				break;
			case 10:
				sum = sum + 0.1;
				balance = price - sum;
				coin++;
				break;
			case 20:
				sum = sum + 0.2;
				balance = price - sum;
				coin++;
				break;
			case 50:
				sum = sum + 0.5;
				balance = price - sum;
				coin++;
				break;
			default: 
				System.out.println("Atmesta.");
				break;
			}
			if(balance > 0){
				System.out.println("Truksta. " + df.format(balance) + " eur.");
			}
		} while(sum <= price);
		double g = sum - price;
		System.out.println("Gerimas ruosiamas.");
		System.out.println("Jus imetete " + coin + " monetas. Is viso " + df.format(sum) + " eur.");
		System.out.println("Jusu graza " + df.format(g) + " eur.");
	}
}
