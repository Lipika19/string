public class string_rev {
    public static void main(String[] args){
        String str = "hello world hello programer";
        string_reverse(str);
        reverse_by_word(str);
    }
    
    static void string_reverse(String str){
        char ch[] = str.toCharArray();
        System.out.println(ch);
        String rev = "";
        for(int i = ch.length-1; i >=0; i--){
            rev += ch[i];
        }

        System.out.println(rev);
    }

    static void reverse_by_word(String str){
        String[] word = str.split(" ");
        String output = "";
        for(int i = word.length-1; i>=0; i--){
            output += word[i] + " ";
        }
        System.out.println(output);

    }
}
