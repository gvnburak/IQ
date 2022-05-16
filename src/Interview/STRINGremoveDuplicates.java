package Interview;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class STRINGremoveDuplicates {

    //Write a return method that can remove the duplicated values from String
    //Ex:  removeDup("AAABBBCCC")  ==> ABC

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));

    }


    public static String removeDuplicates(String str) {

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

        str = str.replace(", " ,  "" ).replace("[","").replace("]","");

        return  str;

    }


}
