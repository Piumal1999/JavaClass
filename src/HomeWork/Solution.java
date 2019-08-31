package HomeWork;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList myList = new ArrayList();

        for(int i=1; i<=n; i++){
            myList.add(input.nextInt());
        }

        int j = input.nextInt();
        String s1 = " ";
        for(int i=0; i<=j; i++){
            s1 = input.nextLine();
            if(s1.equals("Insert")){
                int place = input.nextInt();
                int value = input.nextInt();
                myList.add(place, value);
            }

            if(s1.equals("Delete")){
                int place = input.nextInt();
                myList.remove(place);
            }
        }

        int p = myList.size();
        for(int i = 0; i<p; i++){
            System.out.print(myList.get(i)+" ");
        }


    }
}


