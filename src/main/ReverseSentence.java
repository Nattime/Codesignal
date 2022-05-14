package main;

public class ReverseSentence{
    String solution(String sentence){
        String[] arr = sentence.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--){
            str.append(arr[i] + " ");
        }
        return str.toString().trim();
    }
}
