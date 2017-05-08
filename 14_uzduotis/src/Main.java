import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		int sum = 0;
		double vid = 0;
		System.out.println("Pirmiegi baige:");
		int p = Integer.parseInt(reader.nextLine());
		for(int i = p; i <= 15; i++){
			System.out.println(i + " min. baige:");
			a.add(reader.nextInt());
		}
		reader.close();
		
		for(Integer i: a){
			sum = sum + i;
		}
		
		vid = sum / (15 - p);
		Double dv = vid;
		Integer v = dv.intValue();
		
		System.out.println("Testa rase " + sum + " mokiniai");
		System.out.println(p + "-ta minute baige " + a.get(0) + " mokinys(-iai)");
		System.out.println("Paskutine minute baige " + a.get(a.size() - 1) + " mokinys(iai)");
		System.out.println("Vidutiniskai per minute baige " + v + " mokiniai");

	}

}
