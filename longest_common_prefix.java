public class longest_common_prefix {
    public static void main(String[] args){
        String[] str = {"anjkli", "pnjklip", "aknj"};
        int n = str.length;
        System.out.println(Commonprefix(str, n));

    }

    static String Commonprefix(String[] str, int n){
        String prefix = str[0];
        for(int i = 1; i<n; i++){
            prefix = CommonprefixUntil(prefix, str[i]);
        }
        if(!prefix.isEmpty()){
            return prefix;
        }
        else{
            return "-1";
        }
        

    }

    static String CommonprefixUntil(String s1, String s2){

        int n1=s1.length();
        int n2 = s2.length();
        int i,j;
        String result = "";
        for( i = 0,j = 0; i < n1 && j < n2; i++,j++ ){
            if(s1.charAt(i) != s2.charAt(j)){
                break;
            }
            result += s1.charAt(i);

        }
        return result;

    }
}
