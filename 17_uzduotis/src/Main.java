import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Basketball b = new Basketball();
		
		b.readFromFile();
		b.processData();
		b.doTheMagic();
		b.print();
	}

}
