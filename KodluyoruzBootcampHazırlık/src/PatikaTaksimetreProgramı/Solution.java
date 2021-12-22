/**
 * 
 */
package PatikaTaksimetreProgramý;
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
		Scanner sc = new Scanner(System.in);
		double km;
		double acilis = 10.0;
		double kmperprice = 2.20;
		double totalPrice = 20.0;
		System.out.println("Lütfen gideceðiniz km'yi giriniz:");
		km = sc.nextDouble();
		if(km*kmperprice+acilis < totalPrice) {
			System.out.println("Ödenecek tutar: "+totalPrice);
		}else {
			totalPrice = km*kmperprice+acilis;
			System.out.println("Ödenecek tutar: "+totalPrice);
		}
	}

}
