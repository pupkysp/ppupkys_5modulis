import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Temperaturu skales");
		System.out.println("Iveskite temperatura Kelvino skaleja:");
		double k = Double.parseDouble(reader.nextLine());
		reader.close();
		double a = 273.16;
		double b = 0.8;
		
		double tc = k - a;
		double tf = k * 9/5 - 459.67;
		double tr = (k - a) * b;
		
		System.out.println("1. " + new DecimalFormat("##.##").format(tc) + " Celcijaus laipsniu");
		System.out.println("2. " + new DecimalFormat("##.##").format(tf) + " Farenheito laipsniu");
		System.out.println("3. " + new DecimalFormat("##.##").format(tr) + " Reomuro laipsniu");
		System.out.println("Programa darba baige. Aciu, kad skaiciavote");

	}

}
