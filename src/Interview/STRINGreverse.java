package Interview;

public class STRINGreverse {

    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
        System.out.println(Reverse("ABCD"));

    }


    public  static String  Reverse(String str) {

        return new StringBuffer(str).reverse().toString();

    }

    public static String reverse(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }

}
