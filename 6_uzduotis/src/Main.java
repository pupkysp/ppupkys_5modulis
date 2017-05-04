import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Kada autobusas isvyko is Vilniaus? ");
		int vi = reader.nextInt();
		int mi = reader.nextInt();
		System.out.println("Kiek laiko autobusas vaziavo is Vilniaus i Panevezi? ");
		int vp = reader.nextInt();
		int mp = reader.nextInt();
		System.out.println("Kelias minutes autobusas stovejo Panevezyje?");
		int ms = reader.nextInt();
		System.out.println("Kiek laiko autobusas vaziavo is Panevezio i Ryga?");
		int vr = reader.nextInt();
		int mr = reader.nextInt();
		reader.close();
		
		int vt = vi + vp + vr;
		int mt = mi + mp + ms + mr;

		if(mt >= 60){
			mt = mt - 60;
			vt= vt + 1;
		}
		if(vt >= 24){
			vt = vt - 24;
		}
		System.out.println("Autobusas i Ryga atvyks: " + vt + " val. " + mt + " min.");

	}

}
