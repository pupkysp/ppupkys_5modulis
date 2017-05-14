import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Robots {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int[] coordinates = new int[5];
	private String[] commands;

	public void readFromFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("robots.txt"));
		try {
			while (true) {
				String line = br.readLine();
				if (line == null || line.equals(null)) {
					break;
				}
				String[] temp = new String[4];
				temp = line.split(" ");
				for (int i = 0; i < temp.length; i++) {
					coordinates[i] = Integer.parseInt(temp[i]);
				}
				commands = new String[coordinates[4]];
				line = br.readLine();
				commands = line.split(" ");
				simulation();
			}
		} finally {
			br.close();
		}
	}

	public void simulation() {
		x1 = coordinates[0];
		y1 = coordinates[1];
		x2 = coordinates[2];
		y2 = coordinates[3];

		for (int i = 0; i < commands.length; i++) {
			if (i % 2 == 0) {
				if (commands[i].equalsIgnoreCase("a")) {
					x1--;
				} else if (commands[i].equalsIgnoreCase("p")) {
					x1++;
				} else if (commands[i].equalsIgnoreCase("k")) {
					y1++;
				} else if (commands[i].equalsIgnoreCase("d")) {
					y1--;
				}
			} else if (i % 2 != 0) {
				if (commands[i].equalsIgnoreCase("a")) {
					x2--;
				} else if (commands[i].equalsIgnoreCase("p")) {
					x2++;
				} else if (commands[i].equalsIgnoreCase("k")) {
					y2++;
				} else if (commands[i].equalsIgnoreCase("d")) {
					y2--;
				}
			}
		}
		System.out.print(x1 + " " + x2 + " " + y1 + " " + y2);
		if (x1 == x2 && y1 == y2) {
			System.out.println(" AVARIJA");
		} else {
			System.out.println();
		}
	}
}
