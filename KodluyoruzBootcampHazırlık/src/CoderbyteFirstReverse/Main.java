package CoderbyteFirstReverse;
import java.util.*; 
import java.io.*;
/**
*
*@author Havva Nur TEKÝN
*
*FirstReverse fonksiyonuna giren Stringi ters çeviren kod.
*
*
*/
class Main {

  public static String FirstReverse(String str) {
    // code goes here  
    if(str.isEmpty()){//girilen parametre dolu mu boþ mu kontrol
      return str;
    }
    StringBuffer buf = new StringBuffer();//StringBuffer oluþtur
    buf.append(str);//parametre olan stringi StringBuffer'a dönüþtür
    buf.reverse();//StringBuffer'ý ters çevir
    str = buf.toString();//ters dönmüþ bufferý tekrar String yap
    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }

}