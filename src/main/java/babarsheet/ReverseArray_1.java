package babarsheet;

import java.util.Arrays;

public class ReverseArray_1 {
    public static void main(String[] args) {
     Integer arr[] = {1,2,3,4,5};
       // Integer reversearray[] =reverseArray(arr);
       reverseArrayByRecursion(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static Integer[] reverseArray(Integer[] arr) {
       int len= arr.length-1;
       for(int i=0;i<arr.length/2;i++){
          int temp =arr[i];
          arr[i]= arr[len];
          arr[len]=temp;
          len--;
       }
       return arr;
    }
    private static void reverseArrayByRecursion(Integer[] arr,Integer start,Integer end) {
        if (start >= end) {
            return ;
        }
        Integer temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArrayByRecursion(arr,start+1,end-1);
    }
}
