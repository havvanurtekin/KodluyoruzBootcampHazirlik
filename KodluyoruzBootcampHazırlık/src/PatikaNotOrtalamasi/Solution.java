/**
 * 
 */
package PatikaNotOrtalamasi;
import java.util.Scanner;
/**
 * @author SAYIN BACI
 *
 *Kullan�c� taraf�ndan al�nan notlar�n ortalamas�na g�re ��renci durumunu d�nd�ren kod
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kullan�c�dan ders notlar�n� input olarak alma
		Scanner sc = new Scanner(System.in);
		System.out.println("100 �zerinden T�rk�e ders notunu giriniz.");
		int turkce = sc.nextInt() ;
		
		System.out.println("100 �zerinden Matematik ders notunu giriniz.");
		int mat = sc.nextInt();
		
		System.out.println("100 �zerinden Fizik ders notunu giriniz.");
		int fizik = sc.nextInt();
		
		System.out.println("100 �zerinden Kimya ders notunu giriniz.");
		int kimya = sc.nextInt();
		
		System.out.println("100 �zerinden Tarih ders notunu giriniz.");
		int tarih = sc.nextInt();
		
		System.out.println("100 �zerinden M�zik ders notunu giriniz.");
		int muzik = sc.nextInt();
		
		int toplam = turkce + mat + fizik + kimya + tarih + muzik ;
		double ort = toplam / 6;
		System.out.println("Ortalama: "+ort);
		String durum = (ort > 60.0) ? "S�n�f� Ge�ti." : "S�n�fta Kald�"; 
		System.out.println("Durum: "+durum);
	}

}
