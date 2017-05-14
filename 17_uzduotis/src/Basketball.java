import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basketball {
	private List<String> data = new ArrayList<>();
	private String team1;
	private String team2;
	private int team1points;
	private int team2points;
	private int maxPoints;
	private int index;
	private List<String> players = new ArrayList<>();
	private List<Integer> points = new ArrayList<>();

	public void readFromFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Teams.txt"));
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
		team1 = data.get(0);
		team2 = data.get(6);
		for (int i = 1; i < data.size(); i++) {
			String[] d = data.get(i).split(" ");
			if (d.length != 1) {
				players.add(d[0]);
				points.add((Integer.valueOf(d[1]) * 1) + (Integer.valueOf(d[2]) * 2));
			}
		}
	}

	public void doTheMagic() {
		for (int i = 0; i <= 4; i++) {
			team1points = team1points + points.get(i);
		}
		for (int i = 5; i <= 9; i++) {
			team2points = team2points + points.get(i);
		}
		for (Integer i : points) {
			if (Collections.max(points) == i) {
				maxPoints = i;
			}
		}
		index = points.indexOf(maxPoints);
	}
	
	public void print(){
		System.out.println("Komanda: " + team1);
		System.out.println("Imete " + team1points + " tasku");
		System.out.println("Vidutiniskai zaidejas pelne " + (double) team1points / 5 + " tasku");
		System.out.println("Komanda: " + team2);
		System.out.println("Imete " + team2points + " tasku");
		System.out.println("Vidutiniskai zaidejas pelne " + (double) team2points / 5 + " tasku");
		if(team1points > team2points){
			System.out.println("Laimejo komanda " + team1);
		}else if(team2points > team1points){
			System.out.println("Laimejo komanda " + team2);
		} else {
			System.out.println("Varzybos baigesi lygiosiomis");
		}
		System.out.println("Rezultatyviausias zaidejas buvo: " + players.get(index) + ", pelne " + points.get(index) + " tasku");
	}
}
