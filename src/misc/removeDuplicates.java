package misc;

public class removeDuplicates {
    //remove duplicates from a given string
    public static void main(String[] args) {
        String str = "abcdabcd";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {
    String nonDuplicate = "";
        for (int i = 0; i < str.length(); i++) {
            for(int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    nonDuplicate+= str.charAt(i);
                }
            }

        }return nonDuplicate;
    }
}

