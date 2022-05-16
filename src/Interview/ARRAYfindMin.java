package Interview;

import java.util.Arrays;

public class ARRAYfindMin {

    //Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {

        int[] n = {-13,1,2,3,4,5,6,7,8,9,10};

        System.out.println( minValue( n ) );

    }

    public static int minValue( int[]  n ) {

        Arrays.sort( n );

        return  n [ 0 ];

    }
}
