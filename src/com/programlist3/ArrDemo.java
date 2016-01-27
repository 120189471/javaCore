package programlist3;

import java.util.Arrays;

/**
 * Created by Dix on 2015/12/14.
 */
public class ArrDemo {
    public static void main(String[] args) {
        int[] arr=new int[100];

        for (int x = 0;x<100;x++){
            arr[x] = x;
        }
        int[] luckNumbers = arr;
        int[] arr2= new int[50];
        int[] arr3=new int [103];

        arr2=Arrays.copyOf(luckNumbers,luckNumbers.length);
        arr3=Arrays.copyOf(luckNumbers,luckNumbers.length);

        System.out.println("arr:"+Arrays.toString(arr));
        System.out.println("luckNumbers; "+Arrays.toString(luckNumbers));
        System.out.println("arr2: "+Arrays.toString(arr2));
        System.out.println("arr3: "+Arrays.toString(arr3));
        System.out.println("___________________________________");



    }
}
