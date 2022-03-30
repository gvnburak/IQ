package misc;

public class FindTheUnique {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,134};
        int unique = findUnique(arr);
        System.out.println(unique);
    }

    public static int findUnique(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }
}
