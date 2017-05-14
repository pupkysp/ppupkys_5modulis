import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Honey {
	Scanner reader = new Scanner(System.in);
	private double honey;
	private int friends;
	private int sickFriends;
	private List<Integer> usedHoneyByBeekeeper = new ArrayList<>();
	private double honeyForBeekeeper = 0;
	private double honeyForFriends = 0;
	private int month = 0;

	public void collectInfo() {
		System.out.println("Iveskite medaus kieki (kg):");
		honey = Double.parseDouble(reader.nextLine());
		System.out.println("Iveskite draugu skaiciu, kuriems bitininkas dave medaus:");
		friends = Integer.parseInt(reader.nextLine());
		System.out.println("Iveskite susirgusiu draugu skaiciu:");
		sickFriends = Integer.parseInt(reader.nextLine());
		System.out.println("Iveskite bitininko per menesi sunaudota medu: ");
		for (int i = 0; i < 9; i++) {
			System.out.println(i + 1 + " menesis: ");
			usedHoneyByBeekeeper.add(reader.nextInt());
		}
		reader.close();
	}

	public void calculate() {
		honeyForFriends = friends + (sickFriends * 0.5);
		honey = honey - honeyForFriends;
		for (Integer i : usedHoneyByBeekeeper) {
			if (honey > 0.5) {
				honey = honey - i;
				honeyForBeekeeper = honeyForBeekeeper + i;
				month++;
			} else {
				honey = honey - 0.5;
				honeyForBeekeeper = honeyForBeekeeper + 0.5;
			}
		}
	}
	
	public void print(){
		if (honey != 0) {
			System.out.println("Bitininkui uzteks medaus visam laikotarpui");
		} else {
			System.out.println("Bitininkui uzteks medaus " + month + " menesiams");
		}
		System.out.println("Bitininkas draugams dave " + honeyForFriends + " kg medaus");
		System.out.println("Bitininkas sunaudojo " + honeyForBeekeeper + " kg medaus");
		if (honey != 0) {
			System.out.println("Bitininkui medaus liko " + honey + " kg.");
		} else {
			System.out.println("Bitininkui medaus neliko");
		}
	}
}
