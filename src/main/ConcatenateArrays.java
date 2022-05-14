package main;

public class ConcatenateArrays{
    int[] solution(int[] a, int[] b){
        int[] arr = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            arr[i] = a[i];
        }
        for(int i = 0; i < b.length; i++){
            arr[i + a.length] = b[i];
        }
        return arr;
    }
}
