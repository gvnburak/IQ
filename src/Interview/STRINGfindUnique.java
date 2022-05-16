package Interview;

import java.util.Arrays;
import java.util.Collections;

public class STRINGfindUnique {

    //Write a return  method that can find the unique characters from the String
    //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

    public static void main(String[] args) {
        System.out.println(Unique("AAABBBCCCDEF"));
    }
    public static String Unique(String str) {
        String result ="";
        for(String each : str.split(""))
            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";
        return result;
    }
}
