package main;

public class PhoneCall{
    int solution(int min1, int min2_10, int min11, int s){
        return s > min2_10 * 9 ? (s - min1 - min2_10 * 9) / min11 + 10 : s / min2_10;
    }
}
