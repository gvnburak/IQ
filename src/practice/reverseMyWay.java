package practice;

public class reverseMyWay {
    public static void main(String[] args) {
        String str="welcome to my reversed method";

        System.out.println(myReversed(str));
    }

    public static String myReversed(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }

    public static String myReversed2(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void printReverse(char[] letters, int size){
        for (int i = letters.length-1; i >= 0 ; i--){
            System.out.print(letters[i]);

    }


    }


}
