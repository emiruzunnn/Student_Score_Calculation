import java.util.Scanner;

public class OgrenciOrtalama {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Matematik Notunuzu Giriniz: ");
		double mat = scanner.nextDouble();
		
		System.out.println("Fizik Notunuzu Giriniz: ");
		double fizik = scanner.nextDouble();
		
		System.out.println("Kimya Notunuzu Giriniz: ");
		double kimya = scanner.nextDouble();
		
		System.out.println("Turkce Notunuzu Giriniz: ");
		double turkce = scanner.nextDouble();
		
		System.out.println("Tarih Notunuzu Giriniz: ");
		double tarih = scanner.nextDouble();
		
		System.out.println("Muzik Notunuzu Giriniz: ");
		double muzik = scanner.nextDouble();
		
		double toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		
		double ortalama = (toplam / 6);
		
		if (ortalama < 60) {
			System.out.println("Kaldiniz !!!");
			System.out.println("Ortalamaniz: " + ortalama);
		} else if (ortalama >= 60) {
			System.out.println("Gectiniz !!!!");
			System.out.println("Ortalamaniz: " + ortalama);
		}
		

	}

}
