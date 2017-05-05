import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int m = 0;
		int k = 0;
		int f = 0;
		System.out.println("Iveskite turima uogienes kieki sauksteliais:");
		int uogiene = Integer.parseInt(reader.nextLine());
		System.out.println("ir numatoma vizitu skaiciu:");
		int vizitai = Integer.parseInt(reader.nextLine());
		System.out.println("Dabar iveskite visu lankytoju kodus:");
		String kodai = reader.nextLine();
		reader.close();

		String[] kodas = kodai.split(" ");

		while (vizitai != 0) {
			for (String i : kodas) {
				if (i.equals("1")) {
					if (uogiene < 2) {
						m = m + uogiene;
						uogiene = 0;
						vizitai--;
					} else {
						uogiene = uogiene - 2;
						m = m + 2;
						vizitai--;
					}

				} else if (i.equals("2")) {
					if (uogiene < 5) {
						k = k + uogiene;
						uogiene = 0;
						vizitai--;
					} else {
						uogiene = uogiene - 5;
						k = k + 5;
						vizitai--;
					}
				} else if (i.equals("3")) {
					if (uogiene < 3) {
						f = f + uogiene;
						uogiene = 0;
						vizitai--;
					} else {
						uogiene = uogiene - 3;
						f = f + 3;
						vizitai--;
					}
				}
			}
		}
		if (uogiene > 0) {
			System.out.println("Liko " + uogiene + " saukst. uogienes");
		} else {
			System.out.println("Uogienes neliko");
		}
		System.out.println("Mazyliui teko " + m);
		System.out.println("Karlsonui " + k);
		System.out.println("Panelei Frekenbok " + f + " saukst. uogienes");
	}

}
