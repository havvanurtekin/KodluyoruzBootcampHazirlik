/**
 * 
 */
package PatikaUcgen;
import java.util.*;
/**
 * @author Havva Nur TEK�N
 *
 */
public class UcgenAlani {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c,alan,u;
		Scanner sc = new Scanner(System.in);
		System.out.println("Alan�n� ��renmek istedi�iniz ��genin 3 kenar�n�n uzunlu�unu giriniz.");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		u = (a+b+c)/2;
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Alan: "+alan);
	}

}
