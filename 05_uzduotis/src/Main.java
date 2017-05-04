import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite saldainiu maiselio kaina:");
		int kaina = Integer.parseInt(reader.nextLine());
		System.out.println("Iveskite pinigu suma skirta saldainiams:");
		int suma = Integer.parseInt(reader.nextLine());
		reader.close();
		
		int kiekis = 0;
		int kuponai = 0;
		int pirkimas = 0;
		int uzKuponus = 0;
		int likutis = 0;
		
		kiekis = suma / kaina;
		kuponai = kiekis;
		
		while(pirkimas < 4){
			if(kuponai >= 3){
				uzKuponus = kuponai / 3;
				kiekis = kiekis + uzKuponus;
				kuponai = uzKuponus;
				likutis = uzKuponus - 3;
				kuponai = kuponai + likutis;
				
			}
			
			pirkimas++;
		}
		
		System.out.println(kiekis);
		
	}

}
