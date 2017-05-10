import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		BuckwheatHoney bh = new BuckwheatHoney();
		bh.readFromFile();
		bh.processData();
		bh.doTheMagic();
		bh.writeToFile();
	}
}
