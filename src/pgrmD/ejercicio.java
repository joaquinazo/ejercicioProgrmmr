package pgrmD;

import java.io.*;
import java.util.LinkedList;
import java.util.*;

class ejercicio {

    public static void main(String args[]) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String newstr = "";
        char ch = ' ';

        System.out.println("Enter the Word:");
        String str = br.readLine();

        ///{write your code here

        LinkedList<Character> lk = new LinkedList<Character>();

        for (int i = 0; i < str.length(); i++) {

            lk.add(str.charAt(i));
        }




        System.out.println(lk);



        ///}

       // System.out.println("Edited Word:" + newstr);
    }

} 