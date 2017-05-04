import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite tris sveikus skaicius: ");
		System.out.print("1 >> ");
		int a = reader.nextInt();
		System.out.print("2 >> ");
		int b = reader.nextInt();
		System.out.print("3 >> ");
		int c = reader.nextInt();
		reader.close();

		if (a + b > c && b + c > a && a + c > b) {
			if (arStatusis(a, b, c)) {
				System.out.println("Statusis trikampis");
			} else if (a == b && b == c && c == a) {
				System.out.println("Lygiakrastis trikampis");
			} else if (a == b || b == c || c == a) {
				System.out.println("Lygiasonis trikampis");
			} else if (a != b && b != c && c != a) {
				System.out.println("Ivairiakrastis trikampis");
			}
		} else {
			System.out.println("Trikampio sudaryti negalima");
		}
	}

	public static boolean arStatusis(int a, int b, int c) {
		int max = 0;
		int min1 = 0;
		int min2 = 0;
		if (a > b) {
			max = a;
			min1 = b;
		} else {
			max = b;
			min1 = a;
		}
		if (max > c) {
			min2 = c;
		} else {
			min2 = max;
			max = c;
		}
		if (Math.pow(max, 2) == (Math.pow(min1, 2) + Math.pow(min2, 2))) {
			return true;
		}
		return false;
	}

}
