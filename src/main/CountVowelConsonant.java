package main;

public class CountVowelConsonant{
    int solution(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sum++;
            }else{
                sum += 2;
            }
        }
        return sum;
    }
}
