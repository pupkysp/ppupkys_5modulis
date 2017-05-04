import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Duomenys: 1 - Taip; 0 - Ne;");
		System.out.println("Ar galima vaziuoti keliu a?");
		int a = reader.nextInt();
		System.out.println("Ar galima vaziuoti keliu b?");
		int b = reader.nextInt();
		System.out.println("Ar galima vaziuoti keliu c?");
		int c = reader.nextInt();
		System.out.println("Ar galima vaziuoti keliu d?");
		int d = reader.nextInt();
		System.out.println("Ar galima vaziuoti keliu e?");
		int e = reader.nextInt();
		System.out.println("Ar galima vaziuoti keliu f?");
		int f = reader.nextInt();
		reader.close();

		if (a == 1) {
			System.out.println("Is tasko A i taska B patekti galima");
		} else if (e == 1 && b == 1) {
			System.out.println("Is tasko A i taska B patekti galima");
		} else if (f == 1 && c == 1) {
			System.out.println("Is tasko A i taska B patekti galima");
		} else if (e == 1 && d == 1 && c == 1) {
			System.out.println("Is tasko A i taska B patekti galima");
		} else if (f == 1 && d == 1 && b == 1) {
			System.out.println("Is tasko A i taska B patekti galima");
		} else {
			System.out.println("Is tasko A i taska B patekti negalima");
		}
	}

}
