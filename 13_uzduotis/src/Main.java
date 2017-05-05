import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] valandos = {0, 4, 8, 12, 16, 20, 24};
		double[] temp = new double[7];
		double maxTemp = temp[0];
		int vieta = 0;
		System.out.println("Iveskite matavimus:");
		for(int i = 0; i < 7; i++){
			System.out.println(valandos[i] + " val. buvo:");
			temp[i] = Double.parseDouble(reader.nextLine());
		}
		reader.close();
		for (int i = 0; i < 7; i++) {
			if (temp[i] > maxTemp) {
				maxTemp = temp[i];
				vieta = i;
			}
		}
		System.out.println("Auksciausia temperatura buvo " + valandos[vieta] + " val.");
		
	}

}
