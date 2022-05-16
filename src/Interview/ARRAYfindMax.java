package Interview;

import java.util.Arrays;

public class ARRAYfindMax {

    //Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {

        int[]  n = {1,2,3,4,5,6,7,8,9,10,12987391};

        System.out.println( maxValue( n ) );

    }

    public static int maxValue( int[]  n ) {

        Arrays.sort(n);

        return  n[n.length-1];

    }
}
