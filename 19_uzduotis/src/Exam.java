import java.util.Scanner;

public class Exam {
	Scanner reader = new Scanner(System.in);
	private double examTopics;
	private double learnedTopics;
	private int daysUntilExam;
	private int daysToLearn;
	private int daysToRecur;

	public void collectInfo() {
		System.out.println("Iveskite egzamino temu skaiciu");
		examTopics = Integer.parseInt(reader.nextLine());
		System.out.println("Iveskite kiek egzamino temu ismoks per diena");
		learnedTopics = Integer.parseInt(reader.nextLine());
		System.out.println("Iveskite dienu skaiciu iki egzamino");
		daysUntilExam = Integer.parseInt(reader.nextLine());
		reader.close();
	}

	public void calculate() {
		daysToLearn = (int) Math.ceil(examTopics / learnedTopics);
		daysToRecur = daysUntilExam - daysToLearn;
	}
	
	public void print(){
		if (daysToLearn > daysUntilExam) {
			System.out.println("Visus klausimus ismoks per " + daysToLearn
					+ " dienas, tai uztruks ilgiau nei studentas turi laiko iki egzamino");
			System.out.println("Kartojimui laiko neliks");
			System.out.println("Mokymo plana reikia keisti, nespes ismokti visu egzamino temu");
		} else {
			System.out.println("Visus klausimus ismoks per " + daysToLearn + " dienas");
			if (daysToRecur != 0) {
				System.out.println("Kartojimui liks " + daysToRecur + " diena(-os)");
				System.out.println("Mokymosi planas geras");
			} else {
				System.out.println("Kartojimui laiko neliks");
				System.out.println("Studentas spes pasiruosti egzaminui, bet nespes pasikartoti medziagos");
			}
		}
	}
}
