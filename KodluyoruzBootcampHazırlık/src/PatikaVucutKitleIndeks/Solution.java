/**
 * 
 */
package PatikaVucutKitleIndeks;
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
		double kilo, boy, vki;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		boy = sc.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz : ");
		kilo = sc.nextDouble();
		vki = kilo/(boy*boy);
		System.out.println("Vücut Kitle Ýndeksiniz : "+vki);
	}

}
