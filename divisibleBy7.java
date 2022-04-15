public class divisibleBy7 {
    public static void main(String[] args){
        int num = 77;
        System.out.println(isDivisibleBy7(num));
    }

    static boolean isDivisibleBy7(int num){
        if(num < 0){
            return isDivisibleBy7(-num);
        }
        if(num == 0 || num == 7){
            return true;
        }
        
        if( num < 10){
            return false;
        }
         return isDivisibleBy7(num / 10 - 2 * ( num - num / 10 * 10 ));
    }
}
