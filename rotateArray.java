import java.io.*;
import java.util.*;

public class rotateArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
  
  public static void reverse(int s, int e, int[] arr){
      int start=s;
      int end=e;
      
      while(start<end){
          int temp=arr[start];
          arr[start]= arr[end];
          arr[end]=temp;
          start++;
          end--;
      }
  }

  public static void rotate(int[] a, int k){
    k=k%a.length;
    if(k<0)
        k=k+a.length;
    reverse(0,a.length-1,a);
    reverse(0,k-1,a);
    reverse(k,a.length-1,a);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}