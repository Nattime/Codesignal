package main;

public class FancyRide{
    String solution(int l, double[] fares){
        if(fares[4] * (double)l <= 20.0f){
            return "UberSUV";
        }
        if(fares[3] * (double)l <= 20.0f){
            return "UberBlack";
        }
        if(fares[2] * (double)l <= 20.0f){
            return "UberPlus";
        }
        if(fares[1] * (double)l <= 20.0f){
            return "UberXL";
        }else{
            return "UberX";
        }
    }
}
