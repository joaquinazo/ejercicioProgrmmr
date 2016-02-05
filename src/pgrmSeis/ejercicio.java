package pgrmSeis;

import java.util.Scanner;
import java.util.Stack;

class ejercicio{

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int rnum=0;

        System.out.println("Enter the number:");
        int num=scanner.nextInt();

        ///{write you code here

        String str2 = "";
        Stack<Character> stack = new Stack<Character>();
        String str = "" + num;
        for (int i = 0; i <str.length() ; i++) {
            stack.push(str.charAt(i));

        }
        while (!stack.empty()){
            str2 += stack.pop();
        }
        rnum = Integer.parseInt(str2);
        System.out.println(rnum);







        ///}

  //System.out.println("Reverse is :"+rnum);
    }

}

