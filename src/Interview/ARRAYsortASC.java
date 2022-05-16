package Interview;

import java.util.ArrayList;

public class ARRAYsortASC {
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex:
    //            int[] arr = {10, 9, 8, 7};
    //            arr = Sort(arr);         ==>{ 7, 8, 9, 10};
    public static void main(String[] args) {
        int[] arr = {10, 20, 8, 7};
        SortingArrayAsc(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void SortingArrayAsc(int[] arr) {

        ArrayList<Integer> list = new ArrayList();

        for (int each : arr) {

            list.add(each);

        }

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

        for (int i = 0; i < list.size(); i++) {

            arr[i] = list.get(i);

        }

    }
}