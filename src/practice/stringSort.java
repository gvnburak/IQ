package practice;

public class stringSort {
    //write a method to sort a given string by alphabetical order
    public static void main(String[] args) {
        String s = "asjhdjsdbjas";
        System.out.println(s);
        System.out.println(sort(s));
    }

    public static String sort(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                if (c[j] > c[j + 1]) {
                    char temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        return new String(c);
    }
}



