package main;

public class FareEstimator{
    double[] solution(int ride_time, int ride_distance, double[] cost_per_minute, double[] cost_per_mile){
        double[] ret = new double[cost_per_mile.length];
        for(int i = 0; i < cost_per_mile.length; i++){
            ret[i] = (ride_time * cost_per_minute[i] + ride_distance * cost_per_mile[i]);
        }
        return ret;
    }
}
