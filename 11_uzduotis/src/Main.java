import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int bm, vd, pa, bms, vds, pas, tvs, tk, bma, vda, paa;
		System.out.println("Iveskite Belgijos milzinu vados skaiciu:");
		bm = reader.nextInt();
		System.out.println("Iveskite Vokietijos demetoju vados skaiciu:");
		vd = reader.nextInt();
		System.out.println("Iveskite Prancuzijos avinu vados skaiciu:");
		pa = reader.nextInt();
		System.out.println("Iveskite Belgijos milzinu mase kilogramais:");
		bms = reader.nextInt();
		System.out.println("Iveskite Vokietijos demetoju mase kilogramais:");
		vds = reader.nextInt();
		System.out.println("Iveskite Prancuzijos avinu mase kilogramais:");
		pas = reader.nextInt();
		System.out.println("Iveskite triusiu vados vidurki:");
		tvs = reader.nextInt();
		System.out.println("Iveskite triusio kaina:");
		tk = reader.nextInt();
		reader.close();
		
		bma = bm * tvs * tk;
		vda = vd * tvs * tk;
		paa = pa * tvs *tk;
		
		if(bma == vda && vda == paa){
			System.out.println("Auginat bet kuria veisle pelnas bus vienodas");
		}else if(bma ==vda){
			System.out.println("Auginant Belgijos milzinu arba Vokietijos demetuosius veisles, pelnas bus didziausias");
		}else if(vda == paa){
			System.out.println("Auginant Prancuzijos avinus arba Vokietijos demetuosius veisles, pelnas bus didziausias");
		}else if(bma == paa){
			System.out.println("Auginant Belgijos milzinu arba Prancuzijos avinus veisles, pelnas bus didziausias");
		}else if(bma > vda && bma > paa){
			System.out.println("Auginant Belgijos milzinu veisle, pelnas bus didziausias");
		}else if(paa > bma && paa > vda){
			System.out.println("Auginant Prancuzijos avinus veisle, pelnas bus didziausias");
		}else if(vda > bma && vda > paa){
			System.out.println("Auginant Vokietijos demetuosius veisle, pelnas bus didziausias");
		}
		
		if(bms > vds ){
			System.out.println("Didziausi uzauga Belgijos milzinai");
		}else if(vds > pas){
			System.out.println("Didziausi uzauga Vokietijos demetieji");
		} else {
			System.out.println("Didziausi uzauga Prancuzijos avinai");
		}

	}

}
