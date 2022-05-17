package main;

public class RemoveArrayPart{
    int[] solution(int[] inputArray, int l, int r){
        int size = r - l;
        int[] arr = new int[inputArray.length - size - 1];
        int ind = 0;
        for(int i = 0; i < inputArray.length; i++){
            if(i < l || i > r){
                arr[ind++] = inputArray[i];
            }
        }
        return arr;
    }
}
