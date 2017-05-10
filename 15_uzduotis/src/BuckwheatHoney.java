import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BuckwheatHoney {

	private ArrayList<String> data = new ArrayList<>();
	private ArrayList<Integer> dayTemp = new ArrayList<>();
	private ArrayList<Integer> nightTemp = new ArrayList<>();
	private int days;
	private int goodDays = 0;
	private int badDays = 0;
	private int honey = 0;
	private double vid = 0;

	public void readFromFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		try {
			String line = br.readLine();

			while (line != null) {
				data.add(line);
				line = br.readLine();
			}
		} finally {
			br.close();
		}
	}

	public void processData() {
		days = Integer.valueOf(data.get(0));
		for (String i : data) {
			String[] numbers = i.split(" ");
			if (numbers[0].equals("1")) {
				dayTemp.add(Integer.valueOf(numbers[1]));
				nightTemp.add(Integer.valueOf(numbers[2]));
			} else if (numbers[0].equals("0")) {
				badDays++;
			}
		}
	}

	public void doTheMagic() {
		for (int i = 0; i < dayTemp.size(); i++) {
			if ((dayTemp.get(i) >= 21 && dayTemp.get(i) <= 25) && (nightTemp.get(i) >= 14 && nightTemp.get(i) <= 16)) {
				goodDays++;
				honey = honey + 3;
			} else if (dayTemp.get(i) > 25 && nightTemp.get(i) > 16) {
				honey = honey + 1;
			} else if (dayTemp.get(i) < 21 && nightTemp.get(i) <= 14) {
				honey = honey + 2;

			}
		}

		vid = (double) honey / (double) days;
	}

	public void writeToFile() {
		try {
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
			writer.println("Per " + days + " dienu bites sunese " + honey + " kg. medaus.");
			writer.println("Lietingu dienu kiekis: " + badDays);
			writer.println("Medunesiui palankiu dienu kiekis: " + goodDays);
			writer.println("Vidutiniskai bites per diena prinese " + vid + " kg. medaus");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
