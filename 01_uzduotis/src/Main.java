import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite apelsino skersmeni:");
		double d = Double.parseDouble(reader.nextLine());
		System.out.println("Iveskite apelsino zieveles stori");
		double z = Double.parseDouble(reader.nextLine());
		reader.close();
		double r = d / 2;
		
		r = r - z;
		
		double v = 4 * Math.PI * Math.pow(r, 3) /3;
		
		System.out.println("Apelsino minkstimo turis: " + new DecimalFormat("##.##").format(v));
		

	}

}
