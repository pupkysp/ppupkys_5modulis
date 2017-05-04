import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Kiek € turi susitaupes Dainius?");
		int a = reader.nextInt();
		System.out.println("Kiek € kas menesi Dainiui duoda tevai?");
		int b = reader.nextInt();
		reader.close();

		int suma = a + (b * (5-3));

		if (suma >= 60) {
			System.out.println("Dainius nusipirks bilieta P arba A sektoriuje, bilietas kainuos 60 euru");
		} else if (suma >= 50) {
			System.out.println("Dainius nusipirks bilieta K arba C sektoriuje, bilietas kainuos 50 euru");
		} else if (suma >= 40) {
			System.out.println("Dainius nusipirks bilieta D arba J sektoriuje, bilietas kainuos 40 euru");
		} else if (suma >= 35) {
			System.out.println("Dainius nusipirks bilieta E arba H sektoriuje, bilietas kainuos 35 euru");
		} else if (suma >= 30) {
			System.out.println("Dainius nusipirks bilieta F arba G sektoriuje, bilietas kainuos 30 euru");
		} else {
			System.out.println("NEGALES");
		}

	}

}
