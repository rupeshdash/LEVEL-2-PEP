import java.util.*;

public class wordKselection1 {
     
    public static void wordK(String str, int k,int cc,int ssf, String asf){
        if (cc == str.length()) {
             if(ssf == k){
               System.out.println(asf);
             }
           return;
       }
       
       
       wordK(str,k,cc+1,ssf+1,asf+str.charAt(cc));
       wordK(str,k,cc+1,ssf+0,asf+"");
       
   }

 public static void main(String[] args) throws Exception {
   
   Scanner scan = new Scanner(System.in);
   String str = scan.next();
   int k = scan.nextInt();
   String temp = "";
   HashSet<Character> map = new HashSet<>();
   for(int i=0; i<str.length(); i++){
       char c = str.charAt(i);
           
       if(map.contains(c)){
           
           
       }else{
           temp+=c;
           map.add(c);
       }
   }

 
   
   
   
   
   wordK(temp,k,0,0,"");
   scan.close();
 }
}
