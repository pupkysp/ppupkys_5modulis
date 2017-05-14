import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teleloto {
	private List<String> data = new ArrayList<>();
	private List<Integer> spendMoney = new ArrayList<>();
	private List<Integer> winMoney = new ArrayList<>();
	private int spend = 0;
	private int win;
	private int maxWin;
	private int tickets;
	private int profit;
	private int loss;

	public void readFromFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Data.txt"));
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
		for (String i : data) {
			String[] numbers = i.split(" ");
			if (numbers.length != 1) {
				spendMoney.add(Integer.valueOf(numbers[0]));
				winMoney.add(Integer.valueOf(numbers[1]));
			}
		}
	}

	public void doTheMagic() {
		for (Integer i : spendMoney) {
			spend = spend + i;
		}
		for (Integer i : winMoney) {
			win = win + i;
		}
		maxWin = Collections.max(winMoney);
		profit = win - spend;
		loss = spend - win;
		tickets = spend;
	}
	
	public void writeToFile() {
		try {
			PrintWriter writer = new PrintWriter("Result.txt", "UTF-8");
			writer.println(spend + " €" + " " + win + " €");
			writer.println("Didziausias laimejimas " + maxWin + " €");
			writer.println("Petras pirko " + tickets + " bilietus");
			if(spend > win){
				writer.println("Nuostolis " + loss + " €");
			} else if(win > spend){
				writer.println("Pelnas " + profit + " €");
			} else {
				writer.println("Lygiosios");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
