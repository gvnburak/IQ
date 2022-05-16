package Interview;

import java.util.Arrays;
import java.util.Collections;

public class STRINGfrequencyOfCharacters {
    //Write a return method that can find the frequency of characters
    //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {
        System.out.println(frequency("AAABBCDD"));

    }

    public static String frequency(String str) {
        String nonDup="";
        String result="";

        for(int i=0; i < str.length(); i++)

            if(! nonDup.contains(""+str.charAt(i)))

                nonDup += ""+str.charAt(i);

        for(int i=0; i < nonDup.length(); i++) {

            int num = Collections.frequency(Arrays.asList(str.split("")),""+nonDup.charAt(i));

            result += ""+nonDup.charAt(i) + num;
        }
        return result;
    }
}
