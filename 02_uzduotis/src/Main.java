import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite kubo krastines ilgi a:");
		double a = Double.parseDouble(reader.nextLine());
		System.out.println("Iveskite rutulio skersmeni b:");
		double b = Double.parseDouble(reader.nextLine());
		while (b > a) {
			System.out.println("Rutulio skersmuo virsija kubo krastines ilgi.");
			System.out.println("Iveskite rutulio skersmeni b:");
			b = Double.parseDouble(reader.nextLine());
		}
		reader.close();

		double kt = Math.pow(a, 3);
		double r = b / 2;
		double rv = 4 * Math.PI * Math.pow(r, 3) / 3;
		double vt = kt - rv;

		System.out.println("Kubo turis: " + new DecimalFormat("##.##").format(kt));
		System.out.println("Rutulio turis: " + new DecimalFormat("##.##").format(rv));
		System.out.println("Vandens turis: " + new DecimalFormat("##.##").format(vt));

	}
}
