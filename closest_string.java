public class closest_string {
    
    public static void main(String[] args){
        String[] str = {"piku", "kjyu", "systr","piku","kunda", "lipi"};
        String word1 = "piku";
        String Word2 = "lipi";
        System.out.println(find(str, word1, Word2));

    }

    static int find(String[] str, String word1, String Word2){
        int count=0 ;
        for(int i = 0; i<str.length; i++){
            if(str[i] == word1){
                count = 1;
                for(int j = i+1; j<str.length; j++){
                    if(str[j] == Word2){
                        break;
                    }
                    count++;
                }
            }
        }
        return count;
    }
}
