import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class RainFall {
	
	private ArrayList<Integer> data = new ArrayList<>();
	private int hours;
	private int min;
	private int minIndex;
	private int max;
	private int maxIndex;
	private int sum;
	private double avg;
	DecimalFormat df = new DecimalFormat("##.##");

	public void readFromFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		try {
			String line = br.readLine();

			while (line != null) {
				data.add(Integer.valueOf(line));
				line = br.readLine();
			}
		} finally {
			br.close();
		}
	}
	
	public void doTheMagic(){
		hours = data.get(0);
		maxValueAndIndex(data);
		minValueAndIndex(data);
		for(int i = 1; i < data.size(); i++){
			sum = sum + data.get(i);
		}
		avg = (double) sum / (double) hours;
	}
	
	private void maxValueAndIndex(ArrayList<Integer> arr){
	    int MaxVal = arr.get(1);
	    int indexOfMax = 1;
	    for (int i = 1; i < arr.size(); i++) {
	        if(arr.get(i) > MaxVal ){
	            MaxVal = arr.get(i);
	            indexOfMax = i;
	        }
	    } 
	    max = MaxVal;
	    maxIndex = indexOfMax;
	}
	
	private void minValueAndIndex(ArrayList<Integer> arr){
	    int MaxVal = arr.get(1);
	    int indexOfMax = 1;
	    for (int i = 1; i < arr.size(); i++) {
	        if(arr.get(i) < MaxVal ){
	            MaxVal = arr.get(i);
	            indexOfMax = i;
	        }
	    } 
	    min = MaxVal;
	    minIndex = indexOfMax;
	}
	
	public void writeToFile() {
		try {
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
			writer.println("Liuties metu iskrito " + sum + " mm krituliu");
			writer.println("Daugiausiai krituliu iskrito " + max + " mm per " + maxIndex + " liuties valanda");
			writer.println("Maziausia krituliu iskrito " + min + " mm per " + minIndex + " liuties valanda");
			writer.println("Vidutiniskai per valanda iskrito " + df.format(avg) + " mm krituliu");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
