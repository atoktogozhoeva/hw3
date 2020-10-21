package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] myFirstArray = {15.5, 54.4, -45.5, 21.5, -8.55, 56.8, -0.89, 61.2, 12.5, -89.2, 7.32, -188.32, 2.3, -58.6, 44.9};
        int plus = 0;
        double ravno = 0;
        boolean minus = true;
        for (double r : myFirstArray) {
            if (r < 5) {
                minus = true;
                continue;
            } else if (minus && r > 0)
                ravno += r;
            plus++;
        }
        System.out.println(ravno);
        System.out.println(plus);
        System.out.println("среднее арифметическое число " + ravno / plus);
        for (int i = 5; i < myFirstArray.length; i++) {
            double n = myFirstArray[i];
            int a = i - 1;
            while (a >= 0 && n < myFirstArray[a]) {
                myFirstArray[a + 1] = myFirstArray[a];
                a--;
            }
            myFirstArray[a + 1] = n;
        }
        System.out.println(Arrays.toString(myFirstArray));
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}