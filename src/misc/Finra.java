package misc;

public class Finra {
    //write a method that finds number divisible by 5
    //if number is divisible by 5, print "fin"
    //if number is divisible by 3, print "ra"
    //if number is divisible by both 5 and 3, print "finra"
    //if number is not divisible by 5 or 3, print number
    public static void finra(int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("finra");
        } else if (number % 5 == 0) {
            System.out.println("fin");
        } else if (number % 3 == 0) {
            System.out.println("ra");
        } else {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        finra(5);
        finra(3);
        finra(15);
        finra(7);
        finra(9);
    }
}

