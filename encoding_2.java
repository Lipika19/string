public class encoding_2 {
    public static void main(String[] args){
        int num = 56;
        convertedToHex(num);
    }

    static void convertedToHex(int num){
        StringBuilder temp = new StringBuilder();
        while(num!=0){
            int rem = num/16;
            char c;
            if(rem < 10){
                c = (char)(rem + 48);
                System.out.println(c);
            }
            else{
                c = (char)(rem+87);
                System.out.println(c);
            }
            temp.append(c);
            num = num/10;
            
        }
    }
}
