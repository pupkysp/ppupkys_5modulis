import java.util.Scanner;

public class Main {

	static int a1, a2, b1, b2, c1, c2;

	public static void main(String[] args) {
		input();
		arTelpa();
	}

	public static void input() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite pirmos dezutes matmenis: ");
		System.out.print("a1: ");
		a1 = reader.nextInt();
		while (a1 > 100) {
			System.out.println("a1: ");
			a1 = reader.nextInt();
		}
		System.out.print("b1: ");
		b1 = reader.nextInt();
		while (b1 > 100) {
			System.out.println("b1: ");
			b1 = reader.nextInt();
		}
		System.out.print("c1: ");
		c1 = reader.nextInt();
		while (c1 > 100) {
			System.out.println("c1: ");
			c1 = reader.nextInt();
		}
		System.out.print("a2: ");
		a2 = reader.nextInt();
		while (a2 > 100) {
			System.out.println("a2: ");
			a1 = reader.nextInt();
		}
		System.out.print("b2: ");
		b2 = reader.nextInt();
		while (b2 > 100) {
			System.out.println("b2: ");
			b2 = reader.nextInt();
		}
		System.out.print("c2: ");
		c2 = reader.nextInt();
		while (c2 > 100) {
			System.out.println("c2: ");
			c1 = reader.nextInt();
		}
		reader.close();
	}

	public static void arTelpa() {
		if ((a1 + b1 + c1) > (a2 + b2 + c2)) {
			System.out.println("Antroji telpa pirmojoje");
		} else if ((a1 + b1 + c1) < (a2 + b2 + c2)) {
			System.out.println("Pirmoji telpa antrojoje");
		} else if ((a1 + b1 + c1) == (a2 + b2 + c2)) {
			System.out.println("Abi vienodu matmenu");
		} else {
			System.out.println("Dezutes nepalyginamos");
		}
	}
}
