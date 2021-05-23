import java.io.*;
import java.util.*;

public class permutation2 {

  public static void permutations(int cb, int tb, int[] items, int ssf, int ts, String asf){
    // write your code here
   if(cb>tb){
       if(ssf==ts){
           System.out.println(asf);
       }
       return;
   }
  
       for(int j=0; j<items.length; j++){
           if(items[j]==0){
               items[j] = cb;
               permutations(cb+1,tb,items,ssf+1,ts,asf+(j+1));
               items[j]=0;
           }
       }
    permutations(cb+1,tb,items,ssf,ts,asf+"0");
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    permutations(1, nboxes, new int[ritems], 0, ritems, "");
  }

}