import java.io.*;
import java.util.*;

public class wordKselection3 {

  public static void wordK(String str, int k,  HashMap<Character, Integer> unique, int cc,int ssf, String asf){
      if(k<0){
          return;
      }
      if(cc==str.length()){
          if(k==0){
              System.out.println(asf);
              
          }
          
          return;
      }
      
     char ch = str.charAt(cc);
     
    //  for(int i = unique.get(ch); i >= 0; i--){
    //       String s = "";
    //       for(int j = 1; j <= i; j++){
    //           s += ch;
    //       }
    //       wordK(str,k-i,unique,cc+1,ssf,asf+s);
    //   }
    
    if(unique.get(ch)>0){
        unique.put(ch,unique.get(ch)-1);
        wordK(str,k-1,unique,cc,ssf,asf+ch);
        unique.put(ch, unique.get(ch) + 1);
    }
     wordK(str,k,unique,cc+1,ssf,asf);
    
     
    
     
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashMap<Character, Integer> unique = new HashMap<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.containsKey(ch) == false) {
        unique.put(ch, 1);
        ustr += ch;
      } else {
        unique.put(ch, unique.get(ch) + 1);
      }
    }

    
    wordK(ustr,k,unique,0,0,"");
   
  }

}