package babarsheet;

import javafx.util.Pair;

public class Max_MinArray2 {
    public static void main(String[] args) {
        Integer arr[]={1,3,4,6,78,9,6};
        Pair<Integer,Integer> minMax=minMax(arr);
        System.out.println("min  == " + minMax.getKey()  +"&&&   max  == "+minMax.getValue());
    }

    private static Pair<Integer, Integer> minMax(Integer[] arr) {
        Pair<Integer,Integer> minMax=new Pair<Integer,Integer>(arr[0],arr[0]);
        if(arr.length==1){
            return minMax;
        }
        Integer min=0;
        Integer max=0;
        if(arr[0]>arr[1]){
            min=arr[1];
            max=arr[0];
        }else{
            min=arr[0];
            max=arr[1];
        }
        for(int i=2 ;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }

        }
        return new Pair<>(min,max);
    }
}
