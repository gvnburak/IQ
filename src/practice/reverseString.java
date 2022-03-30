package practice;

public class reverseString {

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}


