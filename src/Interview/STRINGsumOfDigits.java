package Interview;

public class STRINGsumOfDigits {

    //Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {

        System.out.println(sumOfDigits("12345"));

    }

    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();

        for(char each: ch) {

            if(Character.isDigit(each)) {

                total += Integer.parseInt(""+each);

            }
        }
        return total;
    }
}
