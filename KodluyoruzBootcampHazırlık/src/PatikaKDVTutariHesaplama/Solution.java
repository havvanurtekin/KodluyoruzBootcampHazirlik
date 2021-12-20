/**
 * 
 */
package PatikaKDVTutariHesaplama;
import java.util.*;
/**
 * @author Havva Nur TEKİN
 *
 *Verilen özelliklere ve kullanıcının girdiği KDV'siz tutara göre KDV hesaplayan kod
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double para = sc.nextDouble();
		
		double KDV = 0;
		
		if(para>1000)
			KDV = (para*8)/100;
		else if(para>0 || para<1000)
			KDV = (para*18)/100;
		
		double KDVpara = para + KDV;
		
		System.out.println("KDV'siz fiyat: "+para+" TL");
		System.out.println("KDV'li fiyat: "+KDVpara+" TL");
		System.out.println("KDV: "+KDV+" TL");
		
	}

}
