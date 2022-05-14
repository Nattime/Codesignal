package main;

public class MirrorBits{
    int solution(int a){
        int ret = 0;
        while(a > 0){
            ret <<= 1;
            ret = ret | (a & 1);
            a >>= 1;
        }
        return ret;
    }
}
