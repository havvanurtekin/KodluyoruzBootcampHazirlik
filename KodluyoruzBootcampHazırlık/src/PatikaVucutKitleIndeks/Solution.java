/**
 * 
 */
package PatikaVucutKitleIndeks;
import java.util.*;
/**
 * @author Havva Nur TEK�N
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
		System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz : ");
		boy = sc.nextDouble();
		System.out.println("L�tfen kilonuzu giriniz : ");
		kilo = sc.nextDouble();
		vki = kilo/(boy*boy);
		System.out.println("V�cut Kitle �ndeksiniz : "+vki);
	}

}
