package CoderbyteFirstReverse;
import java.util.*; 
import java.io.*;
/**
*
*@author Havva Nur TEK�N
*
*FirstReverse fonksiyonuna giren Stringi ters �eviren kod.
*
*
*/
class Main {

  public static String FirstReverse(String str) {
    // code goes here  
    if(str.isEmpty()){//girilen parametre dolu mu bo� mu kontrol
      return str;
    }
    StringBuffer buf = new StringBuffer();//StringBuffer olu�tur
    buf.append(str);//parametre olan stringi StringBuffer'a d�n��t�r
    buf.reverse();//StringBuffer'� ters �evir
    str = buf.toString();//ters d�nm�� buffer� tekrar String yap
    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }

}