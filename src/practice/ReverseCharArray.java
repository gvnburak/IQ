package practice;

public class ReverseCharArray {
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        System.out.println(arr);
        reverse(arr);
        System.out.println(arr);
    }

    public static void reverse(char[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
