import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		RainFall rf = new RainFall();
		rf.readFromFile();
		rf.doTheMagic();
		rf.writeToFile();
	}

}
