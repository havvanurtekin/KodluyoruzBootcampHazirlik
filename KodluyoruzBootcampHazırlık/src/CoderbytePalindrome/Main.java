package CoderbytePalindrome;

import java.util.*; 
import java.io.*;
/**
*@author Havva Nur TEKÝN
*
*String'i ters çevirip tersi ile düzünü kýyaslayan kod.
*StringBuffer kullanarak
*/
class Main {

  public static String Palindrome(String str) {
    // code goes here 
    String result = "";
       if(!str.isEmpty()){ //String in boþ olup olmadýðýný kontrol eder
        String yeniStr = str.replace(" ","");//String içerisinde boþluk varsa kaldýrýr
        //StringBuffer ile stringin düzünü ve tersini tutmasý için iki buffer oluþtururlur.
        StringBuffer buf = new StringBuffer();
        StringBuffer tersBuf = new StringBuffer();
        //yeniStr iki buffera da atanýr
        tersBuf.append(yeniStr);
        buf.append(yeniStr);
        //bir buffer ters döndürülür
        buf.reverse();
        //tersBuf ve buf kýyaslanýr
        if(tersBuf.compareTo(buf)==0){//eðer tersi ve düzü ayný ise 0 döndürür
          result = "true";
        }
        else{//eðer tersi ve düzü farklý ise 
          result = "false";
        }
       }
      
 
    return result;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(Palindrome(s.nextLine())); 
  }

}