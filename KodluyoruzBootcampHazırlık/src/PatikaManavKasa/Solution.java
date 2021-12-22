/**
 * 
 */
package PatikaManavKasa;
import java.util.*;
/**
 * @author Havva Nur TEKÝN
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double armutP = 2.14, elmaP = 3.67, domatesP = 1.11, muzP = 0.95, patlicanP = 5, toplamP; 
		double armutKg, elmaKg, domatesKg, muzKg, patlicanKg; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Armut Kaç Kilo? : ");
		armutKg = sc.nextDouble();
		System.out.print("Elma Kaç Kilo? : ");
		elmaKg = sc.nextDouble();
		System.out.print("Domates Kaç Kilo? : ");
		domatesKg = sc.nextDouble();
		System.out.print("Muz Kaç Kilo? : ");
		muzKg = sc.nextDouble();
		System.out.print("Patlýcan Kaç Kilo? : ");
		patlicanKg = sc.nextDouble();
		toplamP = armutP*armutKg + elmaP*elmaKg + patlicanP*patlicanKg + domatesP*domatesKg + muzP*muzKg;
		System.out.println("Toplam Tutar : "+toplamP+"TL");
	}

}
