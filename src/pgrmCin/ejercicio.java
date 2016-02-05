package pgrmCin;

import java.io.*;
import java.util.*;

class ejercicio

{
    public static void main(String a[]) throws Exception {

        int[] arr = new int[8];
        int countOccurrence = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter Number [" + i + "]:");
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter a number which exist in the array:");
        int number = scan.nextInt();
        //write your logic here


        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i : arr) {
            System.out.println(i);
            if (hashMap.get(i) == null) {
                hashMap.put(i, 1);
            } else {
                hashMap.put(i, hashMap.get(i) + 1);
            }


        }
        countOccurrence = hashMap.get(number);

        //end
        System.out.println("Occurrence of " + number + " :");
        System.out.println(countOccurrence);


    }
}

