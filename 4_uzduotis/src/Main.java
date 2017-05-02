
public class Main {
	public static void main(String[] args) {
		int mok = 1;

		while (mok < 50) {
			if (mok % 7 == 0 && mok % 3 == 0 && mok % 2 == 0) {
				int p = mok / 7;
				int k = mok / 3;
				int t = mok / 2;
				int n = mok - (p + k + t);

				System.out.println("Kontrolinio rezultatai");
				System.out.println("Klaseje mokosi " + mok + " mokiniai");
				System.out.println("Klaseje " + p + " mokiniai gavo penketus");
				System.out.println("Klaseje " + k + " mokiniai gavo ketvertus");
				System.out.println("Klaseje " + t + " mokiniai gavo trejetus");
				System.out.println("Klaseje " + n + " mokiniai gavo nepatenkinama pazymi");

			}
			mok++;
		}

	}

}
