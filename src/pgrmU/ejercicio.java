package pgrmU;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by Joaquin on 29/1/16.
 */
public class ejercicio {


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Enter the number of integers that will be inserted: ");
        int size = scanner.nextInt();
        System.out.println("Enter some integers to insert to the ArrayList: ");
        while (size-- > 0) {
            // To add an element to the ArrayList
            al.add(scanner.nextInt());
        }
        int max = Integer.MIN_VALUE;

        ///{write your code here

        max = al.get(0);
        for (int num : al){
            max = num;

        }


        ///}

        System.out.println("The largest value: " + max);
    }

}



