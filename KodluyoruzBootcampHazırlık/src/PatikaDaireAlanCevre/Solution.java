/**
 * 
 */
package PatikaDaireAlanCevre;
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
		double pi = 3.14;
		double alan1, alan2, cevre;
		System.out.println("Lütfen alanýný ve çevresini öðrenmek istediðiniz dairenin yarýçapýný giriniz:");
		double r = sc.nextDouble();
		System.out.println("Lütfen alanýný öðrenmek istediðiniz daire diliminin merkez açýsýný giriniz:");
		double a = sc.nextDouble();
		alan1 = pi*r*r;
		cevre = 2*pi*r;
		alan2 = (pi*r*r*a)/360;
		System.out.print("Alan 1 (pi*r*r): "+alan1+"\n");
		System.out.print("Alan 2 ((pi*r*r*a)/360): "+alan2+"\n");
		System.out.print("Çevre (2*pi*r): "+cevre+"\n");
	}

}
