package main;

import java.util.PriorityQueue;

public class SortByHeight{
    int[] solution(int[] a){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int iter : a){
            if(iter != -1)
                pq.add(iter);
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] != -1){
                a[i] = pq.poll();
            }
        }
        return a;
    }
}
