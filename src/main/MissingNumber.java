package main;

public class MissingNumber{
    int solution(int[] arr){
        int sum = 0;
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total ^= i + 1;
            sum ^= arr[i];
        }
        return total ^ sum;
    }
}
