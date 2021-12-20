/**
 * 
 */
package PatikaNotOrtalamasi;
import java.util.Scanner;
/**
 * @author SAYIN BACI
 *
 *Kullanýcý tarafýndan alýnan notlarýn ortalamasýna göre öðrenci durumunu döndüren kod
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kullanýcýdan ders notlarýný input olarak alma
		Scanner sc = new Scanner(System.in);
		System.out.println("100 üzerinden Türkçe ders notunu giriniz.");
		int turkce = sc.nextInt() ;
		
		System.out.println("100 üzerinden Matematik ders notunu giriniz.");
		int mat = sc.nextInt();
		
		System.out.println("100 üzerinden Fizik ders notunu giriniz.");
		int fizik = sc.nextInt();
		
		System.out.println("100 üzerinden Kimya ders notunu giriniz.");
		int kimya = sc.nextInt();
		
		System.out.println("100 üzerinden Tarih ders notunu giriniz.");
		int tarih = sc.nextInt();
		
		System.out.println("100 üzerinden Müzik ders notunu giriniz.");
		int muzik = sc.nextInt();
		
		int toplam = turkce + mat + fizik + kimya + tarih + muzik ;
		double ort = toplam / 6;
		System.out.println("Ortalama: "+ort);
		String durum = (ort > 60.0) ? "Sýnýfý Geçti." : "Sýnýfta Kaldý"; 
		System.out.println("Durum: "+durum);
	}

}
