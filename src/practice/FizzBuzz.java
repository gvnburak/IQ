package practice;

public class FizzBuzz {
    //write a method which finds numbers divisible by 3 and 5
    //if a number divisible by 3 print fizz
    //if a number divisible by 5 print buzz
    //if a number divisible by 3 and 5 print fizzbuzz
    //if a number is not divisible by 3 or 5 print the number


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (numbers[i] % 3 == 0) {
                System.out.println("fizz");
            } else if (numbers[i] % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(numbers[i]);
            }
        }
    }
}
