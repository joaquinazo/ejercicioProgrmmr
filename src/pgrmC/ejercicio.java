package pgrmC;

import java.util.*;


public class ejercicio {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

       /*
          Your code goes here

        ArrayList <Integer> arrlist = new ArrayList<>();
        arrlist.add(a);
        arrlist.add(b);
        arrlist.add(c);
        Collections.sort(arrlist);
        */
        TreeSet<Integer> numbers = new TreeSet();

        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        Iterator <Integer> it = numbers.iterator();
        System.out.print("Sorted numbers:"  );
        while (it.hasNext()){
            System.out.print(" "+ it.next());
        }





        // print stats


    }
}

