package CoderbytePalindrome;

import java.util.*; 
import java.io.*;
/**
*@author Havva Nur TEK�N
*
*String'i ters �evirip tersi ile d�z�n� k�yaslayan kod.
*StringBuffer kullanarak
*/
class Main {

  public static String Palindrome(String str) {
    // code goes here 
    String result = "";
       if(!str.isEmpty()){ //String in bo� olup olmad���n� kontrol eder
        String yeniStr = str.replace(" ","");//String i�erisinde bo�luk varsa kald�r�r
        //StringBuffer ile stringin d�z�n� ve tersini tutmas� i�in iki buffer olu�tururlur.
        StringBuffer buf = new StringBuffer();
        StringBuffer tersBuf = new StringBuffer();
        //yeniStr iki buffera da atan�r
        tersBuf.append(yeniStr);
        buf.append(yeniStr);
        //bir buffer ters d�nd�r�l�r
        buf.reverse();
        //tersBuf ve buf k�yaslan�r
        if(tersBuf.compareTo(buf)==0){//e�er tersi ve d�z� ayn� ise 0 d�nd�r�r
          result = "true";
        }
        else{//e�er tersi ve d�z� farkl� ise 
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