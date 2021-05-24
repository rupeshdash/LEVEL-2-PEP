import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class wordKselection4 {
    
    
    public static void wordK(String str, HashMap<Character, Integer> fmap , int k , String asf, int last ){
        
        if(k==0){
            System.out.println(asf);
            return;
        }
        
        for(int i=last == -1 ? 0 : last; i<str.length(); i++){
            char ch = str.charAt(i);
            if(fmap.get(ch)>0){
                fmap.put(ch,fmap.get(ch)-1);
                wordK(str,fmap,k-1,asf+ch,i);
                fmap.put(ch,fmap.get(ch)+1);
            }
            
            
        }
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
    
    wordK(ustr,unique,k,"",-1);
    
    

    
  }
}
