package misc;

public class FrequencyOfString {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'H') {
                count++;
            }
        }
        System.out.println(count);
    }
}
