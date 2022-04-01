package misc;

public class practice {
    public static void main(String[] args) {
        String str= "corestream";
        System.out.println(reversing(str));
    }

    public static String reversing(String str){
       return new StringBuilder(str).reverse().toString();
    }
}

