package Interview;

import java.util.Arrays;
import java.util.TreeSet;

public class STRINGsameLetters {

    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex:  same("abc",  "cab"); -> true
    //     same("abc",  "abb"); -> false:

    public static void main(String[] args) {

        System.out.println(Same("abc", "abb"));

    }


    public static boolean Same(String str1, String str2) {

        str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );

        str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );

        return  str1.equals(str2);

    }


}
