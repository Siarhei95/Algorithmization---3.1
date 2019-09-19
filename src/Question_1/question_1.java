package Question_1;
import java.util.ArrayList;
import  java.util.Scanner;
import  java.util.Arrays;

public class question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int n = scanner.nextInt();
        System.out.print("Enter the size of second array: ");
        int m = scanner.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[m];
        System.out.print("Enter an index to insert an array from 1 to " + (n - 1) + " k = ");
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            a1[i] = i + 1;
            System.out.println(a1[i]);
        }
        for (int i = 0; i < m; i++) {
            a2[i] = n + i + 1;
            System.out.println(a2[i]);
        }
        for (int i = k; i < n; i++) {
            a1[i] = i + 1;
            System.out.println(a1[i]);
        }
    }
}









//1)   //int c[] = new int[m+n];
      //  System.arraycopy(a1, 0, c, 0, a1.length);
       // System.arraycopy(a2, 0, c, a1.length, a2.length);

         //   System.out.println(Arrays.toString(c));  // merged array
//}










































            //for(int i=1; i<m; i++) {
            //    n=n+1;
            ////    for (int j = n; j < k + 1 + i; j--) {
             //       a1[j] = a1[j - 1];
              //      a1[k + i] = a2[i];//на свободное место пишем элемент второго массива

            //}








