/**
 * 
 */
package PatikaUcgen;
import java.util.*;
/**
 * @author Havva Nur TEK�N
 *
 */
public class DikUcgenHipotenus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.println("L�tfen dik ��genin dik kenar uzunlukar�n� giriniz.");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = Math.sqrt((Math.pow(a, 2)+Math.pow(b, 2)));
		System.out.println("Hipoten�s uzunlu�u: "+c);

	}

}
