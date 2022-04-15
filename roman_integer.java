import java.util.HashMap;
import java.util.Map;

public class roman_integer {
    public static void main(String[] args){
        String str = "VII";
        System.out.println(R_I(str));
        R_I(str);

    }

    
    static int R_I(String s){
        // int sum = 0;
        final Map<Character,Integer> roman = new HashMap<Character,Integer>();
        
            roman.put('I',1);
            roman.put('V',5);
            roman.put('X',10);
            roman.put('L',50);
            roman.put('C',100);
            roman.put('D',500);
            roman.put('M',1000);
        
        int n = s.length();
        int res=0;

        // checking conditions
        for(int i = 0; i<n; i++){

            if(i != n-1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))){
                res += roman.get(s.charAt(i+1)) - roman.get(s.charAt(i));
            }

            else{
                res += roman.get(s.charAt(i));
            }
        }
        return res;
    }
}
