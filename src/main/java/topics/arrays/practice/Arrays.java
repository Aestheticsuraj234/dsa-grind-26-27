package topics.arrays.practice;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int arr[];

        // arr = new int[5];

        // int brr[] = {1, 2, 3, 4, 5};

        // System.out.println("Value at 0 index ");
        // System.out.println(brr[0]);
        // System.out.println(brr[1]);
        // System.out.println(brr[2]);
        // System.out.println(brr[3]);
        

        // for(int i = 0; i <brr.length -1; i++){
        //     System.out.println(brr[i]);
        // }

        // for(int val:brr){
        //     System.out.println(val);
        // }

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
 for(int i =0; i<=arr.length -1; i++){
    System.out.println("Enter the value at " + i + " index");
    arr[i] = sc.nextInt();
 }

 for(int val:arr){
    System.out.println(val);
 }
        
    }
}
