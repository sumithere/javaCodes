import java.io.*;
import java.util.*;

public class barChart {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }

        while(max>0){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }

            
        }
        
            System.out.println();
            max--;
        
    }


    }

}