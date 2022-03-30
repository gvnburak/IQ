package practice;

public class RemoveSpaces {
    public static String remove(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(remove("Hello World"));
        System.out.println(remove("Hello World "));
        System.out.println(remove(" Hello World"));
        System.out.println(remove(" Hello World "));
    }
}
