import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Teleloto t = new Teleloto();
		
		t.readFromFile();
		t.processData();
		t.doTheMagic();
		t.writeToFile();

	}

}
